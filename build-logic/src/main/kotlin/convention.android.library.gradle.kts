import com.chat.build_logic.configureKotlinAndroid

plugins {
    id("com.android.library")
    kotlin("android")
    id("convention.verify.detekt")
}

android {
    configureKotlinAndroid(this)

    defaultConfig {
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}