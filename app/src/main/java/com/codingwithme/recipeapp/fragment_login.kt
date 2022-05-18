package com.codingwithme.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class fragment_login : AppCompatActivity() {
    private lateinit var email_txt: EditText
    private lateinit var password_txt: EditText
    private lateinit var login_btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)
        email_txt = findViewById(R.id.email_txt)
        password_txt = findViewById(R.id.password_txt)
        login_btn = findViewById(R.id.login_btn)

        login_btn.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}