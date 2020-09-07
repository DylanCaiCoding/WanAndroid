@file:Suppress("unused")

package com.dylanc.plugin

object Versions {
  const val retrofit = "2.9.0"
  const val appcompat = "1.1.0"
  const val coreKtx = "1.3.0"
  const val constraintLayout = "1.1.3"
  const val paging = "3.0.0-alpha01"
  const val timber = "4.7.1"
  const val kotlin = "1.3.72"
  const val koin = "2.1.5"
  const val work = "2.2.0"
  const val room = "2.3.0-alpha01"
  const val cardView = "1.0.0"
  const val recyclerview = "1.0.0"
  const val fragment = "1.2.1"
  const val anko = "0.10.8"
  const val navigation = "2.3.0"

  const val junit = "4.12"
  const val junitExt = "1.1.1"
  const val espressoCore = "3.2.0"
}

object AndroidX {
  const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
  const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
  const val constraintLayout =
    "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
  const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"

  const val workRuntime = "androidx.work:work-runtime:${Versions.work}"
  const val workTesting = "androidx.work:work-testing:${Versions.work}"
  const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
  const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
}

object Room {
  const val runtime = "androidx.room:room-runtime:${Versions.room}"
  const val compiler = "androidx.room:room-compiler:${Versions.room}"
  const val ktx = "androidx.room:room-ktx:${Versions.room}"
  const val rxJava2 = "androidx.room:room-rxjava2:${Versions.room}"
  const val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
  const val runtime = "androidx.fragment:fragment:${Versions.fragment}"
  const val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
  const val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Kotlin {
  const val stdlibJdk = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
  const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
  const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Koin {
  const val core = "org.koin:koin-core:${Versions.koin}"
  const val androidCore = "org.koin:koin-android:${Versions.koin}"
  const val viewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
  const val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
  const val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
  const val sqLite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
  const val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
  const val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
  const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
  const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
}

object Navigation {
  const val plugin =
    "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
}

object Test {
  const val junit = "junit:junit:${Versions.junit}"
  const val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
  const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}

object Depend {
  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

