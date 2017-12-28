package com.zpc.kolin_eyes.model

import com.zpc.kolin_eyes.bean.HomeBean
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import io.reactivex.Flowable

/**
 * Created by DELL on 2017/12/28.
 */
class HomeModel {
    fun getData():Flowable<HomeBean>{
        val retrofitUtil = RetrofitUtil.getInstance(Apii.BASE_URL)
        val service = retrofitUtil.create(ApiService::class.java)
        val flowable = service!!.gethomeinfo()
        return flowable
    }
}