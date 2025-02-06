package com.ajgowtam.moviehub

object Versions {
    const val HILT = "2.51.1"
    const val RETROFIT = "2.9.0"
    const val COMPOSE = "1.6.0"
    const val NAVIGATION = "2.7.5"
}

object AppDependencies {
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val navigationCompose = "androidx.navigation:navigation-compose:${Versions.NAVIGATION}"
}