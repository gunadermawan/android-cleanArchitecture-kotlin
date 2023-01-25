package com.gunder.cleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gunder.cleanarchitecture.di.Injection
import com.gunder.cleanarchitecture.domain.MessageUseCase

class MainViewModelFactory(private var messageUseCase: MessageUseCase) :
    ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory = instance ?: synchronized(this) {
            instance ?: MainViewModelFactory(Injection.provideUseCase())
        }
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("unknown viewmodel class"+modelClass.name)
        }
    }
}