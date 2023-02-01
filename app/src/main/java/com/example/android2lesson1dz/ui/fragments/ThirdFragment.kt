package com.example.android2lesson1dz.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2lesson1dz.databinding.FragmentThirdBinding
import com.example.android2lesson1dz.ui.adapters.ThirdAdapter
import com.example.android2lesson1dz.data.GeneralModel
import com.example.android2lesson1dz.data.repository.ThirdRepository

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private var listCat = mutableListOf<GeneralModel>()
    private val repository = ThirdRepository()
    private val catAdapter = ThirdAdapter(listCat)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
    }

    private fun initialization() {
        binding.recycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repository.getListOfProgram())
        binding.recycler.adapter = catAdapter
    }
}