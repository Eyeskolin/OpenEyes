package com.zpc.kolin_eyes.fragmnet

import android.util.Log
import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.bean.Homeinfo
import com.zpc.kolin_eyes.presenter.Hpresenter
import com.zpc.kolin_eyes.view.HVIew

/**
 * Created by DELL on 2017/12/27.
 */
class Home : BaseFragment<Hpresenter>(),HVIew{
    override fun getLayoutId(): Int {
        return R.layout.home_fra
    }

    override fun initView(view: View?) {

    }

    override fun getPrestener(): Hpresenter {
        var hpresenter : Hpresenter =Hpresenter(this)
        return hpresenter
    }

    override fun initData() {
        prestener!!.relevance()
    }

    override fun getData(homeinfo: Homeinfo) {
        val pageUrl = homeinfo.nextPageUrl
        Log.i("xxx",pageUrl.toString())
    }

}