@file:Suppress("unused")

package com.dylanc.wanandroid

import android.app.Application
import com.dylanc.retrofit.helper.initRetrofit
import com.dylanc.utilktx.isJson
import com.dylanc.utilktx.logJson
import com.dylanc.wanandroid.data.net.persistentCookies

class App: Application() {
  override fun onCreate() {
    super.onCreate()
    initRetrofit {
      debug(BuildConfig.DEBUG)
      persistentCookies(applicationContext)
      addHttpLog { message ->
        if (message.isJson()){
          logJson(message)
        }
      }
    }
  }
}