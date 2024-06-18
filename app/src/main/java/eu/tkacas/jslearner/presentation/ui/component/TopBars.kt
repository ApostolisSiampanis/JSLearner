package eu.tkacas.jslearner.presentation.ui.component

import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import eu.tkacas.jslearner.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackAppTopBar(
    title: String = "",
    color: Color,
    onBackClick: () -> Unit
){
    TopAppBar(
        title = {
            Text(
                text = title
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    onBackClick()
                },
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = stringResource(id = R.string.go_back)
                    )
                }
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = color
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuAppTopBar(
    title: String = "",
    color: Color,
    onMenuClick: () -> Unit
){
    TopAppBar(
        title = {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    onMenuClick()
                },
                content = {
                    Image(
                        painter = painterResource(id = R.drawable.menu),
                        contentDescription = stringResource(id = R.string.open_menu)
                    )
                }
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = color
        )
    )
}