package com.zpc.kolin_eyes.avtivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<T> : AppCompatActivity() {
    var presenter: T? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView()
        presenter = getPrestener()
        initData()
    }

    //加载布局
    abstract fun layoutId(): Int
    abstract fun initView()
    abstract fun initData()
    internal abstract fun getPrestener():T
}
