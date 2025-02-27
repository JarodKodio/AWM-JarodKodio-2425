package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp() {
    // Lijst van afbeeldingen en teksten
    val imageList = listOf(
        R.drawable.lemon_tree,
        R.drawable.lemon_squeeze,
        R.drawable.lemon_drink,
        R.drawable.lemon_restart
    )
    val textList = listOf(
        R.string.descr_select_lemon,
        R.string.descr_tap_lemon,
        R.string.descr_tap_lemonade,
        R.string.descr_tap_glass,
    )
    // Huidige index van de afbeelding
    var currentIndex by remember { mutableIntStateOf(0) }
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(
            modifier = Modifier.fillMaxSize()


        ) {
            Text(
                text = "Lemonade",
                fontSize = 24.sp,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .background(Color.Yellow)
            )
        }
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){

            Image(
                painter = painterResource(id = imageList[currentIndex]),
                contentDescription = stringResource(id = textList[currentIndex]),
                modifier = Modifier
                    .size(200.dp)
                    .shadow(2.dp)
                    .clickable {
                        // Verhoog de index en reset bij de laatste afbeelding
                        currentIndex += 1
                        if (currentIndex >= imageList.size) {
                            currentIndex = 0
                        }
                    }
            )
            Text(
                text = stringResource(id = textList[currentIndex]), // Vervang dit met de naam die je wilt
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp) // Ruimte tussen afbeelding en naam
            )
        }



    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp()
    }
}