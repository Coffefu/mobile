package com.example.cofefuandroid.ui.menu

import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

interface ProductListener {
    fun onProductClicked(product: ProductData, position: Int)
}

@Entity(tableName = "products")
class ProductData : Serializable {

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    @ColumnInfo(name = "type")
    private var type: Int = 0

    @ColumnInfo(name = "name")
    private var name: String = ""

    @ColumnInfo(name = "description")
    private var description: String = ""

    @ColumnInfo(name = "variations")
    private lateinit var variations: LiveData<List<VariationsData>>

    fun getId(): Int {
        return id
    }

    fun getType(): Int {
        return type
    }

    fun getName(): String {
        return name
    }

    fun getDescription(): String {
        return description
    }

    fun getVariations(): LiveData<List<VariationsData>> {
        return variations
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setType(type: Int) {
        this.type = type
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun setVariations(variations: LiveData<List<VariationsData>>) {
        this.variations = variations
    }

    fun getPrice(): String {
        return "120/150"
    }

    fun getCurrentPrice(): String {
        return "120" + " р"
    }

}

@Entity(tableName = "variationsData_database")
data class VariationsData(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "size") val size: String,
    @ColumnInfo(name = "price") val price: String

)

class Category(val name: String, val list: List<ProductData>) {
    var listOfItems: List<ProductData> = list.toList()
}
