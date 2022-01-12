package com.example.recyclerview

import android.content.Context
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class CountryAdapter(var context: Context,var list:ArrayList<Country>):
    RecyclerView.Adapter<CountryAdapter.CountryVieHolder>() {

    class CountryVieHolder(view: View):RecyclerView.ViewHolder(view){
        lateinit var imageView : ImageView
        lateinit var textView : TextView
        lateinit var checkbox: CheckBox
        init{
            imageView = view.findViewById(R.id.image_view)
            textView = view.findViewById(R.id.text_view)
            checkbox = view.findViewById(R.id.checkbox)
        }
    }
    override fun getItemCount():Int{
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryVieHolder {
        var myView:View = LayoutInflater.from(context).inflate(R.layout.layout_rv,null)
        return CountryVieHolder(myView)
    }
    override fun onBindViewHolder(holder:CountryVieHolder,position:Int){

        holder.imageView.setImageResource(list.get(position).image)
        holder.textView.text = list.get(position).name
    }
}