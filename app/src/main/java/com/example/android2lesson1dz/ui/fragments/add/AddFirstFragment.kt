package com.example.android2lesson1dz.ui.fragments.add

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.android2lesson1dz.databinding.FragmentAddFirstBinding

class AddFirstFragment : Fragment() {

    private var binding: FragmentAddFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click()
    }

    private fun click() {
        binding?.btnAddItem?.setOnClickListener {
            val text = binding?.etText?.text.toString()
            val action: NavDirections =
                AddFirstFragmentDirections.actionAddFirstFragmentToFirstFragment().setTextseri(text)
            findNavController().navigate(action)
        }
    }
}