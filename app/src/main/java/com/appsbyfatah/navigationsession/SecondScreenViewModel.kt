package com.appsbyfatah.navigationsession

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
): ViewModel() {

    val secretNumber = savedStateHandle.get<String>("secretNumber")

}