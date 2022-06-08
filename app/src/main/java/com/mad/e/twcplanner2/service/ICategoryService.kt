package com.example.disher.category.service

import com.mad.e.twcplanner2.model.CategoryResponse
import retrofit2.http.GET

interface ICategoryService {

    @GET("categories.php")
    suspend fun getAllCategories(): CategoryResponse

}


//www.tranwellnesscoalition.com/api/json/v1/1/categories.php -- to be added