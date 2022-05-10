package com.chernybro.wb3.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chernybro.wb3.BaseRouter
import com.chernybro.wb3.R
import com.chernybro.wb3.calculator.CalculatorFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ConstraintLoginFragment : Fragment() {

    companion object {
        fun newInstance() = ConstraintLoginFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_login_constraint, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}