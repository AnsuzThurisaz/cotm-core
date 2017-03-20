package com.elytradev.fondue.module.spiritgraves.ai;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

// Horribly mutated Skeleton genes
public class EntityAISeekSun extends EntityAIBase {
	private final EntityCreature el;
	private double exposureX;
	private double exposureY;
	private double exposureZ;
	private final double movementSpeed;
	private final World world;

	public EntityAISeekSun(EntityCreature el, double movementSpeed) {
		this.el = el;
		this.movementSpeed = movementSpeed;
		world = el.world;
		setMutexBits(1);
	}

	@Override
	public boolean shouldExecute() {
		if (world.canSeeSky(new BlockPos(el.posX, el.getEntityBoundingBox().minY, el.posZ))) {
			return false;
		} else {
			Vec3d exposure = findPossibleExposure();

			if (exposure == null) {
				return false;
			} else {
				exposureX = exposure.xCoord;
				exposureY = exposure.yCoord;
				exposureZ = exposure.zCoord;
				return true;
			}
		}
	}

	@Override
	public boolean continueExecuting() {
		BlockPos entityPos = new BlockPos(el.posX, el.getEntityBoundingBox().minY, el.posZ);
		if (world.canSeeSky(entityPos)) {
			// Don't bother to continue if we're already in sunlight
			return false;
		}
		return !el.getNavigator().noPath();
	}

	@Override
	public void startExecuting() {
		el.getNavigator().tryMoveToXYZ(exposureX, exposureY, exposureZ, movementSpeed);
	}

	@Nullable
	private Vec3d findPossibleExposure() {
		Random rand = el.getRNG();
		BlockPos homePos = el.getHomePosition();

		int dist = (int)el.getMaximumHomeDistance();
		
		for (int i = 0; i < 20; ++i) {
			BlockPos chk = homePos.add(rand.nextInt(dist*2)-dist, rand.nextInt(Math.max((int)(world.getSeaLevel()-el.posY)+6, 6))-3, rand.nextInt(dist*2)-dist);
			if (world.canSeeSky(chk)) {
				return new Vec3d(chk.getX(), chk.getY(), chk.getZ());
			}
		}

		return null;
	}
}
