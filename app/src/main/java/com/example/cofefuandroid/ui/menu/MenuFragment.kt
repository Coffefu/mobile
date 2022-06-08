package com.example.cofefuandroid.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ahmadhamwi.tabsync.TabbedListMediator
import com.example.cofefuandroid.databinding.FragmentMenuListBinding
import com.example.cofefuandroid.location.Data.productsList
import com.example.cofefuandroid.location.Data.productsList2


class MenuFragment : Fragment() {
    private lateinit var binding: FragmentMenuListBinding

    val tabNames = arrayOf("Кофе", "Не кофе")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuListBinding.inflate(inflater, container, false)
        val view = binding.root
        val tabLayout = binding.tabLayout
        val recyclerView = binding.productRecyclerView

        for (category in tabNames) {
            tabLayout.addTab(tabLayout.newTab().setText(category))
        }
        val a = Category("Кофе", productsList)
        val b = Category("Не кофе", productsList2)
        val vvv = mutableListOf(a, b)

        val adapter = MenuCategoryRecyclerViewAdapter(context, this, vvv)
        recyclerView.adapter = adapter
        TabbedListMediator(recyclerView, tabLayout, vvv.indices.toList(), true).attach()

        return view
    }

}