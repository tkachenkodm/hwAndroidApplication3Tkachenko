package com.example.hwandroidapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.afollestad.materialdialogs.MaterialDialog
import com.example.hwandroidapplication3.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    private val bottomSheetBehavior: BottomSheetBehavior<LinearLayout> by lazy {
        BottomSheetBehavior.from(findViewById(R.id.bottom_sheet))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
        setListeners()
    }

    private fun setListeners() {
        //Alert dialog
        activityMainBinding.btnAlert.setOnClickListener {
            MaterialDialog(this).show {
                title(text = "Alert dialog")
                message(text = "Press OK to close dialog")
                positiveButton(text = "OK") {
                    it.dismiss()
                }
            }
        }

        //Fragment dialog
        activityMainBinding.btnFragment.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(CustomDialog(), "EXAMPLE_TAG")
                .commitAllowingStateLoss()
        }

        //Bottom sheet
        activityMainBinding.btnBottomSheet.setOnClickListener {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        //Bottom sheet fragment dialog
        activityMainBinding.btnBottomSheetFragment.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(BottomSheetFragment(), "EXAMPLE_TAG")
                .commitAllowingStateLoss()
        }
    }
}