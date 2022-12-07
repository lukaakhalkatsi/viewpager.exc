package com.example.viewpager2exc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pager = findViewById<ViewPager2>(R.id.viewPager)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val adapter = ViewAdapter(supportFragmentManager, lifecycle)

        pager.adapter = adapter

        TabLayoutMediator(tabLayout, pager){tab, position->
            when(position){
                0->{
                    tab.text = "Mustang"
                    tab.setIcon(R.drawable.mustang)
                }
                1->{
                    tab.text = "Charger"
                    tab.setIcon(R.drawable.charger)
                }
                2->{
                    tab.text = "Camaro"
                    tab.setIcon(R.drawable.camaro)
                }
            }
        }.attach()

    }
}