package com.example.android2lesson1dz.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.android2lesson1dz.databinding.FragmentDetailFirstBinding

class DetailFirstFragment : Fragment() {

    private lateinit var binding: FragmentDetailFirstBinding
    private val args by navArgs<DetailFirstFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding.txtNameDetail.text = args.txt
        val logoPath = args.img
        Glide
            .with(binding.imageDetail.context)
            .load(logoPath)
            .into(binding.imageDetail)
    }
}
