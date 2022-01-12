package com.example.recyclerview
/*
*    2 form of services :
*                      activity          service
*   started service -  startService() -> onCreate() - onStartCommand()
*                      stopService -> onDestroy()
*   bounded service  - bindService()-> onBind()
* */
import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}