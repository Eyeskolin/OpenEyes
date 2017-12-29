package com.zpc.kolin_eyes.avtivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log

import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.FoundAdapter2
import com.zpc.kolin_eyes.bean.FoundBean2
import com.zpc.kolin_eyes.presenter.FoundPresenter2
import com.zpc.kolin_eyes.view.IFoundView2
import kotlinx.android.synthetic.main.found2.*
import kotlinx.android.synthetic.main.found_fra.*

class FoundActivity : BaseActivity<FoundPresenter2>()  , IFoundView2{

    var mIsRefresh: Boolean = false
    var data : String = ""
    var name : String = ""
    var mList = ArrayList<FoundBean2.ItemListBean>()
    var mstart: Int = 1
    var adapter : FoundAdapter2? = null
    override fun getFoundData2(found: FoundBean2) {
        val itemList = found.itemList
        var adapter = FoundAdapter2(this  , itemList!!)
        find_rv.adapter = adapter
    }

    override fun layoutId(): Int {
        return R.layout.found2
    }

    override fun initView() {
        find_rv.layoutManager = LinearLayoutManager(this)
        name = intent.getStringExtra("name")
        detail_title.setText(name)
    }

    override fun initData() {
    }

    override fun getPrestener(): FoundPresenter2 {
        var  foundpresenter2 : FoundPresenter2 = FoundPresenter2(this)
        Log.i("xxxxx",name)
        foundpresenter2.pm2(this,mstart,10,name,"date")
        return foundpresenter2
    }

}
