package com.tugas.kelompok1.diaryapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val context = this
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(context, MainActivity::class.java))
            finish()
        }, 2000)
    }
}