package com.app.navdrawer.privacy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrivacyModelView : ViewModel() {
    private val _text = MutableLiveData("Privacy & Policy Fragment")
    val text: LiveData<String> = _text
}