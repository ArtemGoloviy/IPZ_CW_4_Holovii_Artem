package ua.edu.lntu.cw_4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ua.edu.lntu.cw_4.ui.theme.IPZ_CW_4_Holovii_ArtemTheme

@Composable
fun TaskDetailScreen(modifier: Modifier = Modifier, navController: NavController, task: Task) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = task.getColor()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(task.name, style = TextStyle(fontSize = 64.sp))
        Text(task.description, style = TextStyle(fontSize = 24.sp))

        Switch(checked = task.isActive, onCheckedChange ={

        })
    }

}

@Preview
@Composable
fun TaskDetailScreenPreview() {
    IPZ_CW_4_Holovii_ArtemTheme {
        TaskDetailScreen(
            navController = NavController(LocalContext.current),
            task = Task("Title", "Description", true)
        )
    }
}

@Preview
@Composable
fun TaskDetailScreenPreviewWithFalse() {
    IPZ_CW_4_Holovii_ArtemTheme {
        TaskDetailScreen(
            navController = NavController(LocalContext.current),
            task = Task("Title", "Description", false)
        )
    }
}