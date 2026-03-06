package com.example.mykeys.ui.components

import androidx.annotation.Nullable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mykeys.R
import com.example.mykeys.ui.theme.AppTheme

@Composable
fun DefaultButton(
    drawableIcon : Int,
    contentDescription : String,
    borderColor : Color = AppTheme.colors.secondary,
    additionalText : String = "",

){
    Button(
        onClick = {},
        border = BorderStroke(
            width = 3.dp,
            color = borderColor,

        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.colors.primary
        ),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(
            vertical = 6.dp,
            horizontal = 4.dp
        ),
        modifier = Modifier
            .height(30.dp)
            .width(70.dp)
            .padding(horizontal = 8.dp)
    ) {
        if(additionalText != ""){
            Text(
                text = additionalText,
                modifier = Modifier
                    .padding(end = 10.dp)
            )
        }
        Icon(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(drawableIcon),
            contentDescription = contentDescription,
            tint = AppTheme.colors.uiElements,
        )
    }
}


@Preview
@Composable
fun PrevDefaultButton(){
    DefaultButton(
        R.drawable.paperclip,
        "Copy Password",
    )
}