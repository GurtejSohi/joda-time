package JvmProjects_JodaTime.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.MavenBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object JvmProjects_JodaTime_Build : BuildType({
    uuid = "441fa23f-7238-4ebe-89dc-c4cfb295f5e4"
    extId = "JvmProjects_JodaTime_Build"
    name = "Build"

    steps {
        maven {
            goals = "clean test"
            mavenVersion = bundled_3_0()
        }
    }

    vcs {
        root(JvmProjects_JodaTime.vcsRoots.JvmProjects_JodaTime_HttpsGithubComHhaririJodaTimeRefsHeadsMaster)

    }

    triggers {
        vcs {
        }
    }
})
