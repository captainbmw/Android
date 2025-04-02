package com.bmw.driller.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bmw.driller.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {
        Text("Welcome to BMW company",
            color = Color.Black,
            fontSize = 25.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(40.dp))
        Image(painter = painterResource(id= R.drawable.bmw3),
            contentDescription = "bmw",
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
        )
        Spacer(modifier = Modifier.height(40.dp))
        Text("The best car in the world.it goes 200km/hr",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
            
            
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(400.dp)
        ){
            Text("Login",

                fontSize = 20.sp,

            )
        }
        Spacer(modifier = Modifier.height(400.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(40.dp)) {
            Text("Register",

                fontSize = 20.sp,

            )
        }

        }
    }

@Preview
@Composable
private fun Screenpage() {
    HomeScreen()
}
