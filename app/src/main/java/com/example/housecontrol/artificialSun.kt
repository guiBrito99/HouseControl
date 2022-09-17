package com.example.housecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class artificialSun : AppCompatActivity() {

    private var backButton: Button? = null

    private fun setBackButton(){
        backButton = findViewById(R.id.go_back_button)
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