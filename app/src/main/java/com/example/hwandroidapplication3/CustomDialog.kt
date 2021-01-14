package com.example.hwandroidapplication3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.hwandroidapplication3.databinding.DialogFragmentLayoutBinding

class CustomDialog : DialogFragment() {
    lateinit var customDialogBinding: DialogFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        customDialogBinding = DialogFragmentLayoutBinding.inflate(inflater, container, false)
        return customDialogBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        customDialogBinding.btnClose.setOnClickListener {
            this.dismiss()
        }
    }
}