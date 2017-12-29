package com.zpc.kolin_eyes.avtivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.ScaleAnimation
import com.zpc.kolin_eyes.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //设置为全屏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_welcome)
        startAnim()
    }

    private fun startAnim() {
        //透明动画
        val alphaAnimation = AlphaAnimation(0.1f,1.0f)
        //动画执行时间
        alphaAnimation.duration = 1000
        //缩放动画
        val scaleAnimation = ScaleAnimation(0.1f,1.0f,0.1f,1.0f, ScaleAnimation.RELATIVE_TO_SELF,0.5f, ScaleAnimation.RELATIVE_TO_SELF,0.5f)
        //动画执行时间
        scaleAnimation.duration =1000
        //动画集合
        val animationSet = AnimationSet(true)
        animationSet.addAnimation(alphaAnimation)
        animationSet.addAnimation(scaleAnimation)
        animationSet.duration = 1000
        //启动动画
        wel_img.startAnimation(animationSet)
        //设置动画监听
        animationSet.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationRepeat(animation: Animation?) {
            }
            override fun onAnimationEnd(animation: Animation?) {
                //动画结束时跳转
                var intent = Intent(this@WelcomeActivity,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            override fun onAnimationStart(animation: Animation?) {
            }
        })
    }
}
