package com.appsbyfatah.navigationsession

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(Screen.HomeScreen.route) {
            HomeScreenUI(navController)
        }

        composable(Screen.SecondScreen.route + "/{secretNumber}") {
            SecondScreenUI()
        }
    }
}

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")

    object SecondScreen: Screen("second_screen")
}