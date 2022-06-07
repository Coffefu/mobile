package com.example.cofefuandroid.location

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*

@Entity(tableName = "location")
class locationData : Serializable {

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    @ColumnInfo(name = "name")
    private var name: String = ""

    @ColumnInfo(name = "placement")
    private var placement: String = ""

    @ColumnInfo(name = "open_time")
    private var _open_time: String = ""

    @ColumnInfo(name = "close_time")
    private var _close_time: String = ""

    @ColumnInfo(name = "currentime")
    private var currentTime = ""


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
        val sdf = SimpleDateFormat("hh:mm:ss", Locale.ENGLISH)
//        val sdf_start = sdf.format(_open_time)
//        val sdf_finish = sdf.format(_close_time)
//        this.currentTime = "'$sdf_start-$sdf_finish'"
        this.currentTime = "'$_open_time-$_close_time'"
        return currentTime
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setPlacement(placement: String) {
        this.placement = placement
    }

    fun setTimeStart(time: String) {
        this._open_time = time
    }

    fun setTimeFinish(time: String) {
        this._close_time = time
    }
}