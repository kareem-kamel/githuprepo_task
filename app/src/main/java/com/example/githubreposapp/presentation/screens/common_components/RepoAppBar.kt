package com.example.githubreposapp.presentation.screens.common_components

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.githubreposapp.R


@ExperimentalMaterial3Api
@Composable
fun RepoAppBar(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
    color: Color = MaterialTheme.colorScheme.surface,
    showBackButton: Boolean = true,
    onBackButtonClicked: () -> Unit,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                stringResource(title),
                style = titleStyle,
            )
        },
        modifier = modifier.background(color),
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = onBackButtonClicked) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_arrow)
                    )
                }
            }
        }
    )
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewRepoAppBar() {

        RepoAppBar(title = R.string.details_app_bar_title) {

            }

}