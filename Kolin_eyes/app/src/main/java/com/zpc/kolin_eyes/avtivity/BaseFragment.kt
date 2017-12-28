package com.zpc.kolin_eyes.avtivity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by DELL on 2017/12/27.
 */
abstract class BaseFragment<T> : Fragment() {
    var prestener: T? = null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view :View?=inflater?.inflate(getLayoutId(),container,false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view!!)
        prestener=getPrestener()
        initData()
    }

    //初始化布局
    abstract fun getLayoutId():Int
    //初始化view
    abstract fun initView(view: View?)

    internal abstract fun getPrestener():T

    abstract fun initData()
}