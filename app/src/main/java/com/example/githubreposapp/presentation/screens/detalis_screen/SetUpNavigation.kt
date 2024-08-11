package com.example.githubreposapp.presentation.screens.detalis_screen

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubreposapp.presentation.screens.detalis_screen.issues_screen.IssueItems
import com.example.githubreposapp.presentation.screens.detalis_screen.repo_screen.MyApp

@ExperimentalMaterial3Api
@Composable
fun SetUp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = "myapp") {
        composable("myapp") {
            MyApp(navController = navController)
        }
        composable("issueitems") {
            IssueItems(navController = navController)
        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    SetUp()
}