package com.example.spares.ui.theme.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.spares.R
import com.example.spares.navigation.ROUTE_ADD_PRODUCT
import com.example.spares.navigation.ROUTE_LOGIN
import com.example.spares.navigation.ROUTE_REGISTER


@Composable
fun WelcomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier)
{
    Box (modifier = Modifier.fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.sp),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .matchParentSize())

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ){

            Text(text = "WELCOME",
                fontSize = 32.sp,
                fontWeight = FontWeight(900),
                color = Color.Yellow,
                fontFamily = FontFamily.Cursive,
                textDecoration = TextDecoration.Underline
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Text(text = "Buy & Sell your Spare parts.\n Simple, Transparent & Honest.",
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight(300),
                color = Color.Yellow
            )
            Spacer(modifier = Modifier.weight(0.7f))

            Button(
                onClick = {
                    navController.navigate(ROUTE_REGISTER)
                }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Icon(imageVector = Icons.Default.Email, contentDescription = "icon for person", tint = Color.Yellow)
                Text(text = " Register with email",
                    color = Color.Yellow)
            }
            Button(
                onClick = {
                    navController.navigate(ROUTE_LOGIN)
                }, modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {
                Text(text = "Have an account, ",
                    color = Color.White)
                Text(text = "Login",
                    color = Color.Yellow,
                    fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "By proceeding you agree with our",
                color = Color.White)
            Text(text = "Terms and Conditions",
                color = Color.Yellow,
                )

        }

    }

}
@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(rememberNavController())
}