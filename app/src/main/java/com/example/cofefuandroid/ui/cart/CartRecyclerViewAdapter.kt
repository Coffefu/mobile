package com.example.cofefuandroid.ui.cart

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.databinding.FragmentCartListBinding
import com.example.cofefuandroid.ui.menu.ProductData


class CartRecyclerViewAdapter(
    private val context: Context?,
    private val fragment: Fragment,
    private val values: List<ProductData>,
) : RecyclerView.Adapter<CartRecyclerViewAdapter.MyViewHolder>() {


    interface CartRecyclerViewAdapterInterface {
        fun onClick(position: Int, data: ProductData)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            FragmentCartListBinding.inflate(LayoutInflater.from(context), parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = values[position]
        holder.nameProduct.text = item.getName()
        holder.price.text = item.getCurrentPrice()
    }

    fun removeItem(position: Int) {
        values.drop(position)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = values.size


    inner class MyViewHolder(binding: FragmentCartListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val nameProduct: TextView = binding.nameProduct
        val price: TextView = binding.price
        val delete: ImageButton = binding.imageButton

    }

}

