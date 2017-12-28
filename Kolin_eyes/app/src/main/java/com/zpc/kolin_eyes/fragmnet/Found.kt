package com.zpc.kolin_eyes.fragmnet

import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.bean.FoundBean
import com.zpc.kolin_eyes.presenter.FoundPresenter
import com.zpc.kolin_eyes.view.IFoundView

/**
 * Created by DELL on 2017/12/27.
 */
class Found:BaseFragment<FoundPresenter>() , IFoundView  {
    override fun getFoundData(found: FoundBean) {
        Log.i("ddd" , found.bgColor.toString())
    }

    override fun getLayoutId(): Int {
        return R.layout.found_fra
    }

    override fun initView(view: View?) {
    }

    override fun getPrestener(): FoundPresenter {
        var foundpresenter : FoundPresenter = FoundPresenter(this)
        return foundpresenter
    }

    override fun initData() {
        prestener!!.pm()
    }


}