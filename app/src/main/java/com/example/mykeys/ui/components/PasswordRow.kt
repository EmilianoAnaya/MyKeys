package com.example.mykeys.ui.components

import android.graphics.drawable.PaintDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mykeys.R
import com.example.mykeys.ui.theme.AppTheme
import com.example.mykeys.ui.theme.Typography

@Composable
fun PasswordRow(){

    Column(
        modifier = Modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                modifier = Modifier
                    .clip(RoundedCornerShape((50.dp)))
                    .size(50.dp)
                    .background(AppTheme.colors.inverseSecondary)
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 10.dp)
                    .weight(1f)
            ) {
                Text(
                    text = "Ref Password",
                    style = Typography.bodyMedium,
                    color = AppTheme.colors.uiElements
                )
                Text(
                    text="Email or ID",
                    style = Typography.bodySmall,
                    color = AppTheme.colors.uiElements
                )
            }

            DefaultButton(
                drawableIcon = R.drawable.paperclip,
                contentDescription = "Copy Password"
            )

            DefaultButton(
                drawableIcon = R.drawable.star,
                contentDescription = "Star Password",
                borderColor = AppTheme.colors.inverseSecondary
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .clip(shape = RoundedCornerShape(2.dp))
                .background(color = AppTheme.colors.inverseSecondary.copy(alpha = .20f))
        )
    }
}


@Preview
@Composable
fun PreviewPasswordRow(){
    PasswordRow()
}