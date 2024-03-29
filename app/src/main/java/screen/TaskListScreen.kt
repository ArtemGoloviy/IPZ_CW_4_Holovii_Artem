package ua.edu.lntu.cw_4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ua.edu.lntu.cw_4.Task
import ua.edu.lntu.cw_4.ui.theme.IPZ_CW_4_Holovii_ArtemTheme

@Composable
fun TaskListScreen(modifier: Modifier = Modifier, navController: NavController) {
    val taskList =
        (1..100).map {
            Task("Task $it", "Description $it", listOf(true, false).random())
        }.toMutableList()

    LazyColumn {
        items(taskList) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = it.getColor()
                )
            ) {
                Column {
                    Text(text = it.name, style = TextStyle(fontSize = 36.sp))
                }
            }
        }
    }
}

@Preview
@Composable
fun TaskListScreenPreview() {
    IPZ_CW_4_Holovii_ArtemTheme {
        TaskListScreen(navController = NavController(LocalContext.current))
    }
}
