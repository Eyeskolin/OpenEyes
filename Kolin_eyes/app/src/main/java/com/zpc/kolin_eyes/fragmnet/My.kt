package com.zpc.kolin_eyes.fragmnet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zpc.kolin_eyes.R

/**
 * Created by DELL on 2017/12/27.
 */
class My :Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view :View?=inflater?.inflate(R.layout.my_fra,container,false)
        return view
    }
}