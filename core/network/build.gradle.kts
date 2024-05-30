import java.util.Properties

plugins {
    id("convention.android.library")
    id("convention.android.hilt")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.chat.network"

    defaultConfig {
        buildConfigField(
            type = "String",
            name = "BASE_URL",
            value = getLocalProperty("BASE_URL")
        )
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.okhttp.logging.interceptor)
    implementation(libs.retrofit)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.kotlinx.serialization.json)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.androidx.test.espresso)
}

fun getLocalProperty(name: String): String {
    val propertiesFile = rootProject.file("local.properties")
    val properties = Properties()
    properties.load(propertiesFile.inputStream())
    return properties.getProperty(name)
}