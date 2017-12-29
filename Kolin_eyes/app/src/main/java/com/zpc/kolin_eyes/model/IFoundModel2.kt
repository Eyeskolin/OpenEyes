package com.zpc.kolin_eyes.model

import android.content.Context
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.FoundBean2
import io.reactivex.Flowable

/**
 * Created by lenovo on 2017/12/28.
 */
interface IFoundModel2 {
    fun getFoundData2(context: Context, start : Int, num : Int, categoryName: String, data: String) : Flowable<FoundBean2>
}