package com.example.viewpagerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        val b_open:Button=findViewById(R.id.b_open)
        b_open.setOnClickListener{
            openViewPagerActivity()
        }
    }
    fun openViewPagerActivity(){
        var intent=Intent(this,ViewPagerActivity::class.java)
        startActivity(intent)
    }
}