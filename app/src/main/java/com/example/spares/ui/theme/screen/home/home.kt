package com.example.spares.ui.theme.screen.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spares.R
import com.example.spares.navigation.ROUTE_ABOUT
import com.example.spares.navigation.ROUTE_ADD_PRODUCT
import com.example.spares.navigation.ROUTE_HOME
import com.example.spares.navigation.ROUTE_VIEW_PRODUCT
import com.example.spares.navigation.ROUTE_VIEW_UPLOAD


@Composable
fun HomeScreen(navController: NavController) {


    Box {
        Image(
            painter = painterResource(id = R.drawable.v6),
            contentDescription = "v6",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )



        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var context = LocalContext.current
            //var productdata=productviewmodel(navController,context)



            BottomAppBar(
                actions = {
                    IconButton(onClick = {navController.navigate(ROUTE_ABOUT) }) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            contentDescription = "ABOUT"
                        )
                    }
                    IconButton(onClick = {navController.navigate(ROUTE_VIEW_PRODUCT)}) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = "Localized description",
                        )
                    }
//                    IconButton(onClick = {}) {
//                        Icon(
//                            Icons.Filled.Star,
//                            contentDescription = "Localized description",
//                        )
//                    }
//                    IconButton(onClick = { }) {
//                        Icon(
//                            Icons.Filled.DateRange,
//                            contentDescription = "Localized description",
//                        )
//                    }

                }
                ,
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { navController.navigate(ROUTE_VIEW_UPLOAD) },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.AccountCircle, "Localized description")
                    }
                }
            )





                Spacer(modifier = Modifier.height(140.dp))



            Column (modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {


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


//                Spacer(modifier = Modifier.height(20.dp))
                Row() {
                    ElevatedButton(onClick = {
                        navController.navigate(ROUTE_VIEW_UPLOAD)

                    }) {
                        Text(text = "MY SALES")
                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    ElevatedButton(onClick = {
                        navController.navigate(ROUTE_VIEW_PRODUCT)

                    }) {
                        Text(text = "VIEW AVAILABLE PRODUCTS")
                    }
                }


                Button(
                    onClick = {
                        navController.navigate(ROUTE_VIEW_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Icon(
                            imageVector = Icons.Filled.ShoppingCart,
                            contentDescription = "my profile",
                            tint = Color.Yellow
                        )
                    Text(
                        text = "Shop for products",
                        color = Color.Yellow
                    )

                }
                Button(
                    onClick = {
                        navController.navigate(ROUTE_ADD_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(
                        text = "Sell your spares",
                        color = Color.Yellow
                    )
                }
                Spacer(modifier = Modifier.height(80.dp))


            }
        }
    }
}



@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}









//Card(
//modifier = Modifier
////.fillMaxWidth()
//.padding(10.dp)
//.height(50.dp)
//.aspectRatio(1f), colors = CardDefaults.cardColors(
//containerColor = Color.Yellow
//
//)
//) {
//    IconButton(onClick = { /*TODO*/ }) {
//        Icon(
//            imageVector = Icons.Filled.Build,
//            contentDescription = "my profile",
//            tint = Color.Black
//        )
//
//    }
//
//}



//
//            Card(
//                modifier = Modifier
//                    .padding(10.dp)
//                    .height(100.dp)
//                    .fillMaxWidth()
//                    .aspectRatio(6f), colors = CardDefaults.cardColors(
//                    containerColor = Color.Black
//                ),
//                elevation = CardDefaults.cardElevation(10.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .padding(16.dp)
//                        .fillMaxWidth(),
//                    horizontalArrangement = Arrangement.SpaceBetween,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(
//                            imageVector = Icons.Filled.Menu,
//                            contentDescription = "Icon 1",
//                            tint = Color.Yellow,
//                            modifier = Modifier.size(48.dp)
//                        )
//
//                    }
//                    Spacer(modifier = Modifier.width(16.dp))
//                    IconButton(onClick = { /*TODO*/ }) {
//                        Icon(
//                            imageVector = Icons.Filled.ShoppingCart,
//                            contentDescription = "my profile",
//                            tint = Color.Yellow, modifier = Modifier.size(48.dp)
//                        )
//                    }
//                    Spacer(modifier = Modifier.width(16.dp))
//
//                    IconButton(onClick = { navController.navigate(ROUTE_VIEW_PRODUCT) }) {
//                        Icon(
//                            imageVector = Icons.Filled.Person,
//                            contentDescription = "my profile",
//                            tint = Color.Yellow, modifier = Modifier.size(48.dp)
//                        )
//                    }
//
//                }
//            }
//
