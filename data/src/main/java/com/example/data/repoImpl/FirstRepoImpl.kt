package com.example.data.repoImpl

import com.example.domain.models.FirstModelDomain
import com.example.domain.repositories.IFirstUseCase
import javax.inject.Inject


class FirstRepoImpl @Inject constructor():IFirstUseCase { //реализация интерфейса из domain
    override fun execute(): List<FirstModelDomain> {
        return listOf(FirstModelDomain("hello1","hello2","hello3"))
    }

}