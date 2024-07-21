ext.apply {
    // this aapplyes on every projects and dependency
    set("compileSdk", 34)
    set("targetSdk", 28)
    set("minSdk", 23)
    set("ndkVersion", "24.0.8215888")
    set("cmakeVersion", "3.22.1") //latest
    set("ktx_version", "1.13.1") // kotlin dependency version androidx.core:core-ktx
    set("stdlib_version", "1.9.24") // kotlin stdlib version org.jetbrains.kotlin:kotlin-stdlib-jdk7
    set("hiddenapibypass", "4.3") // kotlin stdlib version org.lsposed.hiddenapibypass:hiddenapibypass
    set("xcrashversion", "3.1.0") // com.iqiyi.xcrash:xcrash-android-lib
    set("shadowhook", "1.0.9") // com.bytedance.android:shadowhook:
    set("googlematerial", "1.11.0") // com.google.android.material:material:

    // set properties for app only
    set("appid", "com.vspace") // appid
    set("packagename", "com.vspace") // main packagename
    set("appversion", "3.0.1-alpha")
    set("versioncode", 3)

}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.5.1")
    }
}

plugins {
    id("com.android.application") version "8.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.android.library") version "8.3.0" apply false
}

tasks.register<Delete>("clean") { delete(rootProject.layout.buildDirectory) }




