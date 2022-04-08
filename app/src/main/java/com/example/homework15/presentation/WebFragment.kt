package com.example.homework15.presentation

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.homework15.databinding.FragmentWebBinding


class WebFragment : Fragment() {

    private var binding: FragmentWebBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWebBinding.inflate(inflater, container, false)

        return binding?.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpWebView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setUpWebView() {
        binding?.wbYandexGoogle?.webViewClient
        binding?.wbYandexGoogle?.apply {
            loadUrl(arguments?.getString("WEB_EXTRA_KEY").toString())
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
        }
    }
}