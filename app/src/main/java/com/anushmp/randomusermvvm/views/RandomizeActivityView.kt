package com.anushmp.randomusermvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.anushmp.randomusermvvm.R
import com.anushmp.randomusermvvm.datamodels.local.RandomUserDao
import com.anushmp.randomusermvvm.datamodels.local.RandomUserDataBase
import com.anushmp.randomusermvvm.repositories.RandomUserRepository
import com.anushmp.randomusermvvm.viewmodels.RandomUserViewModel
import com.anushmp.randomusermvvm.viewmodels.RuViewModelFactory
import kotlinx.android.synthetic.main.activity_randomize_view.*

class RandomizeActivityView : AppCompatActivity() {



    //textviews
    //username


    //buttons
    //getrandomuser
    //FirstTimeSetup
    //gotorandomuseractivity


    lateinit var dao: RandomUserDao
    lateinit var repo: RandomUserRepository
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var viewmodel: RandomUserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randomize_view)


        //data
        dao = RandomUserDataBase.getDataBaseSingleton(this).getRandomUserdao()
        repo = RandomUserRepository(dao)


        //viewmodel
        viewModelFactory = RuViewModelFactory(repo)
        viewmodel = ViewModelProvider(this,viewModelFactory).get(RandomUserViewModel::class.java)


        viewmodel.getrandomuser().observe(this,{

            username.text = it.ResponseNamefirst

        })



        getrandomuser.setOnClickListener {

            viewmodel.updaterandomuser()

        }


    }

}