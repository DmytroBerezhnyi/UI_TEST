package com.nure.nure.custom

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.nure.nure.custom.fragment.EmailFragment
import com.nure.nure.custom.fragment.PhoneFragment

class ViewPagerAdapter(fragmentManger : FragmentManager) : FragmentPagerAdapter(fragmentManger) {
    private val PAGE_COUNT = 2
    private val listFragment = arrayOf(PhoneFragment(), EmailFragment())
    private val list = arrayOf("Phone", "Email")


    override fun getItem(position: Int) = listFragment[position]
    override fun getCount() = PAGE_COUNT
    override fun getPageTitle(position: Int) = list[position]
}