package com.tega.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.TextView

class HomeActivity2 : AppCompatActivity() {

    private lateinit var welcome1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
// finding value by id

        welcome1 = findViewById(R.id.welcome1)

        welcome1.text = intent.getStringExtra("userName")

    }
}