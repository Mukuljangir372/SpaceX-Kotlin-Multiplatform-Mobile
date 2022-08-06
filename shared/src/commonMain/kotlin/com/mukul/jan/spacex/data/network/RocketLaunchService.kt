package com.mukul.jan.spacex.data.network

import com.mukul.jan.spacex.data.network.model.NetworkRocketLaunch

interface RocketLaunchService {
    suspend fun getLaunches(): List<NetworkRocketLaunch>
}