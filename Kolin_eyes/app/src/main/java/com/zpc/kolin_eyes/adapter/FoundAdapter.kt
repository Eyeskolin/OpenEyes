package com.zpc.kolin_eyes.adapter

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.avtivity.FoundActivity
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.FoundBean

/**
 * Created by lenovo on 2017/12/28.
 */
class FoundAdapter(var context: Context , var list: List<FoudBean>) : RecyclerView.Adapter<FoundAdapter.FoundViewHolder>() {

    var mListener: ((pos: Int) -> Unit)? = null
    fun setOnItemClickListener(listener: ((pos: Int) -> Unit)) {
        mListener = listener
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: FoundViewHolder?, position: Int) {
        holder!!.textview.text = list[position].name
        Picasso.with(context)
                .load(list[position].bgPicture)
                .into(holder.imageview)

        holder.imageview.setOnClickListener {
            var intent = Intent()
            intent.setClass( context , FoundActivity::class.java)
            intent.putExtra("name" , list.get(position).name)
            context.startActivity(intent)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FoundViewHolder {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.fragment2_item , parent , false)
        return FoundViewHolder(view)
    }

    class FoundViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var textview = itemview.findViewById(R.id.discover_tv_title) as TextView
        var imageview = itemview.findViewById(R.id.discover_simp) as ImageView
    }
}