pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // FAIL_ON_PROJECT_REPOS er jaigay eta dile onek somossa solve hoye jay
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Bobo Food Delivery"
include(":app")