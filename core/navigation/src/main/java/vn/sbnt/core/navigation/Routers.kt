package vn.sbnt.core.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Screen1: Route

    @Serializable
    data object Sc2: Route

}