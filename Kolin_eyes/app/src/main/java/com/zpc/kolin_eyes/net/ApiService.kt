package com.zpc.kolin_eyes.net


import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.HomeBean
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by DELL on 2017/12/27.
 */
interface ApiService {
//categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83

    @GET("categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun  getString() : Flowable<List<FoudBean>>
    //获取首页第一页数据
    @GET("feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun gethomeinfo():Flowable<HomeBean>


}