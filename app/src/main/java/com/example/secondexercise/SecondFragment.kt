package com.example.secondexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondexercise.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var bindingSecond: FragmentSecondBinding? = null
    private val binding get() = bindingSecond!!

    var arts = listOf<Art>(Art("Gioconda", R.drawable.gioconda), Art("Nascita di Venere", R.drawable.nascita_di_venere), Art("Primavera", R.drawable.primavera_botticelli), Art("Impressione sole nascente", R.drawable.impressione_sole_nascente))


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