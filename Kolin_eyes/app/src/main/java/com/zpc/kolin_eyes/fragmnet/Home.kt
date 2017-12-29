package com.zpc.kolin_eyes.fragmnet

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.HomeAdapter
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.bean.ChildHomeinfo
import com.zpc.kolin_eyes.bean.HomeBean
import com.zpc.kolin_eyes.presenter.HomePrestener
import com.zpc.kolin_eyes.view.HVIew
import kotlinx.android.synthetic.main.home_fra.*

/**
 * Created by DELL on 2017/12/27.
 */

class Home : BaseFragment<HomePrestener>(), HVIew {
    override fun getData(homeinfo: HomeBean) {
        val itemList = homeinfo.issueList!![1].itemList

        var list = ArrayList<ChildHomeinfo>()
        for (i in itemList!!.indices) {

            if (i!= 0) {
                val itemListBean = itemList[i]
                val data = itemListBean.data
                val title = data!!.title
                val description = data!!.description
                val detail = data!!.cover?.detail
                val playUrl = data!!.playUrl

                val childHomeinfo = ChildHomeinfo(detail.toString(), title.toString(), description.toString(), playUrl.toString())
                list!!.add(childHomeinfo!!)
            }

        }
        val homeAdapter = HomeAdapter(this!!.activity, list)
        home_rlv.adapter = homeAdapter
    }

    override fun getLayoutId(): Int {
        return R.layout.home_fra
    }

    override fun initView(view: View?) {
        home_rlv!!.layoutManager = LinearLayoutManager(activity)
    }

    override fun getPrestener(): HomePrestener {
        var pres: HomePrestener = HomePrestener(this)
        return pres
    }

    override fun initData() {
        prestener!!.relevance()
    }


}