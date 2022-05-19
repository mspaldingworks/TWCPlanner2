package com.mad.e.twcplanner2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeScaffoldLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    var toolbarTitle by remember {
                        mutableStateOf("Home")
                    }
                    val scaffoldState =
                        rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))
                    val scope = rememberCoroutineScope()
                    Scaffold(
                        modifier = Modifier.background(Color.White),
                        scaffoldState = scaffoldState,
                        topBar = {
                            AppToolbar(
                                scaffoldState = scaffoldState,
                                scope = scope,
                                toolbarTitle = toolbarTitle
                            )
                        }, drawerContent = {
                            DrawerView(scaffoldState = scaffoldState, scope = scope)
                        },
                        content = {},
                        bottomBar = { AppBottomBar() },
                        snackbarHost = { state -> MySnackHost(state) },
                        isFloatingActionButtonDocked = true,
                        floatingActionButtonPosition = FabPosition.Center,
                        floatingActionButton = { MyFloatingButton(scaffoldState) }
                    )
                }
            }
        }

