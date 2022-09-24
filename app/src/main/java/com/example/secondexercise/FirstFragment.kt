package com.example.secondexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.secondexercise.databinding.FragmentFirstBinding


class FirstFragment : Fragment(R.layout.fragment_first) {
    private var bindingFirst: FragmentFirstBinding? = null
    private val binding get() = bindingFirst!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingFirst = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFirstFragment.setOnClickListener {
            if (binding.editTextFirstFragment.text.contains("@") && binding.editTextFirstFragment.length() >= 5){
                binding.emailText.text = binding.editTextFirstFragment.text
                Toast.makeText(context, resources.getString(R.string.toast_text), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, resources.getString(R.string.email_not_valid_error), Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        bindingFirst = null
    }

}