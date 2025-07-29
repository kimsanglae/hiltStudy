package com.example.hiltstudy.data

// @Binds 예제를 위한 인터페이스
interface AuthRepository {
    fun getAuthToken(): String
}