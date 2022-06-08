package com.example.disher.category.usecase

import com.mad.e.twcplanner2.model.CategoryResponse
import com.mad.e.twcplanner2.repository.ICategoryRepository
import javax.inject.Inject

interface IGetCategoriesUseCase {
    suspend operator fun invoke(): CategoryResponse
}

class GetCategoriesUseCase @Inject constructor(
    val repo: ICategoryRepository
): IGetCategoriesUseCase {
    override suspend fun invoke(): CategoryResponse {
        return repo.getAllCategories()
    }
}