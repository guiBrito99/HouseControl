package com.example.housecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class artificialSun : AppCompatActivity() {

    private val backButton: Button? = null

    private fun setBackButtonClickListener(){
        backButton?.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artificial_sun)
        setBackButtonClickListener()
    }
}