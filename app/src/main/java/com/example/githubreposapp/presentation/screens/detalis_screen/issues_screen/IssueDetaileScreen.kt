package com.example.githubreposapp.presentation.screens.detalis_screen.issues_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.githubreposapp.R
import com.example.githubreposapp.presentation.screens.common_components.RepoAppBar
import com.example.githubreposapp.ui.theme.gray40

@ExperimentalMaterial3Api
@Composable
fun IssueItems(

    backgroundColor: Color = MaterialTheme.colorScheme.background,
    navController: NavController


) {

    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()

    )
    {
        Column {
            RepoAppBar(
                title = R.string.issue_app_bar,
                navController = navController

            )
        }
        LazyColumn {

            items(count = 7) { message ->
                Card(
                    Modifier
                        .fillMaxWidth()
                        .background(color = gray40)
                        .padding(horizontal = 10.dp, vertical = 3.dp)
                        .height(140.dp)) {
                    Row (
                        Modifier
                            .fillMaxWidth()
                            .background(color = backgroundColor)
                            .fillMaxHeight()
                        ,verticalAlignment = Alignment.CenterVertically
                        , horizontalArrangement = Arrangement.Start
                    ){
                        Column (modifier = Modifier
                            .padding(start = 5.dp, top = 15.dp)
                            .fillMaxHeight(), verticalArrangement = Arrangement.Top){
                            Image(painter = painterResource(id = R.drawable.isuueiconn), contentDescription ="Isuue icon" ,Modifier.size(60.dp))
                        }
                        Column (
                            Modifier
                                .width(240.dp)
                                .height(130.dp)
                                .padding(top = 15.dp, start = 8.dp)){
                            Text(
                                text = "Write issue and report details here",
                                 modifier = Modifier
                                        .padding(bottom = 15.dp, end = 20.dp),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            )
                            Text("None",Modifier.padding(bottom = 20.dp),style = TextStyle(fontSize = 22.sp, color = MaterialTheme.colorScheme.onBackground ))

                            Row {
                                Text("Created At : ",style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 17.sp, color = MaterialTheme.colorScheme.onBackground))
                                Text("2032-11-09 , ",style = TextStyle( fontSize = 15.sp))
                                Text("13:05",style = TextStyle( fontSize = 15.sp))
                            }
                        }
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .padding(top = 22.dp, end = 10.dp),
                            horizontalAlignment = Alignment.End
                        ){
                            Text(text = "Open",style = TextStyle( fontSize = 22.sp, color = MaterialTheme.colorScheme.onBackground))
                        }
                    }
                }
            }



        }


    }
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun previewIssueItems() {
    val navControlle = rememberNavController()
    IssueItems(navController = navControlle)

}