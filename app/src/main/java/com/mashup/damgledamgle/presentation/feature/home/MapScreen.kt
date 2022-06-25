package com.mashup.damgledamgle.presentation.feature.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.naver.maps.map.compose.*

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun MapScreen() {
    val mapProperties by remember {
        mutableStateOf(
                MapProperties(maxZoom = 10.0, minZoom = 5.0)
        )
    }
    val mapUiSettings by remember {
        mutableStateOf(
                MapUiSettings(isLocationButtonEnabled = false)
        )
    }
    Box(Modifier.fillMaxSize()) {
        NaverMap(properties = mapProperties, uiSettings = mapUiSettings)
    }
}
