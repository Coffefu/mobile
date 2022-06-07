package com.example.cofefuandroid.ui.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.databinding.FragmentMenuCategoryBinding


class MenuCategoryRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<Category>
) : RecyclerView.Adapter<MenuCategoryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentMenuCategoryBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.categoryName.text = item.name
        holder.recyclerView.adapter = MenuItemRecyclerViewAdapter(context, item.listOfItems)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentMenuCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val categoryName: TextView = binding.categoryName
        val recyclerView: RecyclerView = binding.categoryRecyclerView
    }
}

