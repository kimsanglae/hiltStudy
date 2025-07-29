package com.example.hiltstudy.views

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltstudy.data.AuthRepository
import com.example.hiltstudy.data.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    //private val repo: UserRepository
    private val userRepo: UserRepository, // @Inject constructor()로 주입
    private val authRepo: AuthRepository, // @Binds로 구현체가 주입됨
    @Named("ApiKey") private val apiKey: String // @Provides와 @Named로 주입됨
) : ViewModel() {
    private val _userName = MutableStateFlow("로딩 중...")
    val userName: StateFlow<String> = _userName

    init {
        viewModelScope.launch {
            // 주입된 의존성 사용 예시
            println("✅ API Key: ${apiKey}")
            println("✅ Auth Token: ${authRepo.getAuthToken()}")
            _userName.value = userRepo.fetchUserName()
        }
    }
}