package com.example.CleanTemplate.di

import com.example.CleanTemplate.ui.MainActivity
import com.example.data.di.NetworkModule
import com.example.data.di.FirstUseCaseModule

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ViewModelModule::class, FirstUseCaseModule::class,NetworkModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}