package com.tega.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val userName: String = "Admin"
    val password: String = "Admin"

   private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}