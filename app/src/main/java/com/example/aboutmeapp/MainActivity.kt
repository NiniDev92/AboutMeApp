package com.example.aboutmeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnContact = findViewById<Button>(R.id.btnContact)
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)

        imgProfile.load("https://scontent-scl3-1.xx.fbcdn.net/v/t39.30808-6/565860648_24955932070761134_1598875587107983636_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=1d70fc&_nc_eui2=AeF_uL0pfZr_N0hdnr25hGDyg1HVvpuC17yDUdW-m4LXvEdr1MYbR6Lu65-hYjvKqS1oKIuRZKwSQBKNFXJamwMQ&_nc_ohc=GUXz96eQe9MQ7kNvwEzWi1b&_nc_oc=AdoZXso4WMCqaTNkdqU0dUT3xF_3jFykZjJ4ftmXQJDneGBXI5R3yBGiohqH71Q2fmVeplFcGcMBzvP_GA6PotIu&_nc_zt=23&_nc_ht=scontent-scl3-1.xx&_nc_gid=TN_qsCun4TkdJpFQ6jT-xw&_nc_ss=7a32e&oh=00_AfyYQALt8eyzSbPtjEEtAsWlJpW_EEuvKtMzJ5Ot97XeVw&oe=69C5D0B5"){
            crossfade(true)
        }

        btnContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}