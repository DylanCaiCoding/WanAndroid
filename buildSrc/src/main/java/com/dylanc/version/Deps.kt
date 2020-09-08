@file:Suppress("unused")

package com.dylanc.version

object Versions {
  const val anko = "0.10.8"
  const val appcompat = "1.1.0"
  const val cardView = "1.0.0"
  const val coreKtx = "1.3.0"
  const val constraintLayout = "2.0.1"
  const val coroutines = "1.3.7"
  const val espresso = "3.2.0"
  const val fragment = "1.2.1"
  const val glide = "4.11.0"
  const val gradle = "4.0.1"
  const val junit = "4.13"
  const val junitExt = "1.1.1"
  const val koin = "2.1.5"
  const val kotlin = "1.3.72"
  const val leakCanary = "1.6.3"
  const val lifecycle = "2.2.0"
  const val loadingHelper = "2.1.0"
  const val multiType = "4.2.0"
  const val material = "1.3.0-alpha01"
  const val navigation = "2.3.0"
  const val paging = "3.0.0-alpha01"
  const val recyclerView = "1.2.0-alpha04"
  const val retrofit = "2.9.0"
  const val retrofitHelper = "1.2.0-rc"
  const val room = "2.2.5"
  const val runner = "1.2.0"
  const val timber = "4.7.1"
  const val utilCode = "1.29.0"
  const val utilCodeKtx = "1.0.0-alpha"
  const val work = "2.2.0"
}

object Deps {

  object Android{
    const val material = "com.google.android.material:material:${Versions.material}"
  }

  object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardView}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"
    const val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    const val workTesting = "androidx.work:work-testing:${Versions.work}"
  }

  object Anko {
    const val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    const val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    const val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    const val design = "org.jetbrains.anko:anko-design:${Versions.anko}"
  }

  object Fragment {
    const val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val ktx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
  }

  object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val ktx = "androidx.room:room-ktx:${Versions.room}"
    const val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    const val testing = "androidx.room:room-testing:${Versions.room}"
  }

  object Kotlin {
    const val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
  }

  object Koin {
    const val core = "org.koin:koin-core:${Versions.koin}"
    const val android = "org.koin:koin-android:${Versions.koin}"
    const val viewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
  }

  object Navigation {
    const val fragment= "androidx.navigation:navigation-fragment:${Versions.navigation}"
    const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val ui = "androidx.navigation:navigation-ui:${Versions.navigation}"
    const val uiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
  }

  object Lifecycle{
    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
  }

  object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
  }

  object RetrofitHelper {
    const val core = "com.dylanc:retrofit-helper:${Versions.retrofitHelper}"
    const val compiler = "com.dylanc:retrofit-helper-compiler:${Versions.retrofitHelper}"
    const val rxJava = "com.dylanc:retrofit-helper-rxjava:${Versions.retrofitHelper}"
    const val coroutines = "com.dylanc:retrofit-helper-coroutines:${Versions.retrofitHelper}"
  }

  object Test {
    const val junit = "junit:junit:${Versions.junit}"
  }

  object AndroidTest {
    const val junit = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
  }

  object Utils{
    const val utilcode = "com.blankj:utilcode:${Versions.utilCode}"
    const val utilcodeKtx = "com.dylanc:utilcode-ktx:${Versions.utilCodeKtx}"
  }

  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object ClassPath {
  const val buildGradle = "com.android.tools.build:gradle:${Versions.gradle}"
  const val navigationPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
  const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

