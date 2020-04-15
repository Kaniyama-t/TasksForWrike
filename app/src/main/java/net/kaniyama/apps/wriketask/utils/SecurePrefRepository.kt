package net.kaniyama.apps.wriketask.utils

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class SecurePrefRepository {
    companion object{
        fun getString(context:Context, key: String, default:String? = null): String?{
            return context.getSharedPreferences("net.kaniyama.apps.tasksforwrike", MODE_PRIVATE).getString(key,default)
        }
    }
}