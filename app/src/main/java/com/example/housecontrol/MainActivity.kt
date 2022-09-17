package com.example.housecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val clickListeners = arrayOfNulls<View.OnClickListener>(3)
    private val buttons = arrayOfNulls<Button>(9)
    private val status = arrayOfNulls<TextView>(6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupStatus()
        setupClickListener()
        setupButtons()
    }

    //Assign one index of the TextView array to one TextView in the layout
    private fun setupStatus(){

        status[0] = findViewById(R.id.kitchen_status)
        status[1] = findViewById(R.id.bedroom_status)
        status[2] = findViewById(R.id.livingroom_status)
        status[3] = findViewById(R.id.bathroom_status)
        status[4] = findViewById(R.id.garage_status)
        status[5] = findViewById(R.id.television_status)

        initializeStatus(status)
    }

    //Makes all status start with off
    private fun initializeStatus(status : Array<TextView?>){
        for(element in status)
            element?.setText(R.string.off)
    }

    //Assign one index of the OnClickListener array to one ClickListener to be used in the buttons
    private fun setupClickListener(){
        clickListeners[0] = View.OnClickListener{
            toggle(it)
        }

        clickListeners[1] = View.OnClickListener{
            setUpArtificialSun()
        }

        clickListeners[2] = View.OnClickListener{
            toggleAll(it)
        }
    }

    //Opens the artificial sun setup activity
    private fun setUpArtificialSun(){
        startActivity(Intent(this,ArtificialSun::class.java))
    }

    //Change the status based on the button clicked
    private fun toggle(view : View){
        when(view.id){
            R.id.kitchen_button -> reverseString(status[0])
            R.id.bedroom_button -> reverseString(status[1])
            R.id.livingroom_button -> reverseString(status[2])
            R.id.bathroom_button -> reverseString(status[3])
            R.id.garage_button -> reverseString(status[4])
            R.id.television_button -> reverseString(status[5])
        }
    }

    private fun toggleAll(view: View){
        when(view.id){
            R.id.allOn_button -> setAll(R.string.on)
            R.id.allOff_button -> setAll(R.string.off)
        }
    }

    private fun setAll(statusString: Int){
        for(element in status){
            element?.setText(statusString)
        }
    }

    private fun reverseString(status: TextView?){
        when(status?.text){
            "ON" -> status.setText(R.string.off)
            "OFF" -> status.setText(R.string.on)
        }
    }

    //Assign one index of the buttons array to one button in the layout
    private fun setupButtons(){

        buttons[0] = findViewById(R.id.kitchen_button)
        buttons[1] = findViewById(R.id.bedroom_button)
        buttons[2] = findViewById(R.id.livingroom_button)
        buttons[3] = findViewById(R.id.bathroom_button)
        buttons[4] = findViewById(R.id.garage_button)
        buttons[5] = findViewById(R.id.television_button)
        buttons[6] = findViewById(R.id.artificialsun_button)
        buttons[7] = findViewById(R.id.allOn_button)
        buttons[8] = findViewById(R.id.allOff_button)

        initializeButtonsWithClickListeners()
    }

    private fun initializeButtonsWithClickListeners(){
        for(element in 0..5)
            buttons[element]?.setOnClickListener(clickListeners[0])

        buttons[6]?.setOnClickListener(clickListeners[1])

        for(element in 7..8)
            buttons[element]?.setOnClickListener(clickListeners[2])
    }

}