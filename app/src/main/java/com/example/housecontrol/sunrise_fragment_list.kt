package com.example.housecontrol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class sunrise_fragment_list : Fragment() {

    var sunriseListAdapter : RecyclerViewAdapter? = null
    var sunriseList : RecyclerView? = null
    var buttons = arrayOfNulls<Button>(2)
    var clickListeners = arrayOfNulls<View.OnClickListener>(2)
    var data = arrayListOf<ArtificialSunData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sunrise_fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSunriseList()
        setupCLickListeners()
        setupFragmentButtons()
    }

    private fun setupSunriseList(){
        sunriseList = this.view?.findViewById(R.id.sunrise_list)
        sunriseListAdapter = RecyclerViewAdapter(data)
        sunriseList?.adapter = sunriseListAdapter
        sunriseList?.layoutManager = LinearLayoutManager(activity)
    }

    private fun setupCLickListeners(){
        clickListeners[0] = {
            addItemToSunriseList()
        }
        clickListeners[1] = {
            removeItemToSunriseList()
        }
    }

    private fun setupFragmentButtons(){
        buttons[0] = this.view?.findViewById(R.id.add_sunrise_button)
        buttons[1] = this.view?.findViewById(R.id.remove_sunrise_button)
        buttons[0]?.setOnClickListener(clickListeners[0])
        buttons[1]?.setOnClickListener(clickListeners[1])
    }

    private fun addItemToSunriseList(){
        val auxArray = arrayOf("none","none","none","none")
        data.add(ArtificialSunData(auxArray))
        sunriseListAdapter?.notifyDataSetChanged()
    }
    private fun removeItemToSunriseList(){
        data.removeLast()
        sunriseListAdapter?.notifyDataSetChanged()
    }

}