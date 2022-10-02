package com.example.viewmodeldemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModle : ViewModel() {
    var cntnmb = MutableLiveData<Int>()
    // var cntnmb = 0
    init {
        cntnmb.value = 0
    }
    fun updateCntnmb(){
       // ++cntnmb
        cntnmb.value = (cntnmb.value)?.plus(1)
    }
}