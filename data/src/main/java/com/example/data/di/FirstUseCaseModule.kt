package com.example.data.di

import com.example.data.repoImpl.FirstRepoImpl
import com.example.domain.repositories.IFirstUseCase
import dagger.Binds
import dagger.Module


@Module
abstract class FirstUseCaseModule {
    @Binds
    abstract fun bindInterface(firstRepo: FirstRepoImpl): IFirstUseCase //аргумент - где реализован интерфейс
}