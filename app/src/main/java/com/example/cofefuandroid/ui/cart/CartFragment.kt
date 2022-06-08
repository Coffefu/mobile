package com.example.cofefuandroid.ui.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cofefuandroid.databinding.FragmentCartBinding
import com.example.cofefuandroid.location.Data.productsList


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    private lateinit var adapter: CartRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)
        val view = binding.root
        val recyclerView = binding.recyclerView

        val mLayoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = mLayoutManager
        adapter = CartRecyclerViewAdapter(context, this, productsList)
        recyclerView.adapter = adapter
        return view
    }
}