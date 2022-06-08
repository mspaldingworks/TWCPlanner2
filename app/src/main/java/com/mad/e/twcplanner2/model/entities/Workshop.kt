package com.mad.e.twcplanner2.model.entities

import androidx.room.Entity

@Entity(tableName = "workshop_table")
data class Workshop(
    val id: Int,
    val title: String,
    val presenter: String,
    val time: Int,
    val image: String,
    var saved: Boolean,
)