package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceAppTheme {
                    Art()
            }
        }
    }
}

@Composable
fun Art() {
    // Lijst van afbeeldingen en teksten
    val imageList = listOf(
        R.drawable.koeien,
        R.drawable.koppel,
        R.drawable.roblox,
        R.drawable.joker,
        R.drawable.obama
    )
    val textList = listOf(
        R.string.descr_koei,
        R.string.descr_koppel,
        R.string.descr_roblox,
        R.string.descr_Joker,
        R.string.descr_obama
    )
    // Huidige index van de afbeelding
    var currentIndex by remember { mutableIntStateOf(0) }

    Surface (
        modifier = Modifier.fillMaxSize(),
        color =MaterialTheme.colorScheme.background
    ){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(modifier = Modifier
                .size(250.dp)
                .border(4.dp, color = Color.White, RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = imageList[currentIndex]),
                    contentDescription = stringResource(id = textList[currentIndex]),
                    modifier = Modifier
                        .fillMaxSize()
                        .shadow(8.dp)
                        .border(8.dp, Color.White)
                        .background(Color(0xFFFAFAFA))
                )
            }
            Spacer(modifier = Modifier.padding(16.dp))

            Box(
                contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .background(Color.LightGray)
                            .shadow(1.dp)
            ) {
                Text(stringResource(id = textList[currentIndex]),
                    modifier = Modifier
                        .padding(8.dp))

            }
            Spacer(modifier = Modifier.padding(16.dp)) // Ruimte tussen afbeelding en tekst

            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Button(onClick = {// Verhoog de index en reset bij de laatste afbeelding
                    if (currentIndex > 0) {
                        currentIndex -= 1
                    }
                    },modifier = Modifier.padding(8.dp)
                )
                {
                    Text("Vorige")
                }
                Button(onClick = {
                    if (currentIndex < imageList.size - 1) {
                        currentIndex += 1
                    }
                },modifier = Modifier.padding(8.dp)
                )
                {
                    Text("Volgende")
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceAppTheme {
        Art()
    }
}