package com.chernybro.wb3

import androidx.fragment.app.Fragment

interface BaseRouter {

    fun replaceTo(fragment: Fragment)

    fun add(fragment: Fragment)
}