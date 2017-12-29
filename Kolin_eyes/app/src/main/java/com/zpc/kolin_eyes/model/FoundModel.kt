package com.zpc.kolin_eyes.model

import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import io.reactivex.Flowable

/**
 * Created by lenovo on 2017/12/27.
 */
class FoundModel : IFoundModel {
    override fun getFoundData():Flowable<List<FoudBean>>{
        var apiService = RetrofitUtil.getInstance().create(ApiService::class.java,Apii.BASE_URL)
        return apiService!!.getString()
    }

}