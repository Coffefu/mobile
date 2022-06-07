package com.example.cofefuandroid.location

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
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

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val mViewHolder: RecyclerView.ViewHolder? = null
        val convertView = LayoutInflater.from(context)
            .inflate(R.layout.location_adapter, parent, false)

        val name: TextView = convertView.findViewById(R.id.name)
        val placement: TextView = convertView.findViewById(R.id.placement)
        val date: TextView = convertView.findViewById(R.id.date)

        name.text = locationList?.get(position)?.getName()
        placement.text = locationList?.get(position)?.getPlacement()
        date.text = locationList?.get(position)?.getTime()
        return convertView
    }

    private val context: Context
    private val locationList: List<locationData>?

    init {
        this.context = context
        this.locationList = locationList
    }
}
