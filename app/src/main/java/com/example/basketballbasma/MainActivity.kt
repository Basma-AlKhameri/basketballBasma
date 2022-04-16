package com.example.basketballbasma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basketballbasma.ui.theme.BasketballBasmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasketballBasmaTheme {
                Main()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Main() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {
        Image(
            painter = painterResource(id = R.drawable.ic_baskball),
            contentDescription = "basketball"
        )
        Box(Modifier.padding(30.dp)) {
            Column() {
                Text(
                    text = "The Perfect Basketball Courts for you",
                    style = typography.h1
                )
                Text(
                    text = "Explore your dream basketball with" +
                            " advanced basketball courts",
                    style =typography.h3,
                    modifier = Modifier.padding(top = 15.dp)
                )
            }//end of text box
        }

        Box(
            Modifier
                .fillMaxWidth()
                .padding(end = 40.dp),
            contentAlignment = Alignment.BottomEnd
        )
        {
            Image(
                painter = painterResource(id = R.drawable.ic_arr),
                contentDescription = "arrow"
            )
        }
    }

}