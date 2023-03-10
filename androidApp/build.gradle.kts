plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.alpstein.firstkmmapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.alpstein.firstkmmapp.android"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    //compose
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation( "androidx.core:core-ktx:1.9.0")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation( "androidx.compose.material:material:1.3.1")
    implementation( "androidx.compose.ui:ui:1.3.2")
    implementation( "androidx.compose.ui:ui-tooling:1.3.2")
    implementation( "androidx.compose.ui:ui-tooling-preview:1.3.2")
    implementation( "androidx.compose.runtime:runtime:1.3.2")
    implementation( "androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation( "androidx.navigation:navigation-compose:2.5.3")
    implementation( "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")
    implementation( "androidx.compose.compiler:compiler:1.3.2")
}