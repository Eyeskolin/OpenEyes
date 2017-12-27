package com.zpc.kolin_eyes

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zpc.kolin_eyes.fragmnet.Found
import com.zpc.kolin_eyes.fragmnet.Home
import com.zpc.kolin_eyes.fragmnet.Hot
import com.zpc.kolin_eyes.fragmnet.My
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //设置底部导航栏样式及属性
        btb.init(supportFragmentManager)
                .setImgSize(30F, 30F)
                .setFontSize(12F)
                .setChangeColor(Color.BLACK,Color.DKGRAY)
                .addTabItem("我的",R.mipmap.home_normal,Home::class.java)
                .addTabItem("发现",R.mipmap.find_normal,Found::class.java)
                .addTabItem("热门",R.mipmap.hot_normal,Hot::class.java)
                .addTabItem("我的",R.mipmap.mine_normal,My::class.java)
                .isShowDivider(false)
    }
}
