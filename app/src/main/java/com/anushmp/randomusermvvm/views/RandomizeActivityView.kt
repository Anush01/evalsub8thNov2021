package com.anushmp.randomusermvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anushmp.randomusermvvm.R
import kotlinx.android.synthetic.main.activity_randomize_view.*

class RandomizeActivityView : AppCompatActivity() {

    //textviews
    //username


    //buttons
    //getrandomuser
    //FirstTimeSetup
    //gotorandomuseractivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randomize_view)
    }


    private fun setupviews() {

        getrandomuser.setOnClickListener {


        }

    }
}