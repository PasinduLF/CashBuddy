package com.example.cashbuddy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash2)

        findViewById<View>(R.id.splashBtn1).setOnClickListener {
            val intent = Intent(this,SplashActivity3::class.java)
            startActivity(intent)
        }
    }
}