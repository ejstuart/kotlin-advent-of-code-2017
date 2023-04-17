import java.nio.file.Files

apply<AntlrPlugin>()

plugins {
    kotlin("jvm") version "1.8.0"
    antlr
}



repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.12.0") // use ANTLR version 4
}


//open class GenerateGrammarExtension(project: Project) {
//    var packageName: String = "hu.bme.mit.${project.name.replace("-",".")}.dsl.gen"
//}



tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }

//    val grammar = extensions.create<GenerateGrammarExtension>("grammar", project)
//
//    named("generateGrammarSource", AntlrTask::class) {
//        val packageName = grammar.packageName
//        val directoryName = packageName.replace(".", File.separator)
//        val packageQualifiedOutputDirectory = outputDirectory.resolve(directoryName)
//        outputDirectory = packageQualifiedOutputDirectory
//
//        arguments.addAll(listOf("-package", packageName, "-Werror", "-visitor"))
//    }

    generateGrammarSource {
        maxHeapSize = "256m"
        arguments = arguments + listOf("-visitor", "-long-messages")
    }


    wrapper {
        gradleVersion = "7.6"
    }
}
