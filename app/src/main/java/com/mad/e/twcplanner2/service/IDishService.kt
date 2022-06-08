package com.mad.e.twcplanner2.service

import com.mad.e.twcplanner2.model.WorkshopResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface IWorkshopService {

    @GET("filter.php")
    suspend fun getAllWorkshops(@Query("c")  workshopCategory: String?): WorkshopResponse
}