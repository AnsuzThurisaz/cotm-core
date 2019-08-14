@file:GenerateMods(name = "Mod", mc = "1.12.2")
@file:GenerateMods(name = "Mod", mc = "1.12.1")
@file:GenerateMods(name = "Mod", mc = "1.12")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.2")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.1")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12")
@file:GenerateForge(name = "Forge", mc = "1.12.2")

mcVersion = "1.12.2"
title = "Center of the Multiverse"
authors = listOf("AnsuzThuriaz", "Falkreon", "NikkyAi")
version = "2.3.3-testing"
forge = Forge.mc1_12_2.forge_14_23_5_2838
icon = rootDir.resolve("icon.png")
pack {
    skcraft {
        userFiles = UserFiles(
                include = listOf(
                        "options.txt",
                        "quark.cfg",
                        "aether/AetherI.cfg",
                        "akashictome.cfg",
                        "architect/blacklist.json",
                        "architect/block_mapping.json",
                        "architect/item_mapping.json",
                        "architect/whitelist.json",
                        "architect.cfg",
                        "armoryexpansion.cfg",
                        "astralsorcery/aevitas_ore_perk.cfg",
                        "astralsorcery/amulet_enchantments.cfg",
                        "astralsorcery/fluid_rarities.cfg",
                        "astralsorcery/herdable_animals_blacklist.cfg",
                        "astralsorcery/mineralis_ritual.cfg",
                        "astralsorcery/treasure_shrine.cfg",
                        "astralsorcery.cfg",
                        "badwithernocookiereloaded.cfg",
                        "baubles.cfg",
                        "bedrockores/_example.json",
                        "bedrockores.cfg",
                        "betterbuilderswands.cfg",
                        "bibliocraft.cfg",
                        "blockcraftery.cfg",
                        "bloodmagic/bloodmagic.cfg",
                        "bloodmagic/meteors/diamond.json",
                        "bloodmagic/meteors/gold.json",
                        "bloodmagic/meteors/iron.json",
                        "bloodmagic/rituals.cfg",
                        "bookshelf.cfg",
                        "botania.cfg",
                        "cfm.cfg",
                        "chisel.cfg",
                        "chiselsandbits.cfg",
                        "chiselsandbits_clipboard.cfg",
                        "chococraft.cfg",
                        "codechicken/supporters.json",
                        "codechicken/supporters.marker",
                        "codechickenlib.cfg",
                        "cofh/core/client.cfg",
                        "cofh/core/common.cfg",
                        "cofh/core/friends.cfg",
                        "cofh/thermaldynamics/client.cfg",
                        "cofh/thermaldynamics/common.cfg",
                        "cofh/thermaldynamics/cover_blacklist.json",
                        "cofh/thermalexpansion/client.cfg",
                        "cofh/thermalexpansion/common.cfg",
                        "cofh/thermalexpansion/florbs.cfg",
                        "cofh/thermalexpansion/morbs.cfg",
                        "cofh/thermalfoundation/client.cfg",
                        "cofh/thermalfoundation/common.cfg",
                        "cofh/thermalfoundation/lexicon-whitelist.cfg",
                        "cofh/thermalinnovation/client.cfg",
                        "cofh/thermalinnovation/common.cfg",
                        "cofh/world/00_minecraft.json",
                        "cofh/world/01_thermalfoundation_ores.json",
                        "cofh/world/02_thermalfoundation_oil.json",
                        "cofh/world/03_thermalfoundation_clathrates.json",
                        "cofh/world/config.cfg",
                        "colorchat.cfg",
                        "comforts.cfg",
                        "conarm.cfg",
                        "cookingforblockheads.cfg",
                        "corpsecomplex.cfg",
                        "correlated.cfg",
                        "ctm.cfg",
                        "CustomMainMenu/mainmenu.json",
                        "cyberware.cfg",
                        "cyclopscore.cfg",
                        "defaultoptions/options.txt",
                        "defaultoptions/servers.dat",
                        "defaultoptions.cfg",
                        "diamondglass.cfg",
                        "dimdoors.cfg",
                        "disenchanter.cfg",
                        "doggytalents.cfg",
                        "ebwizardry.cfg",
                        "embers.cfg",
                        "endercore/cropconfig.json",
                        "endercore/endercore.cfg",
                        "enderio/EnderIO.cfg",
                        "enderio/enderioconduits.cfg",
                        "enderio/enderiointegrationforestry.cfg",
                        "enderio/enderiomachines.cfg",
                        "enderio/enderiopowertools.cfg",
                        "enderio/painter_paint_sources_core.xml",
                        "enderio/painter_paint_sources_user.xml",
                        "enderio/recipes/aliases.xml",
                        "enderio/recipes/balls.xml",
                        "enderio/recipes/base.xml",
                        "enderio/recipes/capacitor.xml",
                        "enderio/recipes/capacitor_machines.xml",
                        "enderio/recipes/conduits-opencomputers.xml",
                        "enderio/recipes/conduits-refined-storage.xml",
                        "enderio/recipes/conduits.xml",
                        "enderio/recipes/enchanter.xml",
                        "enderio/recipes/examples/broken_spawner.xml",
                        "enderio/recipes/examples/cheap_machines.xml",
                        "enderio/recipes/examples/cheap_materials.xml",
                        "enderio/recipes/examples/cheaty_spawner.xml",
                        "enderio/recipes/examples/conduits_easy_recipes.xml",
                        "enderio/recipes/examples/conduits_hard_recipes.xml",
                        "enderio/recipes/examples/easy_recipes.xml",
                        "enderio/recipes/examples/hard_recipes.xml",
                        "enderio/recipes/examples/infinity.xml",
                        "enderio/recipes/examples/legacy_recipes.xml",
                        "enderio/recipes/examples/machines_easy_recipes.xml",
                        "enderio/recipes/examples/peaceful.xml",
                        "enderio/recipes/examples/powertools_easy_recipes.xml",
                        "enderio/recipes/examples/recipes.xsd",
                        "enderio/recipes/examples/sagmill_dupe_recipe_patches.xml",
                        "enderio/recipes/examples/strict_iron.xml",
                        "enderio/recipes/integration-forestry.xml",
                        "enderio/recipes/integration_railcraft_recipes.xml",
                        "enderio/recipes/items.xml",
                        "enderio/recipes/machines.xml",
                        "enderio/recipes/materials.xml",
                        "enderio/recipes/misc.xml",
                        "enderio/recipes/powertools.xml",
                        "enderio/recipes/recipes.xsd",
                        "enderio/recipes/sagmill.xml",
                        "enderio/recipes/sagmill_metals.xml",
                        "enderio/recipes/sagmill_modded.xml",
                        "enderio/recipes/sagmill_ores.xml",
                        "enderio/recipes/sagmill_silentgems.xml",
                        "enderio/recipes/sagmill_vanilla.xml",
                        "enderio/recipes/sagmill_vanilla2modded.xml",
                        "enderio/recipes/soulbinder.xml",
                        "enderio/recipes/spawner.xml",
                        "enderio/recipes/tank.xml",
                        "enderio/recipes/user/recipes.xsd",
                        "enderio/recipes/user/user_recipes.xml",
                        "enderio/recipes/vat.xml",
                        "enderstorage.cfg",
                        "engination.cfg",
                        "environmentaltech/main.cfg",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_1.json",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_2.json",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_3.json",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_4.json",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_5.json",
                        "environmentaltech/multiblocks/void_miner/botanic/tier_6.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_1.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_2.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_3.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_4.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_5.json",
                        "environmentaltech/multiblocks/void_miner/ore/tier_6.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_1.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_2.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_3.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_4.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_5.json",
                        "environmentaltech/multiblocks/void_miner/resource/tier_6.json",
                        "erebus.cfg",
                        "ErebusEntityDimensions.cfg",
                        "Exchangers.cfg",
                        "extraalchemy.cfg",
                        "extrautils2.cfg",
                        "extra_alchemy_recipes.cfg",
                        "Extreme Reactors/Extreme Reactors.cfg",
                        "fairylights.cfg",
                        "FarmingForBlockheads/Market.json",
                        "farmingforblockheads.cfg",
                        "fastbench.cfg",
                        "fasterladderclimbing.cfg",
                        "fastleafdecay.cfg",
                        "flopper.cfg",
                        "foamfix.cfg",
                        "forestry/apiculture.cfg",
                        "forestry/arboriculture.cfg",
                        "forestry/backpacks.cfg",
                        "forestry/binnie-mods.conf",
                        "forestry/binniecore/main.conf",
                        "forestry/botany/modules.cfg",
                        "forestry/common.cfg",
                        "forestry/crates.cfg",
                        "forestry/extrabees/main.conf",
                        "forestry/extrabees/modules.cfg",
                        "forestry/extratrees/main.cfg",
                        "forestry/extratrees/modules.cfg",
                        "forestry/farm.cfg",
                        "forestry/fluids.cfg",
                        "forestry/gamemodes/EASY.cfg",
                        "forestry/gamemodes/HARD.cfg",
                        "forestry/gamemodes/NORMAL.cfg",
                        "forestry/gamemodes/OP.cfg",
                        "forestry/genetics/main.conf",
                        "forestry/genetics/modules.cfg",
                        "forestry/lepidopterology.cfg",
                        "forestry/modules.cfg",
                        "forge.cfg",
                        "forgeChunkLoading.cfg",
                        "ftblib.cfg",
                        "ftbutilities.cfg",
                        "Galacticraft/chunkloading.conf",
                        "Galacticraft/core.conf",
                        "Galacticraft/miccore.conf",
                        "Galacticraft/planets.conf",
                        "Galacticraft/power-GC3.conf",
                        "gendustry/client.config",
                        "gendustry/readme.txt",
                        "glasshearts.cfg",
                        "grapplingHook.cfg",
                        "Guide-API/Guide-API.cfg",
                        "hammercore.cfg",
                        "harvestcraft.cfg",
                        "harvestcraft_fruittree.cfg",
                        "huntingdim/huntingdim.cfg",
                        "huntingdim/world_generator_settings.json",
                        "ironchest.cfg",
                        "journeymap_ModInfo.cfg",
                        "justenoughdimensions/justenoughdimensions.cfg",
                        "justenoughdimensions.cfg",
                        "kleeslabs.cfg",
                        "librarianlib.cfg",
                        "login_shield.cfg",
                        "lootbags.cfg",
                        "Lootbags_BagConfig.cfg",
                        "machinemuse/missingConfigDoubles.txt",
                        "machinemuse/numina.cfg",
                        "machinemuse/powersuits.cfg",
                        "magicarsenal.cfg",
                        "magicbees.cfg",
                        "malisiscore.cfg",
                        "malisisdoors.cfg",
                        "mcjtylib.cfg",
                        "morepaintings.cfg",
                        "morphtool.cfg",
                        "natura.cfg",
                        "NaturaModules.cfg",
                        "naturescompass.cfg",
                        "NetherEx/Biome Lists/nex_biome_list.json",
                        "NetherEx/Biomes/biomesoplenty/corrupted_sands.json",
                        "NetherEx/Biomes/biomesoplenty/fungi_forest.json",
                        "NetherEx/Biomes/biomesoplenty/phantasmagoric_inferno.json",
                        "NetherEx/Biomes/biomesoplenty/undergarden.json",
                        "NetherEx/Biomes/biomesoplenty/visceral_heap.json",
                        "NetherEx/Biomes/minecraft/hell.json",
                        "NetherEx/Biomes/nex/arctic_abyss.json",
                        "NetherEx/Biomes/nex/fungi_forest.json",
                        "NetherEx/Biomes/nex/ruthless_sands.json",
                        "NetherEx/Biomes/nex/torrid_wasteland.json",
                        "NetherEx/nex.cfg",
                        "NetherEx/Trade Lists/blacksmith_trade_list.json",
                        "NetherEx/Trade Lists/forager_trade_list.json",
                        "NetherEx/Trade Lists/sorcerer_trade_list.json",
                        "NetherEx/Trades/nex/armorsmith.json",
                        "NetherEx/Trades/nex/brewer.json",
                        "NetherEx/Trades/nex/enchanter.json",
                        "NetherEx/Trades/nex/gatherer.json",
                        "NetherEx/Trades/nex/hunter.json",
                        "NetherEx/Trades/nex/scavenger.json",
                        "NetherEx/Trades/nex/toolsmith.json",
                        "nutrition/effects/example.json",
                        "nutrition/effects/mining_fatigue.json",
                        "nutrition/effects/resistance.json",
                        "nutrition/effects/strength.json",
                        "nutrition/effects/toughness.json",
                        "nutrition/effects/weakness.json",
                        "nutrition/nutrients/dairy.json",
                        "nutrition/nutrients/example.json",
                        "nutrition/nutrients/fruit.json",
                        "nutrition/nutrients/grain.json",
                        "nutrition/nutrients/protein.json",
                        "nutrition/nutrients/vegetable.json",
                        "nutrition/nutrition.cfg",
                        "openblocks.cfg",
                        "opencomputers/default.recipes",
                        "opencomputers/gregtech.recipes",
                        "opencomputers/hardmode.recipes",
                        "opencomputers/peaceful.recipes",
                        "opencomputers/settings.conf",
                        "opencomputers/user.recipes",
                        "openmods.cfg",
                        "OpenModsLibCore.json",
                        "OreDictInit.cfg",
                        "outfox.cfg",
                        "packingtape.cfg",
                        "PassthroughSigns.cfg",
                        "peckish.cfg",
                        "pewter/pewter.cfg",
                        "pewter/_example.json",
                        "placebo.cfg",
                        "platforms.cfg",
                        "popcornsmelting.cfg",
                        "portality.cfg",
                        "preston.cfg",
                        "probedataprovider.cfg",
                        "psi.cfg",
                        "quickleafdecay.cfg",
                        "radixcore.cfg",
                        "randompatches.cfg",
                        "randomthings.cfg",
                        "randomtweaks/data.json",
                        "randomtweaks/defaultgamerules.json",
                        "randomtweaks/randomtweaks.cfg",
                        "randomtweaks/sheepcolorweights.json",
                        "rangedpumps.cfg",
                        "reborncore.cfg",
                        "reccomplex.cfg",
                        "recipehandler.cfg",
                        "redstonepaste.cfg",
                        "refinedstorage.cfg",
                        "rftools/dimensions.cfg",
                        "rftools/dimlets.json",
                        "rftools/rftools.cfg",
                        "roguelike_dungeons/roguelike.cfg",
                        "roots.cfg",
                        "sampler.ini",
                        "scannable.cfg",
                        "shetiphiancore.cfg",
                        "simplesponge.cfg",
                        "simplevoidworld.cfg",
                        "spartanshields.cfg",
                        "splash.properties",
                        "storagedrawers.cfg",
                        "storagedrawersextra.cfg",
                        "stygian.cfg",
                        "surge.cfg",
                        "tconstruct.cfg",
                        "teamreborn/configData.nbt",
                        "teamreborn/energy_priority.json",
                        "teamreborn/reborncore/client.cfg",
                        "teamreborn/reborncore/misc.cfg",
                        "teamreborn/reborncore/power.cfg",
                        "teamreborn/reborncore/selected_energy.json",
                        "teamreborn/rebornstorage/config.cfg",
                        "teslacorelib.cfg",
                        "thaumcraft_misc.cfg",
                        "thaumcraft_world.cfg",
                        "thaumictinkerer.cfg",
                        "thebetweenlands/config (no version).cfg.backup",
                        "thebetweenlands/config.cfg",
                        "thebetweenlands/config_version",
                        "theoneprobe.cfg",
                        "thermionics_world.cfg",
                        "TinkerModules.cfg",
                        "TinkerToolLeveling.cfg",
                        "toolbelt.cfg",
                        "torchmaster.cfg",
                        "twilightforest.cfg",
                        "unlimitedchiselworks.cfg",
                        "unlimitedchiselworks_botany.cfg",
                        "valkyrielib/main.cfg",
                        "vc/vc.cfg",
                        "viesmachines.cfg",
                        "wabbity_upsizer.cfg",
                        "waila/theme/dark.json",
                        "waila/theme/vanilla.json",
                        "waila/waila.cfg",
                        "walljump.cfg",
                        "Waystones.cfg",
                        "wearablebackpacks.cfg",
                        "woot/custom_drops.json",
                        "woot/factory_config.json",
                        "woot/factory_ingredients.json",
                        "woot/woot.cfg",
                        "xreliquary.cfg",
                        "yoyos.cfg"
                ),
                exclude = listOf("")
        )
    }
}

