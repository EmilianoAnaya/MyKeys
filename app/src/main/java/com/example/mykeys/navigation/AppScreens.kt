package com.example.mykeys.navigation

sealed class AppScreens(val route : String) {
    object MainScreen : AppScreens("main_screen")
    object  NewKeyScreen : AppScreens("new_key_screen")
}