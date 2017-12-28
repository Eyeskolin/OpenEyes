package com.zpc.kolin_eyes.fragmnet

import android.util.Log
import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.bean.HomeBean
import com.zpc.kolin_eyes.presenter.HomePrestener
import com.zpc.kolin_eyes.view.HVIew

/**
 * Created by DELL on 2017/12/27.
 */
class Home : BaseFragment<HomePrestener>(),HVIew {
    override fun getData(homeBean: HomeBean) {
        Log.i("xxxxx",homeBean.nextPageUrl)
    }

    override fun getLayoutId(): Int {
        return R.layout.home_fra
    }

    override fun initView(view: View?) {
    }

    override fun getPrestener(): HomePrestener {
        var pres: HomePrestener = HomePrestener(this)
        return pres
    }

    override fun initData() {
        prestener!!.relevance()
    }

}