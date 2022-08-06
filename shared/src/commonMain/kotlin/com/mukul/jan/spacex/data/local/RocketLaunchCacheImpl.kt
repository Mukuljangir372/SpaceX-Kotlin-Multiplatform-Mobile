package com.mukul.jan.spacex.data.local

import com.mukul.jan.spacex.data.local.model.RocketLaunchModel

internal class RocketLaunchCacheImpl(
    database: SpaceXAppDatabase,
): RocketLaunchCache {
    private val dbQuery = database.rocketLaunchQueries

    override fun getRocketLaunches(): List<RocketLaunchModel> {
        return dbQuery.getAllRocketLaunches { flightNumber, missionName ->
            RocketLaunchModel(flightNumber, missionName)
        }.executeAsList()
    }

    override fun deleteAllRocketLaunches() {
        dbQuery.removeAllRocketLaunches()
    }

    override fun insertRocketLaunch(flightNum: Int, missionName: String) {
        dbQuery.insertRocketLaunch(flightNum.toLong(),missionName)
    }

}