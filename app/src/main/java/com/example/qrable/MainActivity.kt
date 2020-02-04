package com.example.qrable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private inner class RecyclerListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }
    /*
    private inner class RecyclerlistAdapter(private val _listdata: MutableList<MutableMap<String,Any>>)
        : RecyclerView.Adapter<RecyclerListViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerListViewHolder {

            val inflater = LayoutInflater.from(applicationContext)
            val view = inflater.inflate(R.layout.shop_cell,parent,false)
            return RecyclerListViewHolder(view)
        }
    }

     */

}
