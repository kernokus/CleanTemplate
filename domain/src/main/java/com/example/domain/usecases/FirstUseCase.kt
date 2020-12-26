package com.example.domain.usecases



import com.example.domain.models.FirstModelDomain
import com.example.domain.repositories.IFirstUseCase
import javax.inject.Inject

class FirstUseCase @Inject constructor(private val ITest: IFirstUseCase) {
    fun getList(): List<FirstModelDomain> {
        return ITest.execute()
    }
}