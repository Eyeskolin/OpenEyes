package com.zpc.kolin_eyes.avtivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.jzvd.JZVideoPlayerStandard
import com.zpc.kolin_eyes.R
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val playurl = intent.getStringExtra("playurl")
        val description = intent.getStringExtra("description")
        val title = intent.getStringExtra("title")

        jiechao_player.setUp(playurl,JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL,"恩恩")
        des_player.setText(description)
        titlt_player.setText(title)

    }
}
