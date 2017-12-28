package com.zpc.kolin_eyes.model

import com.zpc.kolin_eyes.bean.Homeinfo
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import io.reactivex.Flowable

/**
 * Created by FLOWER on 2017/12/27.
 */
class Hmodel {

    fun getData() : Flowable<Homeinfo>{
        val retrofitUtil = RetrofitUtil.getInstance(Apii.BASE_URL)
        val service = retrofitUtil.create(ApiService::class.java)
        val flowable = service!!.gethomeinfo()

        return flowable
    }
}