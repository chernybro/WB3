package com.chernybro.wb3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.chernybro.wb3.calculator.CalculatorFragment
import com.chernybro.wb3.calculator.ConstraintCalculatorFragment
import com.chernybro.wb3.databinding.FragmentChooseBinding
import com.chernybro.wb3.login.ConstraintLoginFragment
import com.chernybro.wb3.login.LoginFragment
import com.chernybro.wb3.player.ConstraintPlayerFragment
import com.chernybro.wb3.player.PlayerFragment
import com.chernybro.wb3.telegram.ConstraintTelegramFragment
import com.chernybro.wb3.telegram.TelegramFragment


class ChooseFragment : Fragment() {

    private var _binding: FragmentChooseBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ChooseFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentChooseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnTelegram.setOnClickListener {
                routeTo(TelegramFragment.newInstance())
            }
            btnTelegramConstraint.setOnClickListener {
                routeTo(ConstraintTelegramFragment.newInstance())
            }

            btnCalculator.setOnClickListener {
                routeTo(CalculatorFragment.newInstance())
            }
            btnCalculatorConstraint.setOnClickListener {
                routeTo(ConstraintCalculatorFragment.newInstance())
            }

            btnLogin.setOnClickListener {
                routeTo(LoginFragment.newInstance())
            }
            btnLoginConstraint.setOnClickListener {
                routeTo(ConstraintLoginFragment.newInstance())
            }

            btnPlayer.setOnClickListener {
                routeTo(PlayerFragment.newInstance())
            }
            btnPlayerConstraint.setOnClickListener {
                routeTo(ConstraintPlayerFragment.newInstance())
            }
        }
    }

    private fun routeTo(fragment: Fragment) {
        ((activity) as BaseRouter).replaceTo(fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}