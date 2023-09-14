package com.example.testtask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.databinding.HotellayoutBinding
import com.example.testtask.databinding.PostlayoutBinding
import com.example.testtask.model.HotelItem
import com.example.testtask.model.Postmodel

class PostRecycle(private val mList: List<Postmodel>) : RecyclerView.Adapter<PostRecycle.PostViewHoler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHoler {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PostlayoutBinding.inflate(inflater, parent, false)
        return PostViewHoler(binding)
    }

    override fun onBindViewHolder(holder: PostViewHoler, position: Int) {
        val item = mList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class PostViewHoler(private val binding: PostlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Postmodel) {
            binding.backgroundimagepost.setImageResource(item.background)
            binding.profileimage.setImageResource(item.profileImage)
            binding.dislikeimage.setImageResource(item.dislikeImage)
            binding.likeimage.setImageResource(item.likeImage)
            binding.likecount.text = item.likeCount.toString()
            binding.dislikecount.text = item.dislikeCount.toString()
            binding.description.text = item.description.toString()
            binding.nametext.text = item.profileName.toString()
        }
    }
}