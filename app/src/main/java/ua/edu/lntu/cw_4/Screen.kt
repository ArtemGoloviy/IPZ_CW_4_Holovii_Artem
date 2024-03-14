package ua.edu.lntu.cw_4

sealed class Screen(val route:String){
    data object TaskListScreen : Screen(route = "task_list_screen")
}