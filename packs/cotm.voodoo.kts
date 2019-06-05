@file:GenerateMods(name = "Mod", mc = "1.12.2")
@file:GenerateMods(name = "Mod", mc = "1.12.1")
@file:GenerateMods(name = "Mod", mc = "1.12")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.2")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.1")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12")
@file:GenerateForge(name = "Forge", mc = "1.12.2")

mcVersion = "1.12.2"
title = "CotM-Majik"
authors = listOf("AnsuzThuriaz")
version = "0.1-testing"
forge = Forge.mc1_12_2.forge_14_23_5_2838
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
        +(Mod.morphOTool)

        // Sangar
        +(Mod.architect)
        +(Mod.bedrockores)

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

        // Benimatic
        +(Mod.theTwilightForest)

        // The_Wabbit
        +(Mod.upsizerMod)

        // Viesis
        +(Mod.viescraftAirships)

        // Mr_Crayfish
        +(Mod.mrcrayfishFurnitureMod)

        // zabi94
        +(Mod.extraAlchemy)

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
        +(Mod.charsetCrafting)
        +(Mod.charsetAudio)
        +(Mod.charsetTools)
        +(Mod.charsetpatches)
        +(Mod.charsetImmersion)
        +(Mod.foamfixForMinecraft)
        +(Mod.unlimitedChiselWorks)
        +(Mod.preston)

        +(Mod.enderStorage18)
        +(Mod.extraBitManipulation)
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
        +(Mod.forestry)
        +(Mod.binniesMods)
        +(Mod.magicBees)
        +(Mod.naturesCompass)
        +(Mod.netherex)
        +(Mod.netherportalfix)
        +(Mod.stimmedcowNomorerecipeconflict)
        +(Mod.notenoughids)
        +(Mod.openblocks)
        +(Mod.pamsHarvestcraft)
        +(Mod.passthroughSigns)
        +(Mod.randomThings)
        +(Mod.recurrentComplex)
        +(Mod.redstoneFlux)
        +(Mod.roguelikeDungeons)
        +(Mod.roots)
        +(Mod.simpleSponge)
        +(Mod.spartanShields)
        +(Mod.storageDrawers)
        +(Mod.storageDrawersExtras)
        +(Mod.tails)
        +(Mod.tinkersConstruct)
        +(Mod.tinkersToolLeveling)
        +(Mod.toolBelt)
        +(Mod.torchmaster)
        +(Mod.quickLeafDecay)
        +(Mod.bloodMagic)
        +(Mod.constructsArmory)
        +(Mod.yoyos)
        +(Mod.badWitherNoCookieReloaded)
        +(Mod.waystones)
        +(Mod.theAetherIi)
        +(Mod.thaumcraftInventoryScanning)
        +(Mod.peckish)
        +(Mod.electroblobsWizardry)
        +(Mod.reliquaryV13)
        +(Mod.fastworkbench)
        +(Mod.fastfurnace)
        +(Mod.dimensionaldoors)
        +(Mod.betterBuildersWands)
        +(Mod.antighost)
        +(Mod.loginShield)
        +(Mod.caliper)
        +(Mod.flopper)
        +(Mod.wallJump)
        +(Mod.magicalMap)
        +(Mod.pewter)
        +(Mod.grapplingHookMod)
        +(Mod.embers)
        +(Mod.outfox)
        +(Mod.chococraft3)
        +(Mod.surge)
        +(Mod.armoryExpansion)
        +(Mod.huntingDimension)
        +(Mod.theDisenchanterMod)
        +(Mod.doggyTalents)
        +(Mod.lootbags)
        +(Mod.snad)
        +(Mod.compactdrawers)
        +(Mod.blockcraftery)
        +(Mod.colytra)
        +(Mod.cathedral)
        +(Mod.architecturecraftElytradev)
        +(Mod.futureMc)
        +(Mod.theLostCities)
        +(Mod.evilcraft)
        +(Mod.abyssalcraft)
        +(Mod.abyssalcraftIntegration)
        +(Mod.angelOfVengeance)
        +(Mod.grimoireOfGaia)
        +(Mod.wizardryMod)
        +(Mod.rustic)
        +(Mod.angryPixelTheBetweenlandsMod)
        +(Mod.biomesOPlenty)
        +(Mod.theMidnight)
        +(Mod.magicalPsi)
        +(Mod.theBeneath)
        +(Mod.bloodArsenal)
        +(Mod.culinaryConstruct)
        +(Mod.wings)
        +(Mod.theErebus)
        +(Mod.hwyla)
        +(Mod.dm2)

        // Pre-Testing / Un-used
        // +(Mod.inControl)
        // +(Mod.justEnoughDimensions)
        // +(Mod.crafttweaker)
        // +(Mod.modtweaker)
        // +(Mod.tweakersConstruct)

        // Pulled due to outstanding issues

        withProvider(DirectProvider).list {
            +"nutrition" configure {
                url = "https://github.com/WesCook/Nutrition/releases/download/v4.3.0/Nutrition-1.12.2-4.3.0.jar"
            }
        }

        withProvider(JenkinsProvider) {
            jenkinsUrl = "https://ci.elytradev.com"
        }.list {
            // b0undrybreaker
            +"friendship-bracelet" job "elytra/FriendshipBracelet/master"
            +"infra-redstone" job "elytra/InfraRedstone/1.12.2"

            // Falkreon
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
//          +(Mod.customMainMenu)
            +(Mod.defaultOptions)
            +(Mod.fullscreenWindowedBorderlessForMinecraft)
            +(Mod.modNameTooltip)
            +(Mod.reauth)
            +(Mod.cleanview)
            +(Mod.craftingTweaks)
            +(Mod.betterAdvancements)

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
                    version = "3.5.4.0BETA"
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

