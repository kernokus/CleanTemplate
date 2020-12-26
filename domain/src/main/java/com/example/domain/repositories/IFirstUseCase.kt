package com.example.domain.repositories

import com.example.domain.models.FirstModelDomain

interface IFirstUseCase{
    fun execute(): List<FirstModelDomain>
}