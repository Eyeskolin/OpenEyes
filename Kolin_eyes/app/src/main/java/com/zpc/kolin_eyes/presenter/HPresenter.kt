package com.zpc.kolin_eyes.presenter

import com.zpc.kolin_eyes.bean.Homeinfo
import com.zpc.kolin_eyes.model.Hmodel
import com.zpc.kolin_eyes.view.HVIew
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by FLOWER on 2017/12/27.
 */
class Hpresenter(hView:HVIew) {
    var hView : HVIew? = hView

    var hmodel : Hmodel? = Hmodel()

    fun relevance(){
        val flowable = hmodel!!.getData()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<Homeinfo>(){
                    override fun onError(t: Throwable?) {

                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: Homeinfo?) {
                        hView!!.getData(t!!)
                    }

                })
    }
}