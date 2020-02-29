package com.example.qrable

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shop_cell.view.*

public class MyRecyclerViewAdapter(private val list: List<RowData>): RecyclerView.Adapter<MyRecyclerViewHolder>() {
    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shop_cell,parent,false)
        Log.d("create",parent.toString())
        return MyRecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecyclerViewHolder, position: Int) {
        Log.d("bind","$holder $position")
        holder.itemView.shopName.text = list[position].name
        holder.itemView.shopImage.setImageResource(list[position].imageId)
      //  holder.rowData = list[position]
    }
}
