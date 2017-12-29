package com.zpc.kolin_eyes.net


import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.HomeBean
import com.zpc.kolin_eyes.bean.UpLoadBean
import com.zpc.kolin_eyes.bean.UserBean
import io.reactivex.Flowable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

/**
 * Created by DELL on 2017/12/27.
 */
interface ApiService {
    @GET("categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun getString(): Flowable<List<FoudBean>>

    //获取首页第一页数据
    @GET("feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun gethomeinfo(): Flowable<HomeBean>


    //上传图片
    @Multipart
    @POST("file/upload")
    fun upLoad(@Part("uid") uid: RequestBody, @Part file: MultipartBody.Part): Call<UpLoadBean>

    @GET("user/getUserInfo?uid=552&token=4B5DAF274221936555E01E5F7BC271F4")
    fun getdd(): Flowable<UserBean>
}