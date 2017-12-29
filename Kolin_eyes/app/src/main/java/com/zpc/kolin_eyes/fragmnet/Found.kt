package com.zpc.kolin_eyes.fragmnet

import android.content.Intent
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.View
import android.widget.Toast
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.FoundAdapter
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.avtivity.FoundActivity
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.presenter.FoundPresenter
import com.zpc.kolin_eyes.view.IFoundView
import kotlinx.android.synthetic.main.found_fra.*

/**
 * Created by DELL on 2017/12/27.
 */
class Found:BaseFragment<FoundPresenter>() , IFoundView  {
    override fun getFoundData(found: List<FoudBean>) {
        var adapter = FoundAdapter(activity , found)
        fx_rv.adapter = adapter

    }

    override fun getLayoutId(): Int {
        return R.layout.found_fra
    }

    override fun initView(view: View?) {
        fx_rv.layoutManager = GridLayoutManager(activity , 2)
    }

    override fun getPrestener(): FoundPresenter {
        var foundpresenter : FoundPresenter = FoundPresenter(this)
        return foundpresenter


    }

    override fun initData() {
        prestener!!.pm()
    }


}