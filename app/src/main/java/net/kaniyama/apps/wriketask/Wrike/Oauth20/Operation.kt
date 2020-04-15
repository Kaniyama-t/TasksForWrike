package net.kaniyama.apps.wriketask.Wrike.Oauth20

import android.content.Context
import android.content.Intent
import androidx.navigation.ActivityNavigator

class Operation {
    fun requestAuthoricationCode(context: Context){
        ActivityNavigator(context).apply {
            navigate(
                createDestination().setIntent(Intent(context,
                    ConfigurationActivity::class.java)),null,null,null
            )
        }
    }
}