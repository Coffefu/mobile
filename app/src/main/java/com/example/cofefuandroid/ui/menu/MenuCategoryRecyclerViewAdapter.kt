package com.example.cofefuandroid.ui.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.R
import com.example.cofefuandroid.databinding.FragmentMenuCategoryBinding


class MenuCategoryRecyclerViewAdapter(
    private val context: Context?,
    private val fragment: Fragment,
    private val values: List<Category>
) : RecyclerView.Adapter<MenuCategoryRecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            FragmentMenuCategoryBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = values[position]
        holder.categoryName.text = item.name
        val adapter =
            MenuItemRecyclerViewAdapter(context, fragment, item.listOfItems)
        holder.recyclerView.adapter = adapter
        adapter.onItemClickItem = {

            val myFragment = AddProductFragment()
            val manager = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
            manager.add(R.id.nav_host_fragment_activity_main, myFragment)
            manager.addToBackStack(null)
            manager.commit()


        }

    }

    override fun getItemCount(): Int = values.size

    inner class MyViewHolder(binding: FragmentMenuCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val categoryName: TextView = binding.categoryName
        val recyclerView: RecyclerView = binding.categoryRecyclerView


    }
}

