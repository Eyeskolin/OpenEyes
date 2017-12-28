package com.zpc.kolin_eyes.presenter

import com.zpc.kolin_eyes.bean.HomeBean
import com.zpc.kolin_eyes.model.HomeModel
import com.zpc.kolin_eyes.view.HVIew
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by DELL on 2017/12/28.
 */
class HomePrestener(hvIew: HVIew) {
    var hview :HVIew? =hvIew
    var homeModel:HomeModel?= HomeModel()

    fun relevance(){
        val flowable = homeModel!!.getData()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { homeBean:HomeBean ->
                    hview!!.getData(homeBean)
                }
    }
}