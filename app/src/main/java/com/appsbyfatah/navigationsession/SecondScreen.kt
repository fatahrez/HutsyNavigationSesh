package com.appsbyfatah.navigationsession

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun SecondScreenUI() {
    val viewModel: SecondScreenViewModel = hiltViewModel()

    Text(text = "this is the second screen ${viewModel.secretNumber}")

}