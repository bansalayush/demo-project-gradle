//1
// give a stable name to your project
//using the rootProject.name property
rootProject.name = "demo-project"

//2
//define locations where Gradle can look for
//other components your build may depend on. These
//may be binary repositories, like Maven Central
//Allows configuring dependency resolution for all projects of the build.
dependencyResolutionManagement {
    repositories {
        mavenCentral() //Adds a repository which looks in the Maven central repository for dependencies

    }
}

//Configures the plugin management for the entire build.
pluginManagement {
    repositories {
        gradlePluginPortal() //Adds a repository which looks in Gradle Central Plugin Repository for dependencies.
        google()
    }
}
//3
//define the actual structure of your project. The
//project is made up of so-called subprojects.
//You define a subproject by using the include()
include(":business-logic")
include(":data-model")
include(":app")