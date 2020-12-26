package com.example.CleanTemplate.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.CleanTemplate.base.MyViewModelFactory
import com.example.CleanTemplate.viewModel.MainViewModel
import com.example.data.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class) // PROVIDE YOUR OWN MODELS HERE
    internal abstract fun bindEditPlaceViewModel(editPlaceViewModel: MainViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory
}