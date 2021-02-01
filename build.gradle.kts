plugins {
    kotlin("jvm") version "1.4.21"
    `maven-publish`
}

group = "com.johnturkson.tools"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["kotlin"])
        }
    }
    
    repositories {
        maven {
            name = "SpacePackages"
            url = uri("https://maven.pkg.jetbrains.space/johnturkson/p/packages/public")
            credentials {
                username = System.getenv("SPACE_PUBLISHING_USERNAME")
                password = System.getenv("SPACE_PUBLISHING_TOKEN")
            }
        }
    }
}
