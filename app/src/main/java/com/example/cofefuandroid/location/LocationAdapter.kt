package com.example.cofefuandroid.location

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cofefuandroid.R

class LocationAdapter(context: Context, locationList: List<locationData>) : BaseAdapter() {
    override fun getCount(): Int {
        return locationList?.size ?: 0
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val cssd = myView(position, convertView, parent)
        cssd.setBackgroundColor(
            ContextCompat.getColor(
                context,
                R.color.turquoise
            )
        )
        return cssd
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return myView(position, convertView, parent)
    }

    private fun myView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val list = getItem(position)
        val rootView = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.location_adapter, parent, false)

        list.let {
            val name: TextView = rootView.findViewById(R.id.name)
            val placement: TextView = rootView.findViewById(R.id.placement)
            val date: TextView = rootView.findViewById(R.id.date)

            name.text = locationList?.get(position)?.getName()
            placement.text = locationList?.get(position)?.getPlacement()
            date.text = locationList?.get(position)?.getTime()
        }

        return rootView
    }

    private val context: Context
    private val locationList: List<locationData>?

    init {
        this.context = context
        this.locationList = locationList
    }
}
