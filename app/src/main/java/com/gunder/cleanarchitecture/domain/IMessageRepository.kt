package com.gunder.cleanarchitecture.domain

// logic business to be called on class use case
interface IMessageRepository {
    fun getWelcomeMsg(name: String): MessageEntity
}