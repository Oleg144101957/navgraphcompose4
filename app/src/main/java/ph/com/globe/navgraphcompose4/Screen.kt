package ph.com.globe.navgraphcompose4

sealed class Screen(val route: String){
    object MainScreen: Screen("main_screen")
    object SecondScreen: Screen("second_screen")
    object ThirdScreen: Screen("third_screen")
}
