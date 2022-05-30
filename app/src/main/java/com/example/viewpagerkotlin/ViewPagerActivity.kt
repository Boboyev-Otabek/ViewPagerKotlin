package com.example.viewpagerkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.viewpagerkotlin.Adapter.ViewPagerAdapter
import com.example.viewpagerkotlin.Fragment.PageOneFragment
import com.example.viewpagerkotlin.Fragment.PageTwoFragment
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {
    var viewPagerAdapter: ViewPagerAdapter? = null
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpeger)
        initView()
    }

    fun initView() {
        viewPager = findViewById(R.id.viewpeger)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter!!.Add(PageOneFragment(), "Page 1")
        viewPagerAdapter!!.Add(PageTwoFragment(), "Page 2")
        viewPager.adapter = viewPagerAdapter
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)

    }


}