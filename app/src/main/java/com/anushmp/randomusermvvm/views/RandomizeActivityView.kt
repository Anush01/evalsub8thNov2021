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

            var out:String = it.Responsegender +
                    "\n"+it.ResponseNametitle +
                    "\n"+it.ResponseNamefirst+
                    "\n"+it.ResponseNamelast+
                    "\n"+it.ResponseLocationStreetNumber+
                    "\n"+it.ResponseLocationStreetName+
                    "\n"+it.ResponseLocationCity+
                    "\n"+it.ResponseLocationState+
                    "\n"+it.ResponseLocationCountry+
                    "\n"+it.ResponseLocationpostcode+
                    "\n"+it.ResponseLocationCoordinatesLatitude+
                    "\n"+it.ResponseLocationCoordinatesLongitude+
                    "\n"+it.ResponseLocationTimezoneOffset+
                    "\n"+it.ResponseLocationTimezoneDescription+
                    "\n"+it.Responseemail+
                    "\n"+it.ResponseLoginuuid+
                    "\n"+it.ResponseLoginusername+
                    "\n"+it.ResponseLoginpassword+
                    "\n"+it.ResponseLoginsalt+
                    "\n"+it.ResponseLoginmd5+
                    "\n"+it.ResponseLoginsha256+
                    "\n"+it.ResponseDOBdate+
                    "\n"+it.ResponseDOBage+
                    "\n"+it.ResponseRegisteredDate+
                    "\n"+it.ResponseRegisteredAge+
                    "\n"+it.Responsephone+
                    "\n"+it.Responsecell+
                    "\n"+it.ResponseIDName+
                    "\n"+it.ResponseIDValue+
                    "\n"+it.ResponsePictureLarge+
                    "\n"+it.ResponsePictureMedium+
                    "\n"+it.ResponsePictureThumbnail+
                    "\n"+it.Responsenat+
                    "\n"+it.infoseed+
                    "\n"+it.inforesults+
                    "\n"+it.infopage+
                    "\n"+it.infoversion+"\n"

            username.text = out

        })



        getrandomuser.setOnClickListener {

            viewmodel.updaterandomuser()

        }


    }

}