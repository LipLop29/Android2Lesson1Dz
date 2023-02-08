package com.example.android2lesson1dz.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2lesson1dz.databinding.ItemFirstBinding
import com.example.android2lesson1dz.ui.iterface.OnItemTextListener
import com.example.android2lesson1dz.data.GeneralModel

class FirstAdapter(
    private var listCat: MutableList<GeneralModel>,
    private val onItemTextListener: OnItemTextListener
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private var binding:ItemFirstBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(catModel: GeneralModel) {
            binding.txtName.text = catModel.name
            Glide.with(binding.imageCat.context).load(catModel.image).into(binding.imageCat)
            itemView.setOnClickListener {
                onItemTextListener.onItemClick(catModel)
                binding.txtName.text = catModel.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            ItemFirstBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}