package com.zpc.kolin_eyes.model

import android.util.Log
import com.bj.kotlinproject.bean.HotBean
import com.bj.kotlinproject.net.OnFinish
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by せしおゆ on 2017/12/28.
 */
class HotModel {
    //http://baobab.kaiyanapp.com/api/v3/ranklist?num=10&strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
    fun getHot(onFinish: OnFinish<HotBean>, mStrategy: String){
        //val apiService = RetrofitUtil.getInstance()?.getApiService(Apii.URL, ApiService::class.java)
        val apiService = RetrofitUtil.getInstance(Apii.URL).create(ApiService::class.java)
        val flowable = apiService!!.getHotData(10, mStrategy, "26868b32e808498db32fd51fb422d00175e179df", 83)
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<HotBean>() {
                    override fun onNext(t: HotBean?) {
                        onFinish.onSuccess(t!!)
                    }

                    override fun onError(t: Throwable?) {
                        Log.i("aaaa", t?.message)
                    }

                    override fun onComplete() {
                    }

                })
    }
}