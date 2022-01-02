package dev.shreyansh.activitylifecycle

import android.app.Application
import timber.log.Timber

class AcitivityLifecycleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}