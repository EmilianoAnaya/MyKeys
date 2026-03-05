package com.example.mykeys

import android.os.Bundle
import android.content.res.Configuration
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mykeys.ui.components.MainHeader
import com.example.mykeys.ui.components.PasswordContent
import com.example.mykeys.ui.theme.AppTheme
import com.example.mykeys.ui.theme.MyKeysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyKeysTheme{
                MainView()
            }
        }
    }
}

@Composable
fun MainView() {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = AppTheme.colors.inversePrimary)

    ) {
        MainHeader()
        Spacer(
            Modifier
                .height(15.dp)
        )
        PasswordContent("Favorite Keys")
        PasswordContent("All Keys", searchAvailable = true)

    }
}

@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewMainView() {
    MyKeysTheme{
        MainView()
    }
}