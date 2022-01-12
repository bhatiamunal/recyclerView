package com.example.recyclerview

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class broadcast : AppCompatActivity() {
    lateinit var tv1:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        tv1= findViewById(R.id.m1)
        registerReceiver(MyBroadCast(), IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }
    inner class MyBroadCast:BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            var blevel:Int = intent!!.getIntExtra("level",0)
            tv1.text ="charge level is $blevel";
        }
    }
}
