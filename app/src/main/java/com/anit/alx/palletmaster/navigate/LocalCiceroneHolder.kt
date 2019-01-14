package com.anit.alx.palletmaster.navigate

import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

/**
 * Created by agladkov on 11.01.18.
 * Performs subnNvigation for holding fragments state when clicks activity holder tabs
 */
class LocalCiceroneHolder {
    val containers: HashMap<String, Cicerone<Router>> = HashMap()

    fun getCicerone(containerTag: String): Cicerone<Router> {
        if (!containers.containsKey(containerTag)) {
            containers[containerTag] = Cicerone.create()
        }

        return containers[containerTag]!!
    }
}
