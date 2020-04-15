package net.kaniyama.apps.wriketask.Wrike.Oauth20

import android.content.Context
import android.webkit.WebView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.kaniyama.apps.wriketask.statics.WrikeOauthURL

class ConfigrationViewModel : ViewModel() {
    private val _finishStatus = MutableLiveData<Boolean>().apply{
        value = false
    }
    val finishStatus: LiveData<Boolean> = _finishStatus

    /***
     * onActivityCreated
     * @param context Context
     *
     * Wrikeアカウントのセットアップ起動時(ConfigurationActivity#onCreate)に呼び出される。
     * 期待される挙動：なし
     */
    fun onActivityCreated(context: Context){
        // 特に無し
    }
}