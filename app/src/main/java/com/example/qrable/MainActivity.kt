package com.example.qrable

import android.content.Intent
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

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf(
            RowData("hoge",R.drawable.ic_launcher_background),
            RowData("fuga",R.drawable.ic_launcher_foreground)
        )
        setSupportActionBar(toolBar)
        recyclerView = lvMenu
        viewManager = LinearLayoutManager(this)
        viewAdapter = MyRecyclerViewAdapter(list,OnCellClick())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }
    inner class OnCellClick: View.OnClickListener{
        override fun onClick(v: View?) {
            val intent = Intent(application,LauncherActivity::class.java)
            startActivity(intent)
        }
    }
}
class RowData(val name: String,val imageId: Int){
}
