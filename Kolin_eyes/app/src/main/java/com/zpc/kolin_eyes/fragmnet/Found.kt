package com.zpc.kolin_eyes.fragmnet

import android.util.Log
import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.presenter.FoundPresenter
import com.zpc.kolin_eyes.view.IFoundView

/**
 * Created by DELL on 2017/12/27.
 */
class Found:BaseFragment<FoundPresenter>() , IFoundView  {
    override fun getFoundData(found: List<FoudBean>) {
        Log.i("xxx",found[0].name)
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