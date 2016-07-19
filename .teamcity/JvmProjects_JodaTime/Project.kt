package JvmProjects_JodaTime

import JvmProjects_JodaTime.buildTypes.*
import JvmProjects_JodaTime.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "6afd2506-e293-4a76-ab57-1dcaa53cbcb3"
    extId = "JvmProjects_JodaTime"
    parentId = "JvmProjects"
    name = "Joda Time"

    vcsRoot(JvmProjects_JodaTime_HttpsGithubComHhaririJodaTimeRefsHeadsMaster)

    buildType(JvmProjects_JodaTime_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = Mode.ENABLED
            buildSettingsMode = BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "HttpsGithubComHhaririJodaTime"
            showChanges = false
            settingsFormat = Format.KOTLIN
        }
    }
})
