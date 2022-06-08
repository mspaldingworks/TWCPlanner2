package com.mad.e.twcplanner2.model

import com.mad.e.twcplanner2.model.entities.Workshop

data class Workshops(
    val workshops: List<Workshop> = emptyList()
)

data class WorkshopsItem(
    val id: Int? = 1,
    val title: String? = null,
    val presenter: String? = null,
    val time: Int,
    val image: String? = null,
    var saved: Boolean = false
)

fun Workshop.toUiModel(): WorkshopsItem =
    WorkshopsItem(
        id,
        title,
        image,
        time,
        image,
        saved,
    )
