package com.gunder.cleanarchitecture.data

import com.gunder.cleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMsgFromSource(name: String): MessageEntity
}