package com.mad.e.twcplanner2.repository

import com.example.disher.category.service.ICategoryService
import com.mad.e.twcplanner2.model.CategoryResponse
import javax.inject.Inject

interface ICategoryRepository {
    suspend fun getAllCategories(): CategoryResponse
}

class CategoryRepository @Inject constructor(
    val service: ICategoryService
) : ICategoryRepository{
    override suspend fun getAllCategories(): CategoryResponse {
        return service.getAllCategories()
    }
}