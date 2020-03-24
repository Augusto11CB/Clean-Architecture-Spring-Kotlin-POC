plugins {
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion //TODO Verify Version "1.3.61"
    kotlin("plugin.allopen") version kotlinVersion
    kotlin("plugin.jpa") version kotlinVersion
    kotlin("plugin.noarg") version kotlinVersion
    id("org.springframework.boot") version BuildPlugins.Versions.springBoot2
    id("io.spring.dependency-management") version "1.0.9.RELEASE"

}

allprojects {

    repositories {
        jcenter()
        mavenCentral()
    }
}

repositories {
    jcenter()
    mavenCentral()
}

extra["springCloudVersion"] = "Hoxton.SR3"

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

subprojects {
    group = "spring.studies.clean.arch"
    version = "1.0.0-SNAPSHOT"

    apply(plugin = "org.springframework.boot")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "kotlin-allopen")
    apply(plugin = "kotlin")
    apply(plugin = "io.spring.dependency-management")




    sourceSets {
        main {
            java.srcDir("src/main/kotlin")
        }
    }


    //TODO - Implement in the builSrc module
    val developmentOnly by configurations.creating
    configurations {
        runtimeClasspath {
            extendsFrom(developmentOnly)
        }
    }

    dependencies {
        implementation(Spring.springStarterWeb)
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation(Libraries.kotlinStdLib)
        implementation(Libraries.kotlinLogging)
        implementation(kotlin("reflect"))

//        testImplementation(TestLibraries.assertJ)
//        testImplementation(TestLibraries.junit5)

        testImplementation("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }
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
