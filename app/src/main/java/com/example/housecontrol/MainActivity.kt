package com.example.housecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeStatus(setupStatus())
    }

    private fun setupStatus() : Array<TextView?> {
        val status = arrayOfNulls<TextView>(6)

        status[0] = findViewById(R.id.kitchen_status)
        status[1] = findViewById(R.id.bedroom_status)
        status[2] = findViewById(R.id.livingroom_status)
        status[3] = findViewById(R.id.bathroom_status)
        status[4] = findViewById(R.id.garage_status)
        status[5] = findViewById(R.id.television_status)

        return status
    }

    private fun initializeStatus(status : Array<TextView?>){
        for(element in status)
            element?.setText(R.string.off)
    }

    private fun setupButtons() : Array<Button?>{
        val buttons = arrayOfNulls<Button>(8)

        buttons[0] = findViewById(R.id.kitchen_button)
        buttons[1] = findViewById(R.id.bedroom_button)
        buttons[2] = findViewById(R.id.livingroom_button)
        buttons[3] = findViewById(R.id.bathroom_button)
        buttons[4] = findViewById(R.id.garage_button)
        buttons[5] = findViewById(R.id.television_button)
        buttons[6] = findViewById(R.id.artificialsun_button)
        buttons[7] = findViewById(R.id.toggle_button)

        return buttons
    }

    private fun setClickListeners(){

    }

    override fun onResume() {
        super.onResume()






    }
}