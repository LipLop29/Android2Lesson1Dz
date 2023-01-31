package com.example.android2lesson1dz.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2lesson1dz.databinding.FragmentFirstBinding
import com.example.android2lesson1dz.ui.iterface.OnItemTextListener
import com.example.android2lesson1dz.ui.adapters.FirstAdapter
import com.example.android2lesson1dz.ui.data.Model
import com.example.android2lesson1dz.ui.repository.FirstRepository

class FirstFragment : Fragment(), OnItemTextListener {
    private lateinit var binding: FragmentFirstBinding
    private var listCat = mutableListOf<Model>()
    private val repository = FirstRepository()
    private val catAdapter = FirstAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dub()
        initialization()
    }

    private fun dub() {
        listCat.clear()
    }

    private fun initialization() {
        binding.recycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repository.getListOfCatHTP())
        binding.recycler.adapter = catAdapter
    }

    override fun onItemClick(model: Model) = with(binding) {
        val action: NavDirections =
            FirstFragmentDirections.actionFirstFragmentToDetailFirstFragment(
                model.name.toString(),
                model.image.toString()
            )
        findNavController().navigate(action)
    }
}