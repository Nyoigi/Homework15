package com.example.homework15.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.homework15.databinding.FragmentFirstBinding
import com.example.homework15.utils.extensions.navigateToFragment


class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navigateToWebView()
    }

    private fun navigateToWebView() {
        binding?.btnYandex?.setOnClickListener {
            navigateWithData(WebFragment(), "https://yandex.ru/")
        }
        binding?.btnGoogle?.setOnClickListener {
            navigateWithData(WebFragment(), "https://www.google.ru/")
        }
    }

    private fun navigateWithData(fragment: Fragment, webUrl: String) {
        val bundle = Bundle()
        bundle.putString("WEB_EXTRA_KEY", webUrl)
        fragment.arguments = bundle
        requireActivity()
            .supportFragmentManager
            .navigateToFragment(fragment = fragment, addToBackStack = true)
    }
}