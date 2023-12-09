package com.example.hadiah_teknikal

// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.hadiah_teknikal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set listener untuk Bottom Navigation
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.tab1 -> setFragment(Tab1Fragment())
                R.id.tab2 -> setFragment(Tab2Fragment())
                R.id.tab3 -> setFragment(Tab3Fragment())
            }
            true
        }

        // Default fragment saat aplikasi pertama kali dibuka
        setFragment(Tab1Fragment())
    }

    // Fungsi untuk mengganti fragment di dalam container
    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
