package com.example.hiltstudy.data

import javax.inject.Inject

// AuthRepository 인터페이스의 구현체
// Hilt가 이 클래스를 생성할 수 있도록 @Inject constructor()를 사용합니다.
class AuthRepositoryImpl @Inject constructor() : AuthRepository {
    override fun getAuthToken(): String {
        return "SAMPLE_AUTH_TOKEN_12345"
    }
}