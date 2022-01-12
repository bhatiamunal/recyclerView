package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseBooleanArray
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var clist = ArrayList<Country>();
    lateinit var rev1 :RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rev1 = findViewById(R.id.rev1)
        clist.add(Country("m1",R.drawable.ic_launcher_background))
        clist.add(Country("m2",R.drawable.ic_launcher_background))
        clist.add(Country("m3",R.drawable.ic_launcher_background))
        var cadapter = CountryAdapter(this,clist)
        rev1.adapter = cadapter
        rev1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
}