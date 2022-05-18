package com.codingwithme.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class fragment_register : AppCompatActivity() {
    private lateinit var name_txt: EditText
    private lateinit var email_txt: EditText
    private lateinit var phone_txt: EditText
    private lateinit var password_txt: EditText
    private lateinit var register_btn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register)
        name_txt = findViewById(R.id.name_txt)
        email_txt = findViewById(R.id.email_txt)
        phone_txt = findViewById(R.id.phone_txt)
        password_txt = findViewById(R.id.password_txt)
        register_btn = findViewById(R.id.register_btn)

        register_btn.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}