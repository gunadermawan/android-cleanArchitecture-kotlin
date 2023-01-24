package com.gunder.cleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name:String):MessageEntity
}