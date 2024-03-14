package ua.edu.lntu.cw_4

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.TaskListScreen.route) {
        composable(route = Screen.TaskListScreen.route) {
            TaskListScreen(navController = navController)
        }
    }
}