package com.zpc.kolin_eyes.bean

/**
 * Created by DELL on 2017/12/28.
 */

class UserBean {

    var code: String? = null
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {


        var age: Any? = null
        var appkey: String? = null
        var appsecret: String? = null
        var createtime: String? = null
        var email: Any? = null
        var gender: Any? = null
        var icon: String? = null
        var mobile: String? = null
        var money: Any? = null
        var nickname: Any? = null
        var password: String? = null
        var token: String? = null
        var uid: Int = 0
        var username: String? = null
    }
}
