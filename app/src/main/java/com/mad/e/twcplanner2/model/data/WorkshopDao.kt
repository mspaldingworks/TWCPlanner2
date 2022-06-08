package com.mad.e.twcplanner2.model.data

import androidx.room.*
import com.mad.e.twcplanner2.model.entities.Workshop
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkshopDao {
    @Insert
    suspend fun insertWorkshopDetails(workshopDao: WorkshopDao)

    @Query("SELECT * FROM WORKSHOP_TABLE ORDER BY id ASC")
    fun readAllData(): Flow<List<WorkshopDao>>

    @Update
    suspend fun updateWorkshops(workshop: Workshop)

    @Delete
    suspend fun deleteWorkshop(workshop: Workshop)

    /*@Query("SELECT * FROM WORKSHOP_TABLE WHERE category = :filterType")
    fun getFilteredWorkshopsList(filterType: String): Flow<List<Workshop>>

    @Query("SELECT * FROM WORKSHOP_TABLE ORDER BY ID")
    fun getWorkshopsList(): Flow<List<Workshop>>

*/
}