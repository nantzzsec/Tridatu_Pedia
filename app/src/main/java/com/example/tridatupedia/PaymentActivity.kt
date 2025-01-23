package com.example.tridatupedia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)

        val codOption = findViewById<LinearLayout>(R.id.codOption)
        val bankTransferOption = findViewById<LinearLayout>(R.id.bankTransferOption)
        val qrisOption = findViewById<LinearLayout>(R.id.qrisOption)

        val paymentOptions = listOf(codOption, bankTransferOption, qrisOption)

        paymentOptions.forEach { option ->
            option.setOnClickListener {
                clearSelection(paymentOptions)
                option.isSelected = true
                option.setBackgroundResource(R.drawable.card_background_selected)
            }
        }
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }

        val confirmButton: Button = findViewById(R.id.confirmButton)
        confirmButton.setOnClickListener {
            val intent = Intent(this, PaymentSuccess::class.java)
            startActivity(intent)
        }
    }

    private fun clearSelection(options: List<LinearLayout>) {
        options.forEach {
            it.isSelected = false
            it.setBackgroundResource(R.drawable.card_background)
        }
    }

}