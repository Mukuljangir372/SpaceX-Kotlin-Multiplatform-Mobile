package com.mukul.jan.spacex.data.local

import com.mukul.jan.spacex.data.local.model.RocketLaunchModel

internal interface RocketLaunchCache {
    fun getRocketLaunches(): List<RocketLaunchModel>
    fun deleteAllRocketLaunches()
    fun insertRocketLaunch(flightNum: Int, missionName: String)
}