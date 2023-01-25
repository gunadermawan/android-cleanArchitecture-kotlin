package com.gunder.cleanarchitecture.data

import com.gunder.cleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMsgFromSource(name: String): MessageEntity =
        MessageEntity("welcome $name, welcome to clean architecture")

}