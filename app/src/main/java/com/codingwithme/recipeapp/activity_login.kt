package com.codingwithme.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class activity_login : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var log: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button = findViewById(R.id.button)
        log = findViewById(R.id.log)
        button.setOnClickListener {
            val intent = Intent(this, fragment_register::class.java).also {
                startActivity(it)
            }
            finish()
        }
        log.setOnClickListener {
            val intent = Intent(this, fragment_login::class.java)
            startActivity(intent)
            finish()
        }

    }


}