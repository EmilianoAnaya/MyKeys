package com.example.mykeys.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mykeys.navigation.AppNavigation
import com.example.mykeys.navigation.AppScreens

@Composable
fun NewKeyScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("My New Screen :D")
        Button(
            onClick = {
                navController.navigate(route = AppScreens.MainScreen.route)
            }
        ) {
            Text("Press to return to main")
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PrevNewKeyScreen(){
    NewKeyScreen(rememberNavController())
}