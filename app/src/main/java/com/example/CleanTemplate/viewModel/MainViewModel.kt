package com.example.CleanTemplate.viewModel

import androidx.lifecycle.ViewModel
import com.example.domain.models.FirstModelDomain

import com.example.domain.usecases.FirstUseCase
import javax.inject.Inject

class MainViewModel  @Inject constructor(private var firstUseCase: FirstUseCase):ViewModel() {
    fun goTest(): List<FirstModelDomain> {
       return firstUseCase.getList()
    }
}

