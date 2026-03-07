package com.example.mykeys.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mykeys.ui.components.MainHeader
import com.example.mykeys.ui.components.PasswordContent
import com.example.mykeys.ui.theme.AppTheme

@Composable
fun MainScreen(){
    Box(
        Modifier
            .fillMaxSize()
            .background(color = AppTheme.colors.inversePrimary)

    ) {
        MainHeader()
        LazyColumn(
            contentPadding = PaddingValues(top = 110.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.dp)
        ) {
            item{PasswordContent("Favorite Keys")}
            item{PasswordContent("All Keys", searchAvailable = true)}
        }

    }
}