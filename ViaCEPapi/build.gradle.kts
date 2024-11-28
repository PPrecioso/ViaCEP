plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.dagger.hilt) apply false
}

buildscript {
    dependencies {
        // Ensure you use the correct version of AGP (8.1.0 in your case)
        classpath("com.android.tools.build:gradle:8.1.0")
    }
}

allprojects {
    // Remove repository declarations here to avoid conflicts
}