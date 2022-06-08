package com.mad.e.twcplanner2.usecase

import com.mad.e.twcplanner2.model.WorkshopResponse
import com.mad.e.twcplanner2.repository.WorkshopRepository
import javax.inject.Inject

interface IWorkshopsUseCase{
    suspend operator fun invoke(selectedCategory: String): WorkshopResponse
}

class GetWorkshopUseCase @Inject constructor(private val repo: WorkshopRepository): IWorkshopsUseCase{
    override suspend fun invoke(selectedCategory: String): WorkshopResponse {
        return repo.getAllWorkshops(selectedCategory)
    }
}