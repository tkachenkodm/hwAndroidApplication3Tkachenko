package com.example.hwandroidapplication3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hwandroidapplication3.databinding.BottomSheetFragmentLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment : BottomSheetDialogFragment() {
    lateinit var bottomSheetFragmentLayoutBinding: BottomSheetFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bottomSheetFragmentLayoutBinding =
            BottomSheetFragmentLayoutBinding.inflate(inflater, container, false)
        return bottomSheetFragmentLayoutBinding.root
    }
}