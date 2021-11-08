package com.anushmp.randomusermvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anushmp.randomusermvvm.R
import kotlinx.android.synthetic.main.activity_main.*

class RandomUserView : AppCompatActivity() {

    //textviews
    //username

    //buttons
    //getrandomuser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupviews()


    }

    private fun setupviews() {

        getrandomuser.setOnClickListener {


        }

    }
}