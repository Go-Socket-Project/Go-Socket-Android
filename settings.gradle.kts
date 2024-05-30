pluginManagement {
    includeBuild("build-logic")
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

rootProject.name = "Go-Socket"
include(":app")
include(":core:network")
include(":core:data")
include(":core:domain")
include(":core:model")
include(":core:designsystem")
include(":feature:home")
include(":feature:message")
include(":feature:space")
include(":feature:mention")
include(":feature:search")
include(":feature:login")

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:testClasses"))
