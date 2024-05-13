package com.example.spares.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app2.ui.theme.screen.products.AddProductsScreen
import com.example.app2.ui.theme.screen.products.UpdateProductsScreen
import com.example.app2.ui.theme.screen.products.ViewProductsScreen
import com.example.app2.ui.theme.screen.products.ViewUploadsScreen
import com.example.spares.ui.theme.screen.about.AboutScreen
import com.example.spares.ui.theme.screen.home.HomeScreen
import com.example.spares.ui.theme.screen.login.LoginScreen
import com.example.spares.ui.theme.screen.register.RegisterScreen
import com.example.spares.ui.theme.screen.welcome.WelcomeScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination : String = ROUTE_ADD_PRODUCT){
    NavHost(navController = navController, modifier= modifier, startDestination= startDestination ){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
        composable(ROUTE_WELCOME){
            WelcomeScreen(navController)
        }





    }

}