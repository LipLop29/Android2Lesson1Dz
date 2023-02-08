package com.example.android2lesson1dz.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2lesson1dz.data.GeneralModel
import com.example.android2lesson1dz.databinding.ItemFirstBinding

class ThirdAdapter(
    private var listCat: MutableList<GeneralModel>,
) : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {

    class ThirdViewHolder(private var binding: ItemFirstBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(programModel: GeneralModel) {
            binding.txtName.text = programModel.name
            Glide.with(binding.imageCat.context).load(programModel.image).into(binding.imageCat)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        return ThirdViewHolder(
            ItemFirstBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}