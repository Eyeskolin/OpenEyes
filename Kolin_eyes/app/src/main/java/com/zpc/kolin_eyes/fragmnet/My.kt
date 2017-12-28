package com.zpc.kolin_eyes.fragmnet

import android.content.Intent
import android.view.View
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.*
import com.zpc.kolin_eyes.presenter.MinePrestener
import kotlinx.android.synthetic.main.my_fra.*

/**
 * Created by DELL on 2017/12/27.
 */
class My :BaseFragment<MinePrestener>() {
    override fun getLayoutId(): Int = R.layout.my_fra

    override fun initView(view: View?) {
        sett?.setOnClickListener{
            val intent=Intent(activity,SettingActivity::class.java)
            startActivity(intent)
        }
        cache?.setOnClickListener{
            val intent=Intent(activity,CacheActivity::class.java)
            startActivity(intent)
        }
        hostroy?.setOnClickListener{
            val intent=Intent(activity,HostroyActivity::class.java)
            startActivity(intent)
        }
        feedback?.setOnClickListener{
            val intent=Intent(activity,FeedBackActivity::class.java)
            startActivity(intent)
        }
    }

    override fun getPrestener(): MinePrestener {
        var minePrestener :MinePrestener = MinePrestener()
        return minePrestener
    }

    override fun initData() {
    }

}