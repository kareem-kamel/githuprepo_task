package com.example.githubreposapp.presentation.screens.detalis_screen.repo_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.screens.common_components.RepoAppBar
import com.example.githubreposapp.presentation.screens.detalis_screen.repo_screen.MyApp
import com.example.githubreposapp.presentation.screens.detalis_screen.issues_screen.IssueItems
import com.example.githubreposapp.ui.theme.Purple80
import com.example.githubreposapp.ui.theme.gray40

@ExperimentalMaterial3Api
@Composable
fun MyApp(
    surfaceColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    navController: NavController
)
{


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color =  gray40),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Column {
            RepoAppBar(
                title = R.string.details_app_bar_title,
                navController = navController

            )
        }

        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Google Logo",
            modifier = Modifier
                .size(150.dp) // Width and height for logo image
                .padding(top = 10.dp)
        )

        // Spacer between rows
        Spacer(modifier = Modifier.height(15.dp))

        // Row 2: Title Text
        Text(text = "language", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        // Spacer between rows
        Spacer(modifier = Modifier.height(15.dp))

        // Row 3: Statistics Row
        Row(verticalAlignment = Alignment.CenterVertically) {
            // Column 1: Star icon and text
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "Stars",
                    modifier = Modifier.size(36.dp) // Width and height for star image
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "1525" , fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.width(30.dp))

            // Column 2: Python icon and text
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.python),
                    contentDescription = "Python",
                    modifier = Modifier.size(36.dp) // Width and height for python image
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Python", fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.width(30.dp))

            // Column 3: Fork icon and text
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.code),
                    contentDescription = "Forks",
                    modifier = Modifier.size(36.dp) // Width and height for fork image
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "347", fontSize = 16.sp)
            }
        }

        // Spacer between rows
        Spacer(modifier = Modifier.height(30.dp))

        // Row 4: Description Text
        Text(
            text = "Shared repository for open-sourced projects from the Google AI Language team.",
            fontSize = 24.sp,
            modifier = Modifier.padding(horizontal = 24.dp)
        )

        // Spacer between rows
        Spacer(modifier = Modifier.weight(1f))

        // Row 5: Button
        Button(
            onClick = { navController.navigate("issueitems") },
            modifier = Modifier
                .wrapContentSize()
                .padding(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1C75BB)
            )
        ) {
            Text(text = "Show Issues", fontSize = 22.sp)
        }
    }
}
@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    val navController = rememberNavController()
    MyApp(navController = navController)
}