package com.example.app2.ui.theme.screen.products


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.spares.R
import com.example.spares.data.ProductViewModel
import com.example.spares.models.Product
import com.example.spares.navigation.ROUTE_ADD_PRODUCT
import com.example.spares.navigation.ROUTE_HOME
import com.example.spares.navigation.ROUTE_UPDATE_PRODUCT
import com.example.spares.navigation.ROUTE_VIEW_PRODUCT


@Composable
fun ViewProductsScreen(navController:NavHostController) {

    Box {
        Image(painter = painterResource(id = R.drawable.tt),
            contentDescription = "v6",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())






        Column(
//            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val context = LocalContext.current
            val productRepository = ProductViewModel(navController, context)
            val emptyProductState = remember { mutableStateOf(Product("", "", "", ""))}
            val emptyProductsListState = remember { mutableStateListOf<Product>()}
            val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)





               Spacer(modifier = Modifier.height(20.dp))

                LazyColumn() {
                    items(products) {
                        ProductItem(
                            name = it.name,
                            quantity = it.quantity,
                            price = it.price,
                            id = it.id,
                            navController = navController,
                            productRepository = productRepository
                        )
                    }

                }

            BottomAppBar(
                actions = {
                    IconButton(onClick = {navController.navigate(ROUTE_HOME) }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Home"
                        )
                    }
                    IconButton(onClick = {navController.navigate(ROUTE_VIEW_PRODUCT) }) {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.DateRange,
                            contentDescription = "Localized description",
                        )
                    }

                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { navController.navigate(ROUTE_ADD_PRODUCT) },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )
            Text(
                text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Green,
                fontWeight = FontWeight.Bold
            )



        }
    }

}



@Composable
fun ProductItem(name:String, quantity:String, price:String, id:String,
                navController:NavHostController, productRepository: ProductViewModel
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = quantity)
        Text(text = price)
        Button(onClick = {
            productRepository.deleteProduct(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate(ROUTE_UPDATE_PRODUCT+"/$id")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun view() {
    ViewProductsScreen(rememberNavController())

}





