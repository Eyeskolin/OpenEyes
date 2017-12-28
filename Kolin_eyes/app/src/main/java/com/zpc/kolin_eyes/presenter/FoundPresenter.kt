package com.zpc.kolin_eyes.presenter

import com.zpc.kolin_eyes.bean.FoundBean
import com.zpc.kolin_eyes.model.FoundModel
import com.zpc.kolin_eyes.view.IFoundView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.lang.ref.WeakReference

/**
 * Created by lenovo on 2017/12/27.
 */
class FoundPresenter (iFoundView: IFoundView){

    var model: FoundModel = FoundModel()
    var weakReference: WeakReference<IFoundView>? = null
    //得到view
    val view: IFoundView?
        get() = if (weakReference != null) weakReference!!.get() else null

            //p关联m 请求数据
            fun pm() {
                val flowable = model.getFoundData()
                flowable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe{ foundbean : FoundBean ->
                            view!!.getFoundData(foundbean)
                        }
            }

            fun attachView(view: IFoundView) {
                weakReference = WeakReference(view)
            }

            fun deattachView(){
                if (weakReference != null){
                    weakReference!!.clear()
                    weakReference = null
                }
            }
}