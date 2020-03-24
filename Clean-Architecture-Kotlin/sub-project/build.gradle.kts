//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
//
//plugins {
//	id("org.springframework.boot") version "2.2.5.RELEASE"
//	//id("io.spring.dependency-management") version "1.0.9.RELEASE"
//	kotlin("jvm") version "1.3.61"
//	kotlin("plugin.spring") version "1.3.61"
//	//kotlin("plugin.jpa") version "1.3.61"
//	kotlin("plugin.allopen") version "1.3.61"
//	kotlin("plugin.noarg")version "1.3.61"
//
//}
//
//extra["springBootAdminVersion"] = "2.1.6"
//extra["springCloudVersion"] = "Greenwich.SR5"
//extra["springCloudVersion"] = "Hoxton.SR3"
//extra["kotlinVersion"] = "'1.3.61'"
//
////repositories {
////	mavenCentral()
////}
//
//java.sourceCompatibility = JavaVersion.VERSION_1_8
//
//allprojects {
//
//	group = "spring.studies.clean.arch"
//	version = "0.0.1-SNAPSHOT"
//
//	//description = "Clean Arch / Spring boot sample"
//
//	repositories {
//		jcenter()
//		mavenCentral()
//	}
//
//	dependencyManagement {
//		imports {
//			mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
//		}
//	}
//
//}
//
//subprojects {
//
//	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
//    apply(plugin = "org.jetbrains.kotlin.jvm")
//
//
//
//	repositories {
//		jcenter()
//		mavenCentral()
//		mavenLocal()
//	}
//
//
//	val developmentOnly by configurations.creating
//	configurations {
//		runtimeClasspath {
//			extendsFrom(developmentOnly)
//		}
//	}
//
//	dependencies {
//		developmentOnly("org.springframework.boot:spring-boot-devtools")
//
////		implementation("org.springframework.boot:spring-boot-starter-actuator")
////		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
////		implementation("org.springframework.boot:spring-boot-starter-data-rest")
////		implementation("org.springframework.boot:spring-boot-starter-validation")
////		implementation("org.springframework.boot:spring-boot-starter-web")
//		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//		implementation("org.jetbrains.kotlin:kotlin-reflect")
//		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
////		implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
//
////		runtimeOnly("com.h2database:h2")
//
//
//		testImplementation("org.springframework.boot:spring-boot-starter-test") {
//			exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
//		}
//	}
//
//
//
//	tasks.withType<Test> {
//		useJUnitPlatform()
//	}
//
//	tasks.withType<KotlinCompile> {
//		kotlinOptions {
//			freeCompilerArgs = listOf("-Xjsr305=strict")
//			jvmTarget = "1.8"
//		}
//	}
//}
//
//
//
//
//
//
