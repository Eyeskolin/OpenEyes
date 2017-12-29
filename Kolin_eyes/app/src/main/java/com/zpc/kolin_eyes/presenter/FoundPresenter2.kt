package com.zpc.kolin_eyes.presenter

import android.content.Context
import android.util.Log
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.FoundBean2
import com.zpc.kolin_eyes.model.FoundModel2
import com.zpc.kolin_eyes.view.IFoundView
import com.zpc.kolin_eyes.view.IFoundView2
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.ref.WeakReference

/**
 * Created by lenovo on 2017/12/28.
 */
class FoundPresenter2(iFoundView2: IFoundView2) {
    var foundview2 : IFoundView2 ?= iFoundView2
    var foundmodel2 : FoundModel2 = FoundModel2()
    var weakReference2 : WeakReference<IFoundView2>? =  null

    //得到view
    val view: IFoundView2?
        get() = if (weakReference2 != null) weakReference2!!.get() else null

    //p关联m 请求数据
    fun pm2(context: Context, start : Int, num : Int, categoryName: String, data: String) {
        val flowable = foundmodel2.getFoundData2(context, start, num, categoryName, data)
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { foundbean2:FoundBean2 ->
                    Log.e("SSSS",foundbean2.toString());
                    foundview2!!.getFoundData2(foundbean2)
                }
    }

    fun attachView(view: IFoundView2) {
        weakReference2 = WeakReference(view)
    }

    fun deattachView(){
        if (weakReference2 != null){
            weakReference2!!.clear()
            weakReference2 = null
        }
    }
}