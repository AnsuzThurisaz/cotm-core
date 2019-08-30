import voodoo.util.unixPath

plugins {
    // kotlin("jvm") version "1.3.20" // automatically applied
    // idea // automatically applied
    id("voodoo") version "0.4.9-SNAPSHOT"
}

voodoo {
    addTask(name = "build", parameters = listOf("build"))
    addTask(name = "build_mmc_test", parameters = listOf("build", "cotm_test_mmc"))
    addTask(name = "pack_sk", parameters = listOf("pack sk"))
    addTask(name = "pack_mmc", parameters = listOf("pack mmc"))
    addTask(name = "pack_mmc-static", parameters = listOf("pack mmc-static"))
    addTask(name = "pack_mmc-fat", parameters = listOf("pack mmc-fat"))
    addTask(name = "pack_server", parameters = listOf("pack server"))
    addTask(name = "pack_curse", parameters = listOf("pack curse"))
    addTask(name = "test_mmc", parameters = listOf("test mmc"))
    addTask(name = "buildAndPackAll", parameters = listOf("build", "pack sk", "pack server", "pack mmc"))

    generateCurseforgeMods("Mod", "1.12", "1.12.1", "1.12.2")
    generateCurseforgeTexturepacks("TexturePack", "1.12", "1.12.1", "1.12.2")
    generateForge("Forge", "1.12.2")
}

repositories {
    maven(url = "http://maven.modmuss50.me/") {
        name = "modmuss50"
    }
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap") {
        name = "Kotlin EAP"
    }
    maven(url = "https://kotlin.bintray.com/kotlinx") {
        name = "kotlinx"
    }
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(group = "moe.nikky.voodoo", name = "voodoo", version = "0.4.9+")
    implementation(group = "moe.nikky.voodoo", name = "dsl", version = "0.4.9+")
}

tasks.create("syncConfigs") {
    group = "cotm"
    doFirst {
        val testInstance = File("C:\\Users\\chris\\Documents\\MultiMC\\instances\\voodoo_test_cotm\\.minecraft")
     // val testInstance = File("/home/nikky/.local/share/multimc/instances/cotm/.minecraft/")
        val configFolder = testInstance.resolve("config")

        val sourceFolder = configFolder
        val targetFolder = project.file("cotm").resolve("config")
        sourceFolder.walkTopDown().forEach { file ->
            val relativeLocation = file.relativeTo(sourceFolder)
            val targetLocation = targetFolder.resolve(relativeLocation)
            if(targetLocation.exists()) {
                if(targetLocation.isFile && targetLocation.readText() != file.readText()) {
                    logger.lifecycle("updating $relativeLocation")
//                     targetLocation.writeText(file.readText())
                }
            }
        }
    }
}

tasks.create("listConfigs") {
    group = "cotm"
    doFirst {
        val sourceFolder = project.file("cotm").resolve("config")
        val paths = sourceFolder.walkTopDown().filter {
            it.isFile && !it.toPath().contains(File("_SERVER").toPath())
        }.map { file ->
            "\"" + file.relativeTo(sourceFolder).path.replace("\\", "/") + "\""
        }
        val result = paths.joinToString(",\n")
        logger.lifecycle("config paths: \n $result")
    }
}