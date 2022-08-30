package com.app.navdrawer.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideShowViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Slideshow Fragment"
    }
    val text: LiveData<String> = _text
}