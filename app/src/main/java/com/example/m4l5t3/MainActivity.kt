package com.example.m4l5t3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var signUpBtn: Button
    private lateinit var et_username: EditText
    private lateinit var et_password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        signUpBtn = findViewById(R.id.btn_sign_up)
        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_password)
        val text = "Username :  ${et_username.text}\nPassword :  ${et_password.text}"
        signUpBtn.setOnClickListener {
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}