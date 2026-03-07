package com.example.mykeys.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mykeys.screens.MainScreen
import com.example.mykeys.screens.NewKeyScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainScreen.route){
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }

        composable(route = AppScreens.NewKeyScreen.route){
            NewKeyScreen(navController)
        }
    }
}