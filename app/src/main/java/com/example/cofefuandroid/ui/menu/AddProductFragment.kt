package com.example.cofefuandroid.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.cofefuandroid.R

class AddProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_product, container, false)
        val act = activity

        val return_button = act?.findViewById<ImageView>(R.id.returnButton)
        val spinner = act?.findViewById<Spinner>(R.id.spinner2)

        return_button?.visibility = View.VISIBLE
        spinner?.visibility = View.GONE

        val manager = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
        return_button?.setOnClickListener {
            manager.remove(this).commit()
            return_button.visibility = View.GONE
            spinner?.visibility = View.VISIBLE
        }
        val button_add = view?.findViewById<Button>(R.id.button_add)

        button_add?.setOnClickListener {
            Toast.makeText(context, "11111", Toast.LENGTH_SHORT).show()
            manager.remove(this).commit()
            return_button?.visibility = View.GONE
            spinner?.visibility = View.VISIBLE
        }
        return view
    }


}