package com.example.qrable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.shop_cell.*
import kotlinx.android.synthetic.main.shop_cell.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list : MutableList<MutableMap<String,String>> = mutableListOf()
        val item = mutableMapOf("name" to "you", "price" to "we")
        list.add(item)
        val layout = LinearLayoutManager(applicationContext)

        val adapter = RecyclerListAdapter(list)
        lvMenu.setHasFixedSize(true)
        lvMenu.adapter = adapter
        lvMenu.layoutManager = layout
    }
    private inner class RecyclerListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }
    private inner class RecyclerListAdapter(private val _listData: MutableList<MutableMap<String,String>>)
        : RecyclerView.Adapter<RecyclerListViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerListViewHolder {

            val inflater = LayoutInflater.from(applicationContext)
            val view = inflater.inflate(R.layout.shop_cell,parent,false)
            return RecyclerListViewHolder(view)
        }

        override fun onBindViewHolder(holder: RecyclerListViewHolder, position: Int) {
            val item = _listData[position]
            val menuName = item["name"] as String
         //   val menuPrice = item["price"] as String
            val view = holder.itemView
            view.sample_text.text = menuName
        }

        override fun getItemCount(): Int {
            return _listData.size
        }
    }


}
