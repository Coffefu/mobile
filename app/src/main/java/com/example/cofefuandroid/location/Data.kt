package com.example.cofefuandroid.location

import com.example.cofefuandroid.ui.menu.ProductData

object Data {
    val locationList: List<locationData>
        get() {
            val locationList: MutableList<locationData> = ArrayList()
            val first = locationData()
            first.setName("Полка кофе")
            first.setPlacement("D7 около D737")
            first.setTimeStart("08:00:00")
            first.setTimeFinish("18:00:00")
            locationList.add(first)

            val second = locationData()
            second.setName("Полка кофе")
            second.setPlacement("E3 около E311")
            second.setTimeStart("08:00:00")
            second.setTimeFinish("18:00:00")
            locationList.add(second)

            return locationList
        }

    val productsList: List<ProductData>
        get() {
            val productsList: MutableList<ProductData> = ArrayList()

            for (i in 1..15) {
                val dd = ProductData()
                dd.setName("'латте'+'$i'")
                dd.setType(0)
                dd.setDescription("Это латтттеееее")
                productsList.add(dd)
            }

            return productsList
        }
    val productsList2: List<ProductData>
        get() {
            val productsList: MutableList<ProductData> = ArrayList()

            for (i in 1..15) {
                val dd = ProductData()
                dd.setName("маттче")
                dd.setType(0)
                dd.setDescription("Это матчеееее")
                productsList.add(dd)
            }


            return productsList
        }
}