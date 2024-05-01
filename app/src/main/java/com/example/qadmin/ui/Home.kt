package com.example.qadmin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.qadmin.R
import com.example.qadmin.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.icHome -> replaceFragment(HomeFragment())
                R.id.icOrder -> replaceFragment(OrdersFragment())
                R.id.icProduct -> replaceFragment(ProductsFragment())
                R.id.icSales -> replaceFragment(SalesFragment())
                R.id.icUsers -> replaceFragment(UsersFragment())
                R.id.icSettings -> replaceFragment(SettingsFragment())

                else -> {
                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}