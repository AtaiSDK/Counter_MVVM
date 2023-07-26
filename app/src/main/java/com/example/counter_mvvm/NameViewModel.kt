package com.example.counter_mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {

    val lives = MutableLiveData<Int>(0)

    fun increment(){
        lives.postValue(lives.value!!+1)
    }

    fun decrement(){
        lives.postValue(lives.value!!-1)
    }
}