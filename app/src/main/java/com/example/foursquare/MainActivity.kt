package com.example.foursquare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// LEO ESTUVO AQUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bloquear=findViewById<Button>(R.id.btlog)
        bloquear.setOnClickListener{

        }
    }
}
