package com.dylanc.wanandroid.data.net

import android.content.Context
import com.dylanc.retrofit.helper.RetrofitHelper
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor

/**
 * @author Dylan Cai
 */
lateinit var persistentCookieJar: PersistentCookieJar

fun RetrofitHelper.Builder.persistentCookies(context: Context) = apply {
  persistentCookieJar = PersistentCookieJar(SetCookieCache(), SharedPrefsCookiePersistor(context))
  cookieJar(persistentCookieJar)
}