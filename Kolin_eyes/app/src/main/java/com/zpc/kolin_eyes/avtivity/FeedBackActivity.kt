package com.zpc.kolin_eyes.avtivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zpc.kolin_eyes.R
import kotlinx.android.synthetic.main.activity_feed_back.*

class FeedBackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed_back)
        back_feed?.setOnClickListener{
            finish()
        }
    }
}
