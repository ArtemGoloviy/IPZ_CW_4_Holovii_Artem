package ua.edu.lntu.cw_4

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.lntu.cw_4.ui.theme.IPZ_CW_4_Holovii_ArtemTheme

@Composable
fun TaskListScreen(modifier: Modifier = Modifier) {

    LazyColumn {

    }
}

@Preview
@Composable
fun TaskListScreen() {
    IPZ_CW_4_Holovii_ArtemTheme {
        TaskListScreen()
    }
}
