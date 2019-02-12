package de.cknetsc.multiapp

import android.app.Application
import android.content.res.Configuration
import util.logger.loggingActive

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        loggingActive = true // Enable multiplatform logging
    }
}