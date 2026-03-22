package com.example.aboutmeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnLinkedin = findViewById<Button>(R.id.btnLinkedin)
        val btnCall = findViewById<Button>(R.id.btnCall)
        val btnWhatsapp = findViewById<Button>(R.id.btnWhatsapp)
        val btnEmail = findViewById<Button>(R.id.btnEmail)

        btnLinkedin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://https://www.linkedin.com/in/nicole-vergara-lizama-b927b72b9/")
            startActivity(intent)
        }

        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+56961914251")
            startActivity(intent)
        }

        btnWhatsapp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://wa.me/56961914251")
            startActivity(intent)
        }

        btnEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "message/rfc822"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("nicolef.vergara@hotmail.com"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hola Nicole")
            intent.putExtra(Intent.EXTRA_TEXT, "Te contacto desde tu app")
            startActivity(intent)
        }
    }
}