package com.gunder.cleanarchitecture.data

import com.gunder.cleanarchitecture.domain.MessageEntity

class MessageRepository(private val msgDataSource: IMessageDataSource) : IMessageDataSource {
    override fun getMsgFromSource(name: String): MessageEntity =
        msgDataSource.getMsgFromSource(name)
}