pack {
    multimc {
        skPackUrl = "https://centerofthemultiverse.net/launcher/cotm.json"
    }
}
root(CurseProvider) {
    releaseTypes = setOf(FileType.Release, FileType.Beta, FileType.Alpha)
    validMcVersions = setOf("1.12.2", "1.12.1", "1.12")
    list {

        // Vazkii
        +(Mod.akashicTome)
        +(Mod.botania)
        +(Mod.psi)
        +(Mod.quark)
        +(Mod.quarkOddities)
        +(Mod.morphOTool)

        // Sangar
        +(Mod.architect)
//        +(Mod.bedrockores)

        // HellFirePvP
        +(Mod.astralSorcery)

        // Nuchaz
        +(Mod.bibliocraft)

        // chiselTeam
        +(Mod.chisel)

        // AlgorithmX2
        +(Mod.chiselsBits)

        // jaredlll08
        +(Mod.clumps)

        // TheIllusiveC4
        +(Mod.comforts)

        // BlayTheNinth
        +(Mod.cookingForBlockheads)
        +(Mod.farmingForBlockheads)

        // ZLainSama
        +(Mod.cosmeticArmorReworked)

        // copygirl
        +(Mod.wearableBackpacks)

        // mezz
        +(Mod.jei)

        // The_Wabbit
        +(Mod.upsizerMod)

        // Viesis
        +(Mod.viescraftAirships)

        // Team CoFH
        +(Mod.thermalDynamics)
        +(Mod.thermalExpansion)
        +(Mod.thermalInnovation)

        // mcjty
        +(Mod.rftools)
        +(Mod.rftoolsDimensions)
        +(Mod.theOneProbe)

        // Mr_Crayfish
        +(Mod.mrcrayfishFurnitureMod)

        // zabi94
        +(Mod.extraAlchemy)

        // CrazyPants
        +(Mod.enderIo)

        // Subaraki
        +(Mod.paintings)

        // azanor
        +(Mod.thaumcraft)
        +(Mod.baubles)

        // TheRandomLabs
        +(Mod.randomtweaks)
        +(Mod.randompatches)

        // asie
        +(Mod.charsetLib)
        +(Mod.charsetTweaks)
        +(Mod.charsetBlockCarrying)
        +(Mod.charsetTablet)
        +(Mod.charsetCrafting)
        +(Mod.charsetAudio)
        +(Mod.charsetStorageLocks)
        +(Mod.charsetTools)
        +(Mod.charsetpatches)
        +(Mod.charsetImmersion)
        +(Mod.foamfixForMinecraft)
        +(Mod.unlimitedChiselWorks)
        +(Mod.preston)

        // dimms
        +(Mod.atum)
        +(Mod.theLostCities)
        +(Mod.angryPixelTheBetweenlandsMod)
        +(Mod.theAether)
        +(Mod.theErebus)
        +(Mod.dimensionaldoors)
        +(Mod.huntingDimension)
        +(Mod.theTwilightForest)
        +(Mod.simpleVoidWorld)

        // unresolved/stubborn dependencies
        +(Mod.mantle)
        +(Mod.librarianlib)
        +(Mod.shadowfactsForgelin)
        +(Mod.bookshelf)
        +(Mod.placebo)
        +(Mod.shadowfactsForgelin)

        // unsorted mods
        +(Mod.enderStorage18)
        +(Mod.exchangers)
        +(Mod.extraBitManipulation)
        +(Mod.extraUtilities)
        +(Mod.fairyLights)
        +(Mod.ftbUtilities)
        +(Mod.ftblib)
        +(Mod.initialInventory)
        +(Mod.inventoryTweaks)
        +(Mod.metalchests)
        +(Mod.redstonePaste)
        +(Mod.mmmmmmmmmmmm)
        +(Mod.kleeslabs)
        +(Mod.malisisdoors)
        +(Mod.mobGrindingUtils)
        +(Mod.natura)
        +(Mod.naturesCompass)
        +(Mod.netherex)
        +(Mod.netherportalfix)
        +(Mod.stimmedcowNomorerecipeconflict)
        +(Mod.notenoughids)
        +(Mod.opencomputers)
        +(Mod.openblocks)
        +(Mod.pamsHarvestcraft)
        +(Mod.passthroughSigns)
        +(Mod.randomThings)
        +(Mod.rangedPumps)
        +(Mod.recurrentComplex)
        +(Mod.redstoneFlux)
        +(Mod.roguelikeDungeons)
        +(Mod.roots)
        +(Mod.scannable)
        +(Mod.simpleSponge)
        +(Mod.spartanShields)
        +(Mod.storageDrawers)
        +(Mod.storageDrawersExtras)
        +(Mod.tails)
        +(Mod.tinkersConstruct)
        +(Mod.tinkersToolLeveling)
        +(Mod.extremeReactors)
        +(Mod.zerocore)
        +(Mod.toolBelt)
        +(Mod.torchmaster)
        +(Mod.roboticparts)
        +(Mod.woot)
        +(Mod.quickLeafDecay)
        +(Mod.bloodMagic)
        +(Mod.constructsArmory)
        +(Mod.yoyos)
        +(Mod.badWitherNoCookieReloaded)
        +(Mod.waystones)
        +(Mod.corpseComplex)
        +(Mod.thaumcraftInventoryScanning)
        +(Mod.peckish)
        +(Mod.electroblobsWizardry)
        +(Mod.reliquaryV13)
        +(Mod.fastworkbench)
        +(Mod.fastfurnace)
        +(Mod.betterBuildersWands)
        +(Mod.antighost)
        +(Mod.loginShield)
        +(Mod.caliper)
        +(Mod.refinedStorage)
        +(Mod.flopper)
        +(Mod.wallJump)
        +(Mod.magicalMap)
        +(Mod.pewter)
        +(Mod.grapplingHookMod)
        +(Mod.embersRekindled)
        +(Mod.outfox)
        +(Mod.chococraft3)
        +(Mod.portality)
        +(Mod.surge)
        +(Mod.environmentalTech)
        +(Mod.armoryExpansion)
        +(Mod.shadowfactsForgelin)
        +(Mod.rebornstorage)
        +(Mod.theDisenchanterMod)
        +(Mod.doggyTalents)
        +(Mod.snad)
        +(Mod.fluxNetworks)
        +(Mod.refinedStorageAddons)
        +(Mod.compactdrawers)
        +(Mod.blockcraftery)
        +(Mod.modularPowersuits)
        +(Mod.chunkpregenerator)
        +(Mod.colytra)
        +(Mod.architecturecraftTridev)
        +(Mod.draconicEvolution)
        +(Mod.numina)
        +(Mod.futureMc)
        +(Mod.phosphor)
        +(Mod.aiImprovements)
        +(Mod.placebo)
        +(Mod.futureMc)
        +(Mod.actuallyAdditions)
        +(Mod.naturalPledge)
        +(Mod.advancedRocketry)
        +(Mod.bewitchment)
        +(Mod.endMetals)
        +(Mod.netherMetals)
        +(Mod.denseMetals)
        +(Mod.buildingGadgets)
        +(Mod.stevesCartsReborn)
        +(Mod.timberjack)
        +(Mod.culinaryConstruct)
        +(Mod.openmodularturrets)
        +(Mod.hardcoreQuestingMode)
        +(Mod.bedPatch)
        +(Mod.minetweakerRecipemaker)
        +(Mod.crafttweaker)
        +(Mod.modtweaker)
        +(Mod.tweakersConstruct)

        // Pre-Testing / Un-used / Pulled due to issues
        // +(Mod.inControl)
        // +(Mod.justEnoughDimensions)
        // +(Mod.customMainMenu)
        // +(Mod.cathedral) # empty crafting grid causes
        // +(Mod.tropicraft) #fluid registry errors?

        withProvider(DirectProvider).list {
            +"nutrition" configure {
                url = "https://github.com/WesCook/Nutrition/releases/download/v4.4.0/Nutrition-1.12.2-4.4.0.jar"
            }
            +"friendship-bracelet" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/FriendshipBracelet-master-1.1.2.36.jar"
            }
            +"infra-redstone" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/InfraRedstone-1.12.2-1.2.1.114.jar"
            }
            +"thermionics" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/Thermionics-MC1.12.2_ver1.1.4.jar"
            }
            +"thermionics-world" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/ThermionicsWorld-MC1.12.2_ver1.0.2.jar"
            }
            +"magic-arsenal" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/MagicArsenal-MC1.12_ver1.2.6.jar"
            }
            +"engination" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/Engination-MC1.12.2_ver1.07.03.jar"
            }
            +"glass-hearts" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/GlassHearts-1.12.1-1.0.73.jar"
            }
        }

