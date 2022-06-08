package com.mad.e.twcplanner2.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideWorkshopDatabase(app: Application): WorkshopDatabase {
    return Room.databaseBuilder(app, WorkshopDatabase::class.java, "workshops_db").build()
}

@Provides
@Singleton
fun provideWorkshopRepository(db: WorkshopDatabase): WorkshopRepository {
    return WorkshopRepositoryImpl(db.workshopDao)
}
}
