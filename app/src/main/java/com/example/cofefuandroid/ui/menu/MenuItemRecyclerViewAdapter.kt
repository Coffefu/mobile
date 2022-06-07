package com.example.cofefuandroid.ui.menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.databinding.FragmentMenuBinding


class MenuItemRecyclerViewAdapter(
    private val context: Context?,
    private val fragment: Fragment,
    private val values: List<ProductData>
) : RecyclerView.Adapter<MenuItemRecyclerViewAdapter.MyViewHolder>() {
    var onItemClickItem: ((ProductData) -> Unit)? = null

    fun onClickItem() {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = FragmentMenuBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = values[position]
        holder.nameProduct.text = item.getName()
        holder.price.text = item.getPrice()
        holder.discription.text = item.getDescription()
    }

    override fun getItemCount(): Int = values.size

    inner class MyViewHolder(binding: FragmentMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nameProduct: TextView = binding.nameProduct
        val price: TextView = binding.price
        val discription: TextView = binding.discription

        override fun toString(): String {
            return super.toString() + " '" + nameProduct.text + "'"
        }

        init {
            itemView.setOnClickListener {
                onItemClickItem?.invoke(values[absoluteAdapterPosition])
            }
        }
    }

}