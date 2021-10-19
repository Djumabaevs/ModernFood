package com.djumabaevs.modernfood.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.djumabaevs.modernfood.models.FoodRecipe
import com.djumabaevs.modernfood.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}