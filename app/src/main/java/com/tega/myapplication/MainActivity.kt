package com.tega.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validUserName: String = "Admin"
    val validpassword: String = "Admin"

    //layout variables
    private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput = findViewById(R.id.userNameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.submitButton)

        // submit functionalty
        submitButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passwordInput.text.toString()
            login(username, password)
        }
    }

    fun login(username:String, password:String){
     if (isvalidcredentials(username,password)){
         val intent : Intent = Intent(this, HomeActivity2::class.java)
         intent.putExtra("userName", username)
         startActivity(intent)
     }else{
         Toast.makeText(applicationContext, "incorrect password", Toast.LENGTH_SHORT).show()
     }
    }
    private fun isvalidcredentials(username: String, password: String):Boolean{
    if(password == validpassword) return true
    return false
    }
}