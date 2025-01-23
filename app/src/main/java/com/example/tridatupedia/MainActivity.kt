package com.example.tridatupedia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNextPage: Button = findViewById(R.id.signInButton)
        btnNextPage.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

        }
        val btnCreateAccount: Button = findViewById(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }
}
