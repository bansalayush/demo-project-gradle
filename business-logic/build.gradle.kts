//1
//By applying a plugin, you give structure and
//meaning to your subproject.
plugins {
    //2
    //plugin turns the subproject into a Java
    //Library project, so that Gradle and also the
    //IDE knows where the source code is located,
    //how the code is compiled and packaged into
    //a jar file
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "1.5.21"
    //4
    //plugin are of  3 types
    //gradle core plugins e.g id("java-library")
    //community plugins id("org.jetbrains.kotlin.jvm") version "1.5.21" // community plugins are independent of gradle version
    //Locally defined Plugins e.g id("my-java-library")

}

//3
//plugins provide
//so called extensions.
//In our case, we get access to the Java extension.
//So extensions are the second thing to configure
//in build files.
//here we configure the Java Version
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.9")
}