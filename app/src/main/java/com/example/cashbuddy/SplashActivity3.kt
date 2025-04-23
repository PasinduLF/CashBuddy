package com.example.cashbuddy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.cashbuddy.R.id

class SplashActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash3)

        findViewById<View>(id.splashBtn2).setOnClickListener {
            val intent = Intent(this,SplashActivity4::class.java)
            startActivity(intent)
        }
    }
}