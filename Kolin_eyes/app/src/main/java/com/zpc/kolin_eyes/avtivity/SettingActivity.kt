package com.zpc.kolin_eyes.avtivity

import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.presenter.MinePrestener
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : BaseActivity<MinePrestener>() {
    override fun layoutId(): Int =R.layout.activity_setting

    override fun initView() {
        //返回
        back_sett?.setOnClickListener{
            finish()
        }
        //点击上传头像
        ll_sett?.setOnClickListener{

        }
    }

    override fun initData() {
    }

    override fun getPrestener(): MinePrestener {
        var minePre :MinePrestener = MinePrestener()
        return minePre
    }

}
