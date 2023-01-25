package com.gunder.cleanarchitecture.di

import com.gunder.cleanarchitecture.data.IMessageDataSource
import com.gunder.cleanarchitecture.data.MessageDataSource
import com.gunder.cleanarchitecture.data.MessageRepository
import com.gunder.cleanarchitecture.domain.IMessageRepository
import com.gunder.cleanarchitecture.domain.MessageInteractor
import com.gunder.cleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}