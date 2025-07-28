package com.example.hiltstudy.data

import kotlinx.coroutines.delay
import javax.inject.Inject

class UserRepository @Inject constructor() {
    suspend fun fetchUserName(): String {
        delay(2000)
        return "GLASS MAN"
    }
}