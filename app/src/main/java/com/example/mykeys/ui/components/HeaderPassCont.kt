package com.example.mykeys.ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mykeys.R
import com.example.mykeys.ui.theme.AppTheme
import com.example.mykeys.ui.theme.Typography

@Composable
fun HeaderPassCont(headerTitle : String, searchAvailable : Boolean = false){
    Column(
        Modifier
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = headerTitle,
                color = AppTheme.colors.uiElements,
                style = Typography.titleMedium,
            )
            if(searchAvailable){
                Row(
                    Modifier
                        .padding(horizontal = 15.dp)
                        .border(
                            color = AppTheme.colors.inverseSecondary,
                            width = 2.dp,
                            shape = RoundedCornerShape(7.dp)
                        )
                        .weight(1f)
                    ,

                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(R.drawable.search),
                        contentDescription = "Star icon",
                        tint = AppTheme.colors.uiElements,
                    )

                    var text by remember { mutableStateOf("") }
                    BasicTextField(
                        value = text,
                        onValueChange = { newText -> text = newText },
                        Modifier
                            .padding(3.dp)
                            .background(color = Color.Transparent),

                        singleLine = true,
                        textStyle = Typography.titleMedium
                    )
                }
                IconButton(
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .height(32.dp)
                        .width(32.dp),
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(R.drawable.sort_by_alpha_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = "Sort by alpha",
                        tint = AppTheme.colors.uiElements
                    )
                }

                IconButton(
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .height(32.dp)
                        .width(32.dp),
                    onClick = {}
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize(),
                        painter = painterResource(R.drawable.arrow_down_up),
                        contentDescription = "Sort by alpha",
                        tint = AppTheme.colors.uiElements,
                        )
                }
            }
        }

        Row(
            Modifier
                .height(3.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) { }
    }
}


@Preview
@Composable
fun PrevHeaderPassCont(){
    HeaderPassCont("All Keys", true)
}