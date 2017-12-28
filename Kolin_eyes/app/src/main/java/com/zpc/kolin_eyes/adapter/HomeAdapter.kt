package com.zpc.kolin_eyes.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.zpc.kolin_eyes.R
import com.zpc.kolin_eyes.bean.ChildHomeinfo

/**
 * Created by FLOWER on 2017/12/27.
 */
class HomeAdapter(context: Context,list: ArrayList<ChildHomeinfo>) : RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    private val context : Context = context
    private val list : ArrayList<ChildHomeinfo> = list
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_item, parent, false)
        val holder = MyViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder!!.home_title!!.setText(list.get(position).title)
        Picasso.with(context).load(list.get(position).icon).into(holder!!.home_img)
    }

    override fun getItemCount(): Int = list.size


    class MyViewHolder(view:View?) : RecyclerView.ViewHolder(view){
        val home_img = view!!.findViewById<ImageView>(R.id.home_img) as ImageView
        val home_title = view!!.findViewById<TextView>(R.id.home_title) as TextView
    }
}