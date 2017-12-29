package com.zpc.kolin_eyes.presenter

import com.bj.kotlinproject.bean.HotBean
import com.bj.kotlinproject.net.OnFinish
import com.zpc.kolin_eyes.model.HotModel
import com.zpc.kolin_eyes.view.IHotView

/**
 * Created by せしおゆ on 2017/12/28.
 */
class HotPresenter(hotView: IHotView): OnFinish<HotBean> {

    var hotmodel: HotModel?= HotModel()
    var hotView:IHotView?=hotView
    fun relevance(mStrategy:String){
        hotmodel!!.getHot(this,mStrategy)
    }
    override fun onSuccess(t: HotBean) {

        hotView!!.getHotData(t!!)
    }

}