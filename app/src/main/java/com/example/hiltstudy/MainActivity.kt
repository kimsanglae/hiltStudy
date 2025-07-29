package com.example.hiltstudy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

/**
 * 구분	       @Provides           	                        @Binds
 * 목적	       객체 생성 방법을 직접 제공	                        인터페이스에 구현체를 연결
 * 사용 대상	   외부 라이브러리, 빌더 패턴, 인터페이스가 아닌 클래스	    인터페이스
 * 메서드	       일반 함수 (fun)	                            추상 함수 (abstract fun)
 * 모듈	       클래스 또는 객체 (class or object)	            추상 클래스 (abstract class)
 * 성능	       코드를 직접 실행하므로 약간의 오버헤드 발생	            컴파일 시점에 코드를 생성하여 더 효율적
 */