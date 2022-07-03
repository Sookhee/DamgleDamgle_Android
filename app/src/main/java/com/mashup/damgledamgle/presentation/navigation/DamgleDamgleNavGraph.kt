package com.mashup.damgledamgle.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mashup.damgledamgle.presentation.feature.home.HomeScreen
import com.mashup.damgledamgle.presentation.feature.mypage.MypageScreen
import com.mashup.damgledamgle.presentation.feature.splash.SplashScreen
import com.mashup.damgledamgle.presentation.feature.splash.SplashViewModel

@Composable
fun DamgleDamgleNavGraph(navController: NavHostController, splashViewModel: SplashViewModel) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController, viewModel = splashViewModel)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Mypage.route) {
            MypageScreen(navController = navController)
        }
    }
}
