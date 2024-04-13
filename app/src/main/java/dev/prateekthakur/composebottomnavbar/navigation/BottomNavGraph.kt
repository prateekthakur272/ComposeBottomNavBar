package dev.prateekthakur.composebottomnavbar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.prateekthakur.composebottomnavbar.screens.HomeScreen
import dev.prateekthakur.composebottomnavbar.screens.ProfileScreen
import dev.prateekthakur.composebottomnavbar.screens.SearchScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route){
        composable(route = BottomBarScreen.Home.route){ HomeScreen()}
        composable(route = BottomBarScreen.Profile.route){ ProfileScreen()}
        composable(route = BottomBarScreen.Search.route){ SearchScreen()}
    }
}