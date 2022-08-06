package com.mukul.jan.spacex.data.network

import com.mukul.jan.spacex.data.network.model.NetworkRocketLaunch
import io.ktor.client.*
import io.ktor.client.request.*


class RocketLaunchServiceImpl(
    private val httpClient: HttpClient
) : RocketLaunchService {

    companion object {
        private const val BASE_URL = "https://api.spacexdata.com/v3/launches"
    }

    override suspend fun getLaunches(): List<NetworkRocketLaunch> {
        return httpClient.get(BASE_URL)
    }
}