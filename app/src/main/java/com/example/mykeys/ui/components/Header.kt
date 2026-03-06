package com.example.mykeys.ui.components
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.mykeys.ui.theme.AppTheme
import com.example.mykeys.ui.theme.Green
import com.example.mykeys.ui.theme.MyKeysTheme
import com.example.mykeys.ui.theme.Typography

@Composable
fun MainHeader(){
    val headerShape = RoundedCornerShape(
        bottomEnd = 16.dp,
        bottomStart = 16.dp
    )

    Column(
        Modifier
            .fillMaxWidth()
            .height(94.dp)
            .zIndex(1f)
            .shadow(50.dp, headerShape)
            .clip(headerShape)
            .background(color = AppTheme.colors.primary)
            .padding(horizontal = 21.dp)
            .padding(bottom = 12.dp),
    ) {
        Spacer(Modifier.weight(1f))
        Row(
            Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ) {
            Text("MyKeyring",
                color = AppTheme.colors.uiElements,
                style = Typography.titleLarge,
            )
            Button(
                onClick = {},
                border = BorderStroke(2.dp, Green),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppTheme.colors.inversePrimary
                ),
                modifier = Modifier
                    .height(35.dp)
            ) {
                Text("New Key", color=AppTheme.colors.uiElements, fontSize = 15.sp)
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PrevMainHeader() {
    MainHeader()
}