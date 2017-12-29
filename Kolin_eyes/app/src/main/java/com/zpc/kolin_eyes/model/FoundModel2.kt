package com.zpc.kolin_eyes.model

import android.content.Context
import android.util.Log
import com.zpc.kolin_eyes.bean.FoundBean2
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import io.reactivex.Flowable

/**
 * Created by lenovo on 2017/12/28.
 */
class FoundModel2 : IFoundModel2 {

    override fun getFoundData2(context: Context, start : Int, num : Int, categoryName: String, data: String): Flowable<FoundBean2> {
        Log.e("SSSS","MODEL");
        var apiService2 = RetrofitUtil.getInstance().create(ApiService::class.java,Apii.BASE_URL2)
        return apiService2!!.getString2(start , num , categoryName , data)
    }
}