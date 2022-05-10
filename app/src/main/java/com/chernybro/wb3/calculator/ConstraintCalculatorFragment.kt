package com.chernybro.wb3.calculator

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.chernybro.wb3.R
import timber.log.Timber


class ConstraintCalculatorFragment : DialogFragment() {

    companion object {
        fun newInstance()  = ConstraintCalculatorFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        Timber.d("${this.javaClass.canonicalName} onCreateView")
        return inflater.inflate(R.layout.fragment_calculator_constraint, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.d("${this.javaClass.canonicalName} onViewCreated")

    }

}