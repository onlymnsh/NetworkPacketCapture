plugins {
    id("com.android.application")
}

android {
    namespace = "com.minhui.networkcapture"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.minhui.networkcapture"
        minSdk = 19
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.5"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
//            proguardFiles getDefaultProguardFile ('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
//    implementation ("androidx.appcompat:appcompat:1.0.0")
    implementation ("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation ("com.google.android.material:material:1.0.0")
    implementation ("com.tencent.bugly:crashreport:2.4.0")
    implementation(project(mapOf("path" to ":vpnadaptercore")))
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test.ext:junit:1.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.1.0")
}
