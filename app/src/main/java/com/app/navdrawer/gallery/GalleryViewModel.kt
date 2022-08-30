package com.app.navdrawer.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData("Gallery Fragment")
    val text: LiveData<String> = _text
}