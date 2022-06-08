package com.mad.e.twcplanner2.model.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mad.e.twcplanner2.model.entities.Workshop

@Database(entities = [Workshop::class], version = 1)

abstract class WorkshopDatabase : RoomDatabase(){

    abstract fun workshopDao(): WorkshopDao

    companion object {
        private var instance: WorkshopDatabase? = null

        private fun createInstance(context: Context): WorkshopDatabase {
            val newInstance = Room.databaseBuilder(
                context, WorkshopDatabase::class.java, "workshop-db"
            ).build()
            instance = newInstance
            return newInstance


        }

        fun getInstance(context: Context): WorkshopDatabase {
            return instance ?: createInstance(context)


        }


    }



}