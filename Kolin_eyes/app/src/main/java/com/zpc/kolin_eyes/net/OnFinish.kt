package com.bj.kotlinproject.net

/**
 * Created by  on 2017/12/27.
 */
interface OnFinish<T> {
    abstract fun onSuccess(t:T)
}