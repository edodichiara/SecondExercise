package com.example.secondexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.secondexercise.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
    private var bindingFirst: FragmentFirstBinding? = null
    private val binding get() = bindingFirst!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingFirst = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        bindingFirst = null
    }

}