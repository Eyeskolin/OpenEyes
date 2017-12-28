package com.zpc.kolin_eyes.model

import com.zpc.kolin_eyes.bean.FoudBean
import io.reactivex.Flowable

/**
 * Created by lenovo on 2017/12/27.
 */
interface IFoundModel {

    fun getFoundData() : Flowable<List<FoudBean>>
}