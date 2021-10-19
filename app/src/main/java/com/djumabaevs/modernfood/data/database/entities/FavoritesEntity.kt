package com.djumabaevs.modernfood.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.djumabaevs.modernfood.models.Result
import com.djumabaevs.modernfood.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)