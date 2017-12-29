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
import com.zpc.kolin_eyes.bean.FoudBean
import com.zpc.kolin_eyes.bean.FoundBean2

/**
 * Created by lenovo on 2017/12/28.
 */
class FoundAdapter2(var context: Context,  var list: List<FoundBean2.ItemListBean>) : RecyclerView.Adapter<FoundAdapter2.FoundViewHolder2>() {
    var mListener: ((pos: Int) -> Unit)? = null
    //var list: List<FoundBean2> = list
    fun setOnItemClickListener(listener: ((pos: Int) -> Unit)) {
        mListener = listener
    }
    override fun onBindViewHolder(holder: FoundViewHolder2?, position: Int) {
        holder as FoundViewHolder2
        holder.textview.setText(list.get(position).data!!.title)
        holder.imageview.scaleType = ImageView.ScaleType.FIT_XY
        Picasso.with(context)
                .load(list.get(position).data!!.cover!!.feed)
                .into(holder.imageview)

           }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FoundViewHolder2 {
        var view = LayoutInflater.from(parent!!.context).inflate(R.layout.founditem , parent , false)
        return FoundAdapter2.FoundViewHolder2(view)
    }

    class FoundViewHolder2(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var textview = itemview.findViewById(R.id.fd_title) as TextView
        var imageview = itemview.findViewById(R.id.fd_pic) as ImageView
    }
}