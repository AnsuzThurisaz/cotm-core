package com.elytradev.fondue.module.obelisk;

import com.elytradev.fondue.Cardinal;
import com.elytradev.fondue.module.Module;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules.ValueType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkGeneratorEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModuleObelisk extends Module {

	public static Block OBELISK_BLOCK;
	public static SoundEvent PULSATING;
	public static SoundEvent ATTUNE;
	
	@Override
	public void onPreInit(FMLPreInitializationEvent e) {
		GameRegistry.register(OBELISK_BLOCK = new BlockObelisk(Material.ROCK, MapColor.BLACK)
				.setLightLevel(0.15f)
				.setBlockUnbreakable()
				.setResistance(4000000)
				.setUnlocalizedName("fondue.obelisk_block")
				.setRegistryName("obelisk_block"));
		GameRegistry.register(PULSATING = new SoundEvent(new ResourceLocation("fondue", "pulsating")).setRegistryName("pulsating"));
		GameRegistry.register(ATTUNE = new SoundEvent(new ResourceLocation("fondue", "attune")).setRegistryName("attune"));
		GameRegistry.registerTileEntity(TileEntityObelisk.class, "fondue:obelisk");
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public void onPopulate(ChunkGeneratorEvent.ReplaceBiomeBlocks e) {
		if (e.getWorld().provider.isSurfaceWorld()) {
			// This is DEFINITELY not a hack. Nope. Not at all.
			GenerateObelisk.generate(e.getX(), e.getZ(), e.getWorld().getSeed(), e.getPrimer());
		}
	}
	
	@SubscribeEvent
	public void onPopulate(PopulateChunkEvent.Pre e) {
		if (e.getWorld().provider.isSurfaceWorld()) {
			GenerateObelisk.populate(e.getChunkX(), e.getChunkZ(), e.getWorld().getSeed(), e.getWorld());
		}
	}
	
	@SubscribeEvent
	public void onSpawnPoint(WorldEvent.CreateSpawnPosition e) {
		int x = 0;
		int z = 0;
		Cardinal dir = Cardinal.WEST;
		int legLength = 0;
		int i = 0;
		int j = 0;
		// scan in a counterclockwise outward spiral from 0, 0
		// i.e. find the closest point to 0, 0 that contains an obelisk
		while (true) {
			if (GenerateObelisk.isObeliskChunk(e.getWorld().getSeed(), x, z)) {
				break;
			}
			if (i >= legLength) {
				dir = dir.ccw();
				i = 0;
				j++;
				if (j % 2 == 0) {
					legLength++;
				}
			}
			x += dir.xOfs();
			z += dir.yOfs();
			i++;
		}
		
		int spawnX = (x*16)+8;
		int spawnZ = (z*16)+10;
		int spawnY = e.getWorld().getChunkFromChunkCoords(x, z).getHeightValue(6, 8);
		
		e.getWorld().getWorldInfo().setSpawn(new BlockPos(spawnX, spawnY, spawnZ));
		e.getWorld().getGameRules().addGameRule("spawnRadius", "0", ValueType.NUMERICAL_VALUE);
		e.setCanceled(true);
	}
}
