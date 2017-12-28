package com.zpc.kolin_eyes.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.zpc.kolin_eyes.fragmnet.Hot_Yue
import com.zpc.kolin_eyes.fragmnet.Hot_Zhou
import com.zpc.kolin_eyes.fragmnet.Hot_Zong

/**
 * Created by せしおゆ on 2017/12/28.
 */
class HotAdapter(getSupportFragmentManager:FragmentManager,list:List<String>): FragmentPagerAdapter(getSupportFragmentManager){
    var listt:List<String> = list

    override fun getPageTitle(position: Int): String {
        return listt.get(position)
    }
    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
          val  fragment:Fragment

            when (position) {
                0 -> fragment = Hot_Zhou()

                1 -> fragment = Hot_Yue()

                2 -> fragment = Hot_Zong()
            }

          return fragment
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        listt.size
}


}