package com.example.tridatupedia

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Menemukan NavHostFragment
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment?

        if (navHostFragment != null) {
            // Menginisialisasi NavController dari NavHostFragment
            val navController = navHostFragment.navController

            // Menghubungkan BottomNavigationView dengan NavController
            val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
            bottomNavView.setupWithNavController(navController)
        } else {
            // Log error jika NavHostFragment tidak ditemukan
            Log.e("MenuActivity", "NavHostFragment tidak ditemukan! Pastikan ID di layout benar.")
        }
    }
}
