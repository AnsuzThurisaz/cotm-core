plugins {
    wrapper
    id("voodoo") version "0.4.2-SNAPSHOT"
}

voodoo {

}

tasks.withType<Wrapper> {
    gradleVersion = "5.0-rc-1"
    distributionType = Wrapper.DistributionType.ALL
}