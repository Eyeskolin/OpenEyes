package com.zpc.kolin_eyes.fragmnet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.astuetz.PagerSlidingTabStrip
import com.facebook.drawee.backends.pipeline.Fresco
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.adapter.HotAdatpter

/**
 * Created by DELL on 2017/12/27.
 */
class Hot: Fragment() {
var mTabs = listOf<String>("周排行", "月排行", "总排行").toMutableList()
lateinit var mFragments: ArrayList<Fragment>
val STRATEGY = arrayOf("weekly", "monthly", "historical")
lateinit var tabStrip: PagerSlidingTabStrip
lateinit var viewPager : ViewPager
override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    Fresco.initialize(activity)
    val view = LayoutInflater.from(getContext()).inflate(R.layout.hot_fra, container, false)
    tabStrip = view.findViewById<PagerSlidingTabStrip>(R.id.tabs_hot) as PagerSlidingTabStrip
    viewPager = view.findViewById<ViewPager>(R.id.vp_hot) as ViewPager
    initView()
    viewPager.adapter = HotAdatpter(fragmentManager, mFragments, mTabs)
    tabStrip.setViewPager(viewPager);
    return view
}
fun initView() {
    var weekFragment: RankFragment = RankFragment()
    var weekBundle = Bundle()
    weekBundle.putString("strategy", STRATEGY[0])
    weekFragment.arguments = weekBundle
    var monthFragment: RankFragment = RankFragment()
    var monthBundle = Bundle()
    monthBundle.putString("strategy", STRATEGY[1])
    monthFragment.arguments = monthBundle
    var allFragment: RankFragment = RankFragment()
    var allBundle = Bundle()
    allBundle.putString("strategy", STRATEGY[2])
    allFragment.arguments = allBundle
    mFragments = ArrayList()
    mFragments.add(weekFragment as Fragment)
    mFragments.add(monthFragment as Fragment)
    mFragments.add(allFragment as Fragment)

}
}