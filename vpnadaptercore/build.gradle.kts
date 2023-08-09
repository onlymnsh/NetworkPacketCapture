plugins {
    id("com.android.library")
}

android {
    namespace = "com.minhui.vpn"
    compileSdk = 31

    defaultConfig {
        minSdk = 19
        targetSdk = 31
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
//            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }

}

dependencies {
    implementation ("com.squareup.okio:okio:1.14.0")
    implementation ("androidx.appcompat:appcompat:1.0.0")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test.ext:junit:1.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.1.0")
}
