package com.mad.e.twcplanner2.repository

import com.mad.e.twcplanner2.model.WorkshopResponse
import com.mad.e.twcplanner2.service.IWorkshopService
import javax.inject.Inject


interface IWorkshopRepository{
    suspend fun getAllWorkshops(workshopCategory: String): WorkshopResponse
}

class WorkshopRepository @Inject constructor(val service: IWorkshopService): IWorkshopRepository{
    override suspend fun getAllWorkshops(workshopCategory: String): WorkshopResponse {
        return service.getAllWorkshops(workshopCategory)
    }
}