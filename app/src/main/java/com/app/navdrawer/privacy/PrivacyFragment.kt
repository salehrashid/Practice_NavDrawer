package com.app.navdrawer.privacy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.app.navdrawer.R
import com.app.navdrawer.databinding.FragmentHomeBinding
import com.app.navdrawer.databinding.FragmentPrivacyBinding
import com.app.navdrawer.home.HomeViewModel

class PrivacyFragment : Fragment() {
    private var _binding: FragmentPrivacyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val privacyViewModel = ViewModelProvider(this).get(PrivacyModelView::class.java)
        _binding = FragmentPrivacyBinding.inflate(inflater, container, false)

        val root: View = binding.root
        val textView: TextView = binding.privacyText
        privacyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}