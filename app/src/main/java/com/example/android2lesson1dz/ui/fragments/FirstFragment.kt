package com.example.android2lesson1dz.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android2lesson1dz.R
import com.example.android2lesson1dz.databinding.FragmentFirstBinding
import com.example.android2lesson1dz.ui.iterface.OnItemTextListener
import com.example.android2lesson1dz.ui.adapters.FirstAdapter
import com.example.android2lesson1dz.data.GeneralModel
import com.example.android2lesson1dz.data.repository.FirstRepository

class FirstFragment : Fragment(), OnItemTextListener {

    private lateinit var binding: FragmentFirstBinding
    private var listCat = mutableListOf<GeneralModel>()
    private val repository = FirstRepository()
    private val catAdapter = FirstAdapter(listCat, this)
    private val args by navArgs<FirstFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        duplicationRemoval()
        initialization()
        setupListener()
        getData()
    }

    private fun setupListener() {
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_addFirstFragment)
        }
    }

    private fun duplicationRemoval() {
        listCat.clear()
    }

    private fun initialization() {
        binding.recycler.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repository.getListOfCatHTP())
        binding.recycler.adapter = catAdapter
    }

    private fun getData() {
        if (args.textseri.isNotEmpty()) {
            listCat.add(GeneralModel("", args.textseri))
        }
    }

    override fun onItemClick(model: GeneralModel) = with(binding) {
        val action: NavDirections =
            FirstFragmentDirections.actionFirstFragmentToDetailFirstFragment(
                model.name.toString(),
                model.image.toString()
            )
        findNavController().navigate(action)
    }
}
