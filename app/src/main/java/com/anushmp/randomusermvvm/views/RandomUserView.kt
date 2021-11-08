package com.anushmp.randomusermvvm.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.anushmp.randomusermvvm.R
import com.anushmp.randomusermvvm.datamodels.local.RandomUserDao
import com.anushmp.randomusermvvm.datamodels.local.RandomUserDataBase
import com.anushmp.randomusermvvm.repositories.RandomUserRepository
import com.anushmp.randomusermvvm.viewmodels.RandomUserViewModel
import com.anushmp.randomusermvvm.viewmodels.RuViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class RandomUserView : AppCompatActivity() {

    //textviews
    //username


    //buttons
    //getrandomuser
    //FirstTimeSetup
    //gotorandomuseractivity

    lateinit var dao:RandomUserDao
    lateinit var repo:RandomUserRepository
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewmodel:RandomUserViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //data
        dao = RandomUserDataBase.getDataBaseSingleton(this).getRandomUserdao()
        repo = RandomUserRepository(dao)


        //viewmodel
        viewModelFactory = RuViewModelFactory(repo)
        viewmodel = ViewModelProvider(this,viewModelFactory).get(RandomUserViewModel::class.java)






        FirstTimeSetup.setOnClickListener {

            viewmodel.FirstTimeApiCall()

            Toast.makeText(this,"called the api for the first time",Toast.LENGTH_LONG).show()



        }


        gotoRandomUserActivity.setOnClickListener {

            var intent = Intent(this,RandomizeActivityView::class.java)
            startActivity(intent)

        }


    }


}