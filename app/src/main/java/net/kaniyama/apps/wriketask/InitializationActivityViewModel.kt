package net.kaniyama.apps.wriketask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InitializationActivityViewModel: ViewModel() {
    private val _goMainActivity = MutableLiveData<Boolean>().apply{
        value = false
    }
    val goMainActivity: LiveData<Boolean> = _goMainActivity

    private val _loadingMsg = MutableLiveData<String>().apply{
        value = "起動準備中"
    }
    val loadingMsg: LiveData<String> = _loadingMsg

    fun onWakeupApplication(){

    }
}