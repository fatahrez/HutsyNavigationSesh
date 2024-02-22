package com.appsbyfatah.navigationsession

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreenUI(
    navController: NavController
) {
    Column {
        Text(
            text = "This is our main screen",
            style = MaterialTheme.typography.headlineSmall
        )

        Button(
            onClick = {
                navController.navigate(Screen.SecondScreen.route + "/${4}")
            },
            modifier = Modifier
                .height(68.dp)
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "second screen")
        }
    }

}