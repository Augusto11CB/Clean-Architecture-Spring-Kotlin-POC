const val kotlinVersion = "1.3.61"

object BuildPlugins {

    object Versions {
        const val springDependencyManagement = "1.0.9.RELEASE"
        const val springBoot2 = "2.2.5.RELEASE"

    }
}

object Spring {

    const val springStarterWeb = "org.springframework.boot:spring-boot-starter-web:${BuildPlugins.Versions.springBoot2}"

}

object Libraries {
    private object Versions {
        const val kalidation = "1.4.1"
        const val kotlinLogging = "1.7.6"
    }
//    const val jacksonModuleKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val kalidation = "com.capraro:kalidation:${Versions.kalidation}"
    const val kotlinLogging = "io.github.microutils:kotlin-logging:${Versions.kotlinLogging}"

}

object TestLibraries {
    private object Versions {
        const val junit5 = "5.5.2"
        const val assertJ = "3.13.2"
        const val archUnit = "0.11.0"
    }

    const val junit5 = "org.junit.jupiter:junit-jupiter:${Versions.junit5}"
    const val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
    const val archUnitApi = "com.tngtech.archunit:archunit-junit5-api:${Versions.archUnit}"
    const val archUnitEngine = "com.tngtech.archunit:archunit-junit5-engine:${Versions.archUnit}"

}