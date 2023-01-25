package com.gunder.cleanarchitecture.data

import com.gunder.cleanarchitecture.domain.IMessageRepository
import com.gunder.cleanarchitecture.domain.MessageEntity

class MessageRepository(private val msgDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMsg(name: String): MessageEntity = msgDataSource.getMsgFromSource(name)

}