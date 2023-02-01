package com.example.android2lesson1dz.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2lesson1dz.databinding.ItemSecondBinding
import com.example.android2lesson1dz.data.GeneralModel

class SecondAdapter(
    private var listCat: MutableList<GeneralModel>,
) : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    class SecondViewHolder(private var binding: ItemSecondBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(cinemaModel: GeneralModel) {
            binding.txtName.text = cinemaModel.name
            Glide.with(binding.imageCat.context).load(cinemaModel.image).into(binding.imageCat)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        return SecondViewHolder(
            ItemSecondBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}