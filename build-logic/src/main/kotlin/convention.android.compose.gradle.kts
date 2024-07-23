import com.chat.build_logic.configureComposeAndroid

plugins {
    id("convention.android.library")
}

android {
    configureComposeAndroid(this)
}