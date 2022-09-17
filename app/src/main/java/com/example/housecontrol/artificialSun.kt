package com.example.housecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class artificialSun : AppCompatActivity() {

    private val backButton: Button? = findViewById(R.id.go_back_button)

    private fun setBackButton(){
        backButton?.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artificial_sun)
        setBackButton()
    }
}