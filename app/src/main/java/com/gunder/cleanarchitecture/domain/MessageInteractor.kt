package com.gunder.cleanarchitecture.domain

class MessageInteractor(private val msgRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return msgRepository.getWelcomeMsg(name)
    }
}