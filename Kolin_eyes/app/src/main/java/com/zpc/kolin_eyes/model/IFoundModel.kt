package com.zpc.kolin_eyes.model

import android.content.Context
import com.zpc.kolin_eyes.bean.FoundBean
import io.reactivex.Flowable

/**
 * Created by lenovo on 2017/12/27.
 */
interface IFoundModel {

    fun getFoundData() : Flowable<FoundBean>
}