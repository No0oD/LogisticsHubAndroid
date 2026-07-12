package com.example.logisticshub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route) {
            // LoginScreen() — поки заглушка
        }

        composable(route = Screen.Register.route) {
            // RegisterScreen()
        }

        composable(route = Screen.Dashboard.route) {
            // DashboardScreen()
        }

        composable(route = Screen.ShipmentsList.route) {
            // ShipmentsListScreen()
        }

        composable(route = Screen.ShipmentDetail.route) { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull()
            // ShipmentDetailScreen(id = id)
        }

        composable(route = Screen.WarehousesList.route) {
            // WarehousesListScreen()
        }

        composable(route = Screen.RoutesList.route) {
            // RoutesListScreen()
        }

        composable(route = Screen.DriversList.route) {
            // DriversListScreen()
        }

        composable(route = Screen.Track.route) { backStackEntry ->
            val trackingCode = backStackEntry.arguments?.getString("trackingCode")
            // TrackScreen(trackingCode = trackingCode)
        }
    }
}