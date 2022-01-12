package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var start:Button
    lateinit var stop:Button
    var status:Boolean = false;
    var count : Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        start =  findViewById(R.id.start)
        stop =  findViewById(R.id.stop)
        start.setOnClickListener{
            status=true
            Thread({
                while (status){
                    count++
                    try {
                        Thread.sleep(3000)
                    }
                    catch (ie:InterruptedException){}
                    Log.i("Thread Doing","display $count")

                }
            }).start()
        }
        stop.setOnClickListener{
            status=false;
        }


    }
}