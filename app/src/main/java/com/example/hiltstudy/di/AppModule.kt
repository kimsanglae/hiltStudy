package com.example.hiltstudy.di
//의존성 주입 계층

import com.example.hiltstudy.data.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    /**
     * @Provides 사용 예시 💡
     * 생성자에 @Inject를 붙일 수 없는 클래스(외부 라이브러리 등)나
     * 빌더 패턴으로 생성해야 하는 객체를 Hilt에 제공할 때 사용합니다.
     * 여기서는 간단히 API 키(String)를 제공하는 예시입니다.
     */
    @Provides
    @Singleton
    @Named("ApiKey") // 같은 타입(String)의 의존성이 여러 개일 때 구분을 위한 이름표
    fun provideApiKey(): String = "1234-ABCD-5678-EFGH"

    // 참고: 기존 UserRepository 제공 코드는 UserRepository에 @Inject constructor()가
    // 있으므로 Hilt가 생성 방법을 이미 알고 있어 사실은 불필요합니다.
    // @Provides
    // @Singleton
    // fun provideUserRepository(): UserRepository = UserRepository()

}