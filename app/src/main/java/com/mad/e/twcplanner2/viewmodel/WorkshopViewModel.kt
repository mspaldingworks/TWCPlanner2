package com.mad.e.twcplanner2.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mad.e.twcplanner2.model.data.WorkshopDao
import com.mad.e.twcplanner2.model.entities.Workshop
import com.mad.e.twcplanner2.usecase.IWorkshopsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WorkshopViewModel  @Inject constructor(val useCase: IWorkshopsUseCase, dao: WorkshopDao) : ViewModel() {

    val workshops = dao.readAllData().asLiveData(viewModelScope.coroutineContext)

}