package com.zpc.kolin_eyes.fragmnet

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.bj.kotlinproject.bean.HotBean
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.RankAdapter
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.avtivity.PlayerActivity
import com.zpc.kolin_eyes.presenter.HotPresenter
import com.zpc.kolin_eyes.view.IHotView
import kotlinx.android.synthetic.main.rank_fragment.*

/**
 * Created by せしおゆ on 2017/12/28.
 */
class RankFragment() : BaseFragment<HotPresenter>(), IHotView {
    override fun getLayoutId(): Int = R.layout.rank_fragment

    override fun initView(view: View?) {
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    override fun getPrestener(): HotPresenter {
        return HotPresenter(this)
    }


    override fun initData() {
        if (arguments != null) {
            var mStrategy = arguments.getString("strategy")
            prestener!!.relevance(mStrategy)
        }
    }
    override fun getHotData(hotBean: HotBean) {
        val list = hotBean.itemList
        var mAdapter = RankAdapter(context, list!!)
        recyclerView.adapter = mAdapter
        mAdapter.setOniteCZzlickListener(object : RankAdapter.OnItemClickLitener {
            override fun onItemClick(position: Int) {
                val playUrl = hotBean.itemList!!.get(position).data!!.playUrl
                val description = hotBean.itemList!!.get(position).data!!.description
                val category = hotBean.itemList!!.get(position).data!!.category
                val title = hotBean.itemList!!.get(position).data!!.title;
//                val intent = Intent()
//                intent.setClass(context, PlayerActivity::class.java)
//                intent.putExtra("playurl",list.get(position))
//                context.startActivity(intent)
                 var intent= Intent()
                 intent.setClass(activity, PlayerActivity::class.java)
                 intent.putExtra("playurl",playUrl)
                 intent.putExtra("description",description)
                 intent.putExtra("title",title)
                 startActivity(intent)
            }

        })
        mAdapter.notifyDataSetChanged()

    }
}