//        withProvider(JenkinsProvider) {
//            jenkinsUrl = "https://ci.elytradev.com"
//        }.list {
//            // b0undrybreaker
//            +"friendship-bracelet" job "elytra/FriendshipBracelet/master"
//            +"infra-redstone" job "elytra/InfraRedstone/1.12.2"
//
//            // Falkreon
//            +"thermionics" job "elytra/Thermionics/master"
//            +"thermionics-world" job "elytra/ThermionicsWorld/master"
//            +"magic-arsenal" job "elytra/MagicArsenal/master"
//            +"engination" job "elytra/Engination/master"
//
//            // unascribed
//            +"glass-hearts" job "elytra/GlassHearts/1.12.1"
//        }

        group {
            side = Side.SERVER
        }.list {
            +(Mod.btfuContinuousRsyncIncrementalBackup)
            +(Mod.swingthroughgrass)
            +(Mod.colorchat)
            withProvider(DirectProvider).list {
            +"matterlink" configure {
                url = "https://centerofthemultiverse.net/launcher/mirror/MatterLink-1.12.2-1.6.4-184.jar"
                }
            }
//            withProvider(JenkinsProvider) {
//                jenkinsUrl = "https://ci.elytradev.com"
//            }.list {
//                +"matterlink" job "elytra/MatterLink/master"
//            }
        }

        group {
            side = Side.BOTH
            optional {
                selected = false
            }

        }.list {

            +(Mod.laggoggles) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.sampler) configure {
                description = "***Admin/diagnostic tool. Leave off unless asked to help test performance issues."
            }
            +(Mod.openeye) configure {
                description =
                        "Automatically collects and submits crash reports. Enable if asked or wish to help sort issues with the pack."
            }
        }

        group {
            side = Side.CLIENT
        }.list {
            +(Mod.toastControl)
            +(Mod.jeiIntegration)
            +(Mod.appleskin)
            +(Mod.betterfps)
            +(Mod.nonausea)
            +(Mod.betterPlacement)
            +(Mod.controlling)
            +(Mod.defaultOptions)
            +(Mod.fullscreenWindowedBorderlessForMinecraft)
            +(Mod.modNameTooltip)
            +(Mod.reauth)
            +(Mod.cleanview)
            +(Mod.craftingTweaks)
            +(Mod.betterAdvancements)
            +(Mod.tinkersJei)

            // OPT-OUT
            group {
                optional {
                    selected = true
                    skRecommendation = Recommendation.starred
                }
            }.list {

                +(Mod.journeymap) configure {
                    description = "Mod-compatible mini-map."
                }

                +(Mod.mage) configure {
                    description = "Configurable graphics enhancements. Highly recomended."
                }

                +(Mod.neat) configure {
                    description = "Simple health and unit frames."
                }

                +(Mod.clientTweaks) configure {
                    description = "Various client related fixes and tweaks, all in a handy menu."
                }

                +(Mod.mouseTweaks) configure {
                    description = "Add extra mouse gestures for inventories and crafting grids."
                }

                +(Mod.smoothFont) configure {
                    description = "It smoothes fonts."
                }

                +(Mod.inventoryTweaks) configure {
                    description = "Adds amll changes to invetory handling to minor conviniences."
                }

                +(Mod.customFov) configure {
                    description = "Removes dynamic FOV shifting due to ingame effects."
                }
            }
            // OPT-IN
            group {
                optional {
                    selected = false
                }
            }.list {

                +(Mod.betterFoliage) configure {
                    description = "Improves the flora in the world. Very heavy, but very pretty. (Sane defaults set.)"
                }

                +(Mod.thaumicJei) configure {
                    description = "JEI Integration for Thaumcraft."
                }

                +(Mod.justEnoughHarvestcraft) configure {
                    description = "JEI Integration for Pam's HarvestCraft."
                }

                +(Mod.justEnoughResourcesJer) configure {
                    description = "JEI Integration that gives drop-rates for mobs, dungeon loot, etc."
                }

                +(Mod.itemScroller) configure {
                    description = "Alternative to MouseTweaks."
                }

                +(Mod.xaerosMinimap) configure {
                    description = "Alternative to Journeymap."
                }

                +(Mod.minemenu) configure {
                    description =
                            "Radial menu that can be used for command/keyboard shortcuts. Some keybinds cannot be added to radial menu."
                }

                +(Mod.itemzoom) configure {
                    description = "Enable this if you like to get a closer look at item textures."
                }

                +(Mod.lightLevelOverlayReloaded) configure {
                    description = "Smol light-level overlay if you aren't using Dynamic Surroundings."
                }

                +(Mod.durabilityShow) configure {
                    description = "Toggle-able item/tool/armor durability HUD. Duplicates with RPG-HUD."
                }

                +(Mod.fancyBlockParticles) configure {
                    description =
                            "Caution: Resource heavy. Adds some flair to particle effects and animations. Highly configurable, costs fps."
                }

                +(Mod.dynamicSurroundings) configure {
                    description =
                            "Caution: Resource heavy. Lots of configurable features that add immersive sound/visual effects. Includes light-level overlay."
                }

                +(Mod.rpgHud) configure {
                    description =
                            "Highly configurable HUD - heavier alt to Neat. (Configured for compatibility with other mods.)"
                }

                +(Mod.keyboardWizard) configure {
                    description = "Visual keybind manager."
                }

                +(Mod.chunkAnimator) configure {
                    description = "Configurable chunk pop-in animator."
                }

                +(Mod.fasterLadderClimbing) configure {
                    description = "Helps you control ladder climb speed and allows you to go a bit faster."
                }

                // Resource packs
                +TexturePack.unity configure {
                    fileName = "Unity.zip"
                    description = "Multi-mod compatible resource pack."
                }

                withProvider(DirectProvider).list {
                    +"Optifine" configure {
                        description =
                                "Adds a variety of client and video options. Notorious for being problematic. Use with caution."
                        url = "https://centerofthemultiverse.net/launcher/mirror/OptiFine_1.12.2_HD_U_E3.jar"
                    }

                    +"Slice" configure {
                        description = "Custom client font based off of Chicago. Made by Falkreon."
                        folder = "resourcepacks"
                        url = "https://centerofthemultiverse.net/launcher/mirror/Slice.zip"
                    }

                    +"SEUS Renewed" configure {
                        description =
                                "Gorgeous shaderpack, incredibly demanding. Best for screenshots, not gameplay. (requires Optifine)"
                        folder = "shaderpacks"
                        url = "https://centerofthemultiverse.net/launcher/mirror/SEUS-Renewed-1.0.0.zip"
                    }
                }
            }
        }
    }
}

