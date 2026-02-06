package com.anibalofice.simpletask

import SignUpScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.anibalofice.simpletask.views.LoginScreen


@Composable
fun MyAppRouter(
    navController: NavHostController,
    startDestination: String = AppRouter.LOGIN.router,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(AppRouter.LOGIN.router) {
            LoginScreen()
        }

    }
}

enum class AppRouter(val router:String){
    HOME("home"),
    LOGIN("login"),
    SIGNUP("signup")

}