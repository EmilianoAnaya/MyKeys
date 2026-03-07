package com.example.mykeys.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PasswordContent(headerTitle : String, searchAvailable : Boolean = false){
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        HeaderPassCont(headerTitle, searchAvailable)
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
        PasswordRow()
    }
}


@Preview
@Composable
fun PrevPasswordContent(){
    PasswordContent("Favorite Keys")
}