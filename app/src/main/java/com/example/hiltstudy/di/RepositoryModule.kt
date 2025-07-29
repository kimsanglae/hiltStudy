package com.example.hiltstudy.di

import com.example.hiltstudy.data.AuthRepository
import com.example.hiltstudy.data.AuthRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule { // @Binds 함수는 abstract이므로 클래스도 abstract여야 함

    /**
     * @Binds 사용 예시 💡
     * 인터페이스(AuthRepository)에 어떤 구현체(AuthRepositoryImpl)를
     * 주입할지 Hilt에게 알려줍니다.
     * Hilt는 AuthRepositoryImpl의 생성 방법을 @Inject constructor()를 통해 이미 알고 있습니다.
     */
    @Binds
    @Singleton
    abstract fun bindAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl
    ): AuthRepository
}