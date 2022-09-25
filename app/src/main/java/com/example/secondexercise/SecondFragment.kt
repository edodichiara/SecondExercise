package com.example.secondexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondexercise.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var bindingSecond: FragmentSecondBinding? = null
    private val binding get() = bindingSecond!!

    var arts = listOf<Art>(Art("Gioconda"), Art("Nascita di Venere"), Art("Primavera"), Art("Impressione sole nascente"))


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingSecond = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ArtAdapter(arts)
        binding.artList.adapter = adapter
        binding.artList.layoutManager = LinearLayoutManager(context)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindingSecond = null
    }


}