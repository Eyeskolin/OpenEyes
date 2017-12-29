package com.zpc.kolin_eyes.net

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by DELL on 2017/12/27.
 */
class RetrofitUtil constructor(){

    var okhttpclient:OkHttpClient? = null
    var retrofit:Retrofit? = null
    val DEFAULT_TIMEOUT : Long = 20

    init {
        //创建okhttp
        okhttpclient = OkHttpClient.Builder()
                .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build()

    }
    companion object {
        var retrofitutil : RetrofitUtil? = null
        fun getInstance():RetrofitUtil{
            if (retrofitutil == null) {
                synchronized(RetrofitUtil::class){
                    if (retrofitutil == null){
                        retrofitutil = RetrofitUtil()
                    }
                }
            }
            return retrofitutil!!
        }
    }
    fun <T> create(service:Class<T>?,baseurl:String):T?{
        //创建Retrofit
        retrofit = Retrofit.Builder()
                .client(okhttpclient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseurl)
                .build()
        if (service == null){
            throw RuntimeException("Api service is null!")
        }
        return retrofit?.create(service)
    }
}