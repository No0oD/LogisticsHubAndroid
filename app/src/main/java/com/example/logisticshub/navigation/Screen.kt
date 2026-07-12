package com.example.logisticshub.navigation

sealed class Screen( val route: String) {
    data object Login : Screen("login")
    data object Register : Screen("register")
    data object Dashboard : Screen("dashboard")
    data object ShipmentsList : Screen("shipmentsList")
    data object ShipmentDetail : Screen("shipment/{id}") {
        fun createRoute(id: Int) = "shipment/$id"
    }
    data object WarehousesList : Screen("warehousesList")
    data object RoutesList : Screen("routesList")
    data object DriversList : Screen("driversList")
    data object Track  : Screen("track/{trackingCode}"){
        fun createRoute(trackingCode: String) = "track/$trackingCode"
    }
}