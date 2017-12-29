package com.zpc.kolin_eyes.net

import com.bj.kotlinproject.bean.HotBean
import com.zpc.kolin_eyes.bean.*
import io.reactivex.Flowable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


/**
 * Created by DELL on 2017/12/27.
 */
interface ApiService {
//categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83

    //获取发现第一页数据
    @GET("categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun  getString() : Flowable<List<FoudBean>>

    //获取发现第二页数据
    @GET("videos")
    fun getString2(@Query("start") start : Int, @Query("num") num : Int, @Query("categoryName") categoryName : String, @Query("strategy") strategy : String):Flowable<FoundBean2>

    //获取首页第一页数据
    @GET("feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun gethomeinfo():Flowable<HomeBean>
    //热门
    @GET("http://baobab.wandoujia.com/api/v3/ranklist")
    fun getHotData(@Query("num") num: Int, @Query("strategy") strategy: String, @Query("udid") udid: String, @Query("vc") vc: Int) :Flowable<HotBean>


    //上传图片
    @Multipart
    @POST("file/upload")
    fun upLoad(@Part("uid") uid: RequestBody, @Part file: MultipartBody.Part): Call<UpLoadBean>

    @GET("user/getUserInfo?uid=552&token=4B5DAF274221936555E01E5F7BC271F4")
    fun getdd(): Flowable<UserBean>
}