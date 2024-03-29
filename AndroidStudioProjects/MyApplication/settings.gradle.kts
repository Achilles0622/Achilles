pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
include(":chapter03")
include(":chapter04")
include(":chapter05")
include(":chapter06")
include(":chapter07-server")
include(":chapter07-client")
include(":chapter08")
