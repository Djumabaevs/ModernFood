package com.djumabaevs.modernfood.data

import com.djumabaevs.modernfood.data.network.FoodRecipesApi
import com.djumabaevs.modernfood.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

}