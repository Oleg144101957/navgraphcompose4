package ph.com.globe.navgraphcompose4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.route
    ){
        composable(route = Screen.MainScreen.route){
            MainScreen(navController)
        }

        composable(route = Screen.SecondScreen.route){
            SecondScreen()
        }

        composable(route = Screen.ThirdScreen.route){
            ThirdScreen()
        }
    }


}

@Composable
fun ThirdScreen() {
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "The third Screen")
    }
}


@Composable
fun MainScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Main Screen")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate(Screen.SecondScreen.route) }) {
            Text(text = "Go to the second activity")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate(Screen.ThirdScreen.route) }) {
            Text(text = "Go to the third activity")
        }
    }
}

@Composable
fun SecondScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "Second Screen")
    }
}