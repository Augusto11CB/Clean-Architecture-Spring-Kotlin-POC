import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion //TODO Verify Version "1.3.61"
    kotlin("plugin.allopen") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
    kotlin("plugin.noarg") version kotlinVersion
    /*

    id("org.springframework.boot") version "2.2.5.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"

    */

}

allprojects {
    group = "spring.studies.clean.arch"
    version = "1.0.0-SNAPSHOT"


    repositories {
        jcenter()
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.jetbrains.kotlin.jvm")


    //TODO - Implement in the builSrc module
    val developmentOnly by configurations.creating
    configurations {
        runtimeClasspath {
            extendsFrom(developmentOnly)
        }
    }

    dependencies {
        implementation(Libraries.kotlinStdLib)
        implementation(Libraries.kotlinLogging)
        implementation(kotlin("reflect"))
        testImplementation(TestLibraries.assertJ)
        testImplementation(TestLibraries.junit5)
    }

    configurations {
        testImplementation {
            exclude(group = "junit")
        }
    }

    tasks {

        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "1.8"
            }
        }

        compileTestKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "1.8"
            }
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

//    tasks.test {
//        useJUnitPlatform()
//    }
}
