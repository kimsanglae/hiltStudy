package com.example.hiltstudy.views

import androidx.lifecycle.ViewModel
import com.example.hiltstudy.data.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: UserRepository
):ViewModel() {
}