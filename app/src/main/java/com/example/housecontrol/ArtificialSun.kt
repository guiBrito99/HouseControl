package com.example.housecontrol

import android.app.ActivityManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class ArtificialSun : AppCompatActivity() {

    var fragments : Array<Fragment> = arrayOf(sunrise_fragment_list(), sunrise_fragment_editor())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artificial_sun)

        supportFragmentManager.beginTransaction()
            .add(R.id.sunrise_fragment_holder,fragments[0]).commit()
    }

}