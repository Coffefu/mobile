package com.example.cofefuandroid.location

import kotlinx.serialization.Serializable
import java.text.SimpleDateFormat
import java.util.*


@Serializable
class Location(val setName: Unit) {
    private val id: Int = 0
    private val name: String = ""
    private val placement: String = ""
    private val _open_time: String = ""
    private val _close_time: String = ""

    private val sdf = SimpleDateFormat("hh:mm:ss", Locale.ENGLISH)
    private val sdf_start = sdf.format(_open_time)
    private val sdf_finish = sdf.format(_close_time)
    private val currentDate = "'$sdf_start-$sdf_finish'"

    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }

    fun getPlacement(): String {
        return placement
    }

    fun getTime(): String {

        return currentDate
    }

}