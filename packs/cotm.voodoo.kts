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
version = "2.3.8-testing"
forge = Forge.mc1_12_2.forge_14_23_5_2847
icon = rootDir.resolve("icon.png")
pack {
    skcraft {
        userFiles = UserFiles(
                include = listOf(
                        "options.txt"
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
        +(Mod.randomPsideas)
        +(Mod.projectIntelligence)
        +(Mod.customMainMenu)
        +(Mod.shadowfactsForgelin)
        +(Mod.plustic)
        +(Mod.externalTweaker)
        +(Mod.spiceOfLifeCarrotEdition)
        +(Mod.wings)
        +(Mod.grimoireOfGaia)
        +(Mod.maxPotionIdExtender)
        +(Mod.calculator)
        +(Mod.rftoolsPower)

        // Pre-Testing / Un-used / Pulled due to issues
        // +(Mod.inControl)
        // +(Mod.justEnoughDimensions)
        // +(Mod.cathedral) # empty crafting grid causes
        // +(Mod.tropicraft) #fluid registry errors?
        // +(Mod.unlimitedChiselWorks)

//        withProvider(DirectProvider).list {
//            +"nutrition" configure {
//                url = "https://github.com/WesCook/Nutrition/releases/download/v4.4.0/Nutrition-1.12.2-4.4.0.jar"
//            }
//            +"friendship-bracelet" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/FriendshipBracelet-master-1.1.2.36.jar"
//            }
//            +"infra-redstone" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/InfraRedstone-1.12.2-1.2.1.114.jar"
//            }
//            +"thermionics" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/Thermionics-MC1.12.2_ver1.1.4.jar"
//            }
//            +"thermionics-world" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/ThermionicsWorld-MC1.12.2_ver1.0.2.jar"
//            }
//            +"magic-arsenal" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/MagicArsenal-MC1.12_ver1.2.6.jar"
//            }
//            +"engination" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/Engination-MC1.12.2_ver1.07.03.jar"
//            }
//            +"glass-hearts" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/GlassHearts-1.12.1-1.0.73.jar"
//            }
//        }

        withProvider(JenkinsProvider) {
            jenkinsUrl = "https://ci.elytradev.com"
        }.list {
            // b0undrybreaker
            +"friendship-bracelet" job "elytra/FriendshipBracelet/master"
            +"infra-redstone" job "elytra/InfraRedstone/1.12.2"

            // Falkreon
            +"thermionics" job "elytra/Thermionics/master"
            +"thermionics-world" job "elytra/ThermionicsWorld/master"
            +"magic-arsenal" job "elytra/MagicArsenal/master"
            +"engination" job "elytra/Engination/master"

            // unascribed
            +"glass-hearts" job "elytra/GlassHearts/1.12.1"
        }

        group {
            side = Side.SERVER
        }.list {
            +(Mod.btfuContinuousRsyncIncrementalBackup)
            +(Mod.swingthroughgrass)
            +(Mod.colorchat)
//            withProvider(DirectProvider).list {
//            +"matterlink" configure {
//                url = "https://centerofthemultiverse.net/launcher/mirror/MatterLink-1.12.2-1.6.4-184.jar"
//                }
//            }
            withProvider(JenkinsProvider) {
                jenkinsUrl = "https://ci.elytradev.com"
            }.list {
                +"matterlink" job "elytra/MatterLink/master"
            }
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
                    +"Slice" configure {
                        description = "Custom client font based off of Chicago. Made by Falkreon."
                        folder = "resourcepacks"
                        url = "https://centerofthemultiverse.net/launcher/mirror/Slice.zip"
                    }
                }
            }
        }
    }
}