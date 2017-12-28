package com.zpc.kolin_eyes.fragmnet

import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.HotAdapter
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.presenter.HotPresenter
import com.zpc.kolin_eyes.view.IHotView
import kotlinx.android.synthetic.main.hot_fra.*

/**
 * Created by DELL on 2017/12/27.
 */
class Hot:BaseFragment<HotPresenter>(),IHotView{
    override fun getLayoutId(): Int {

        return  R.layout.hot_fra
    }

    override fun initView(view: View?) {

    }

    override fun getPrestener(): HotPresenter {
        var hotpresenter : HotPresenter =HotPresenter()
        return hotpresenter
    }

    override fun initData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val list=listOf<String>("周排行","月排行","总排行")
        val madapter:HotAdapter= HotAdapter(fragmentManager,list)
        vp.adapter=madapter
    }


}