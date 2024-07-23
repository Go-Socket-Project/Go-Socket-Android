import com.chat.build_logic.configureComposeAndroid

plugins {
    id("convention.android.library")
    kotlin("plugin.compose")
}

android {
    configureComposeAndroid(this)
}