package com.zpc.kolin_eyes.avtivity

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import android.util.Log
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.bean.UpLoadBean
import com.zpc.kolin_eyes.net.ApiService
import com.zpc.kolin_eyes.net.Apii
import com.zpc.kolin_eyes.net.RetrofitUtil
import com.zpc.kolin_eyes.presenter.MinePrestener
import kotlinx.android.synthetic.main.activity_setting.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class SettingActivity : BaseActivity<MinePrestener>() {
    override fun layoutId(): Int =R.layout.activity_setting

    override fun initView() {
        //返回
        back_sett?.setOnClickListener{
            finish()
        }
        //点击上传头像
        ll_sett?.setOnClickListener{
            //调用相册
            val intent = Intent(Intent.ACTION_PICK,
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            //设置取回的数据类型
            //           intent.setType("image/*");
            startActivityForResult(intent, IMAGE)

        }
    }

    override fun initData() {

    }

    override fun getPrestener(): MinePrestener {
        var minePre :MinePrestener = MinePrestener()
        return minePre
    }
    companion object {

        //调用系统相册-选择图片
        private val IMAGE = 1
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //获取图片路径
        if (requestCode == IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            val selectedImage = data.data
            val filePathColumns = arrayOf(MediaStore.Images.Media.DATA)
            val c = contentResolver.query(selectedImage, filePathColumns, null, null, null)
            c!!.moveToFirst()
            val columnIndex = c.getColumnIndex(filePathColumns[0])
            val imagePath = c.getString(columnIndex)

            //            // 3.调取系统的裁剪
            //            Intent it = new Intent("com.android.camera.action.CROP");
            //            // 拿到图片 type 图片的类型
            //            it.setDataAndType(selectedImage, "image/*");
            //
            //            // 是否支持裁剪
            //            it.putExtra("crop", true);
            //            // 设置宽高比
            //            it.putExtra("aspectX", 1);
            //            it.putExtra("aspectY", 1);
            //            // 设置图片输出的大小
            //            it.putExtra("outputX", 250);
            //            it.putExtra("outputY", 250);
            //            // 是否支持人脸识别
            //            it.putExtra("onFaceDetection", false);
            //            it.putExtra("return-data", true);
            //
            //            startActivityForResult(it, IMAGE);


            val apiService = RetrofitUtil.getInstance(Apii.PIC_UPLOAD).create(ApiService::class.java)

            c.close()

            val file = File(imagePath)

            val requestBody = RequestBody.create(MediaType.parse("application/otcet-stream"), file)
            val body = MultipartBody.Part.createFormData("file", file.name, requestBody)
            val uid = RequestBody.create(MediaType.parse("multipart/form-data"), "552")

            val call = apiService!!.upLoad(uid, body)


            call.enqueue(object : Callback<UpLoadBean> {
                override fun onResponse(call: Call<UpLoadBean>, response: Response<UpLoadBean>) {
                    val resultBean = response.body()
                    Log.e("xxx", resultBean.msg)
                }

                override fun onFailure(call: Call<UpLoadBean>, t: Throwable) {
                    Log.e("xxx", "失败")
                }
            })
        }
       /* val apiService2 = RetrofitUtil.getInstance(Apii.PIC_UPLOAD).create(ApiService::class.java)
        val flowabl = apiService2?.getdd()
        flowabl!!.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { userBean:UserBean ->

                    Picasso.with(this).load(userBean!!.data!!.icon).into(pic_sett)
                }*/
    }

    override fun onResume() {
        super.onResume()
    }
}
