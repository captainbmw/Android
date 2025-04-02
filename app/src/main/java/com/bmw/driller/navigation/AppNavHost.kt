package com.bmw.driller.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bmw.driller.ui.theme.screens.home.HomeScreen
import com.bmw.driller.ui.theme.screens.login.Login_Screen
import com.bmw.driller.ui.theme.screens.register.Register_Screen

@Composable
fun AddNavHost(modifier: Modifier = Modifier,navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(navController=navController,modifier=Modifier, startDestination =startDestination, ){
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            Login_Screen(navController)
        }
       composable(ROUTE_REGISTER){
           Register_Screen(navController)
       }
    }


}