package com.zpc.kolin_eyes.net

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by DELL on 2017/12/27.
 */
class RetrofitUtil constructor(baseurl : String){

    var murl:String = baseurl;
    var okhttpclient:OkHttpClient? = null;
    var retrofit:Retrofit? = null;
    init {
        //创建okhttp
        okhttpclient = OkHttpClient.Builder()
                .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()
        //创建Retrofit
        retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(murl)
                .build()
    }
    companion object {
        @Volatile
        var instance : RetrofitUtil? = null
        fun getInstance(baseurl: String):RetrofitUtil{
            if (instance == null) {
                synchronized(RetrofitUtil::class){
                    if (instance == null){
                        instance = RetrofitUtil(baseurl)
                    }
                }
            }
            return instance!!
        }
    }
    fun <T> create(service:Class<T>?):T?{
        if (service == null){
            throw RuntimeException("Api service is null!")
        }
        return retrofit?.create(service)
    }
}