package com.example.cofefuandroid.ui.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.databinding.FragmentMenuBinding


class MenuItemRecyclerViewAdapter(
    private val context: Context?,
    private val values: List<ProductData>
) : RecyclerView.Adapter<MenuItemRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentMenuBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.nameProduct.text = item.getName()
        holder.price.text = item.getPrice()
        holder.discription.text = item.getDescription()
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        val nameProduct: TextView = binding.nameProduct
        val price: TextView = binding.price
        val discription: TextView = binding.discription

        override fun toString(): String {
            return super.toString() + " '" + nameProduct.text + "'"
        }
    }

}