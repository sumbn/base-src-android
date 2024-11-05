package vn.sbnt.codebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import vn.sbnt.core.navigation.Animation
import vn.sbnt.core.navigation.Route
import vn.sbnt.codebase.ui.theme.PersonnelManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PersonnelManagementTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.Screen1
    ){
        composable<Route.Screen1>(
            enterTransition = Animation :: slideToLeft,
            exitTransition = Animation :: slideOutToLeft,
        ) {
            Sc1 {
                navController.navigate(Route.Sc2)
            }
        }
        composable<Route.Sc2> (
            enterTransition = Animation :: slideToLeft,
            exitTransition = Animation :: slideOutToLeft,
            ) {
            Sc2 {
                navController.navigate(Route.Screen1)
            }
        }
    }
}
