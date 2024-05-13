package com.example.spares.ui.theme.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spares.R
import com.example.spares.navigation.ROUTE_ADD_PRODUCT
import com.example.spares.navigation.ROUTE_HOME
import com.example.spares.navigation.ROUTE_LOGIN
import com.example.spares.navigation.ROUTE_REGISTER
import com.example.spares.navigation.ROUTE_VIEW_PRODUCT

@Composable
fun AboutScreen(navController: NavController){

    Box {
Image(painter = painterResource(id = R.drawable.rrr),
    contentDescription ="V8" ,
    contentScale = ContentScale.FillBounds,
    modifier = Modifier.matchParentSize()
    )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {navController.navigate(ROUTE_LOGIN) }) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            contentDescription = "Home"
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    IconButton(onClick = {navController.navigate(ROUTE_HOME) }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",

                            )


                    }
//
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    IconButton(onClick = { }) {
//                        Icon(
//                            Icons.Filled.Lock,
//                            contentDescription = "Localized description",
//                        )
//                    }
//                    IconButton(onClick = { }) {
//                        Icon(
//                            Icons.Filled.DateRange,
//                            contentDescription = "Localized description",
//                        )
//                    }

                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { navController.navigate(ROUTE_HOME) },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )





            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "ABOUT US",
                    color = Color.Green,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline

                )
                Spacer(modifier = Modifier.height(50.dp))


            }


            val image = painterResource(
                id =
                R.drawable.ss
            )

            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(30.dp))


            Box {
                Text(
                    text = "This is a free environment where you can freely buy" +
                            " or sell your spares whether used or new. Note that you" +
                            " can only receive your money after the buyer" +
                            " is satisfied with your product else" +
                            " your spare is going to be" +
                            " returned back to the seller in accordance with the policy",
                    color = Color.Green,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 25.sp

                )
            }
            Spacer(modifier = Modifier.height(300.dp))



//            Button(onClick = {
//                navController.navigate(ROUTE_HOME)
//            }, modifier = Modifier.fillMaxWidth(),
//                colors = ButtonDefaults.buttonColors(Color.Black)) {
//                Text(text = "Skip")
//                //Icon(imageVector = Icons.Filled.Home, contentDescription = "my profile", tint = Color.White)
//            }
//


//
//            Button(
//                onClick = { navController.navigate(ROUTE_LOGIN) },
//                colors = ButtonDefaults.buttonColors(Color.Black),
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Text(text = "<- Back to login",)
//                Icon(imageVector = Icons.Filled.KeyboardArrowLeft, contentDescription = "my profile", tint = Color.White)
//            }
//            IconButton(onClick = { /*TODO*/ }) {
//                Icon(imageVector = Icons.Filled.Place, contentDescription = "my profile", tint = Color.Black)
//            }



        }
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    AboutScreen(rememberNavController())
}