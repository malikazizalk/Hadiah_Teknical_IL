package com.example.hadiah_teknikal

// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.hadiah_teknikal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Deklarasi ViewModel
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menggunakan ViewBinding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi ViewModel menggunakan ViewModelProvider
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Mengamati perubahan pada textData dan mengupdate TextView
        viewModel.textData.observe(this, { newText ->
            binding.displayText.text = newText
        })

        // Menangani klik pada tombol
        binding.updateButton.setOnClickListener {
            // Memanggil fungsi updateText() pada ViewModel
            viewModel.updateText()
        }
    }
}
