package com.anushmp.randomusermvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushmp.randomusermvvm.repositories.RandomUserRepository

class RuViewModelFactory(val repo: RandomUserRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RandomUserViewModel(repo) as T
    }


}