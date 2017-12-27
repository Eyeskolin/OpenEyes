package com.zpc.kolin_eyes.fragmnet

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.BaseFragment
import com.zpc.kolin_eyes.avtivity.SettingActivity
import com.zpc.kolin_eyes.presenter.MinePrestener
import kotlinx.android.synthetic.main.my_fra.*

/**
 * Created by DELL on 2017/12/27.
 */
class My :BaseFragment<MinePrestener>() {
    override fun getLayoutId(): Int = R.layout.my_fra

    override fun initView(view: View?) {
        sett.setOnClickListener{
            val intent=Intent(activity,SettingActivity::class.java)
            startActivity(intent)
            Toast.makeText(activity,"点击了",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getPrestener(): MinePrestener {
        var minePrestener :MinePrestener = MinePrestener()
        return minePrestener
    }

    override fun initData() {
    }

}