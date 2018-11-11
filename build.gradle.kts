plugins {
    wrapper
    id("voodoo") version "0.4.3-SNAPSHOT"
}

voodoo {
    addTask(name = "build", parameters = listOf("build"))
    addTask(name = "sk", parameters = listOf("pack sk"))
    addTask(name = "packServer", parameters = listOf("pack server"))
    addTask(name = "buildAndPackAll", parameters = listOf("build", "pack sk", "pack server", "pack mmc"))
}

tasks.withType<Wrapper> {
    gradleVersion = "5.0-rc-1"
    distributionType = Wrapper.DistributionType.ALL
}