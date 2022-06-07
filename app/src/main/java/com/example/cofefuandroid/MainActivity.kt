package com.example.cofefuandroid

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.cofefuandroid.databinding.ActivityMainBinding
import com.example.cofefuandroid.location.Data.locationList
import com.example.cofefuandroid.location.LocationAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var locationadapter: LocationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        navView.setupWithNavController(navController)

        val spinner_location_coffee = binding.spinner2
        locationadapter = LocationAdapter(this, locationList)
        spinner_location_coffee.adapter = locationadapter

    }
}