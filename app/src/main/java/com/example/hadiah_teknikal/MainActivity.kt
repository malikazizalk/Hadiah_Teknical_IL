package com.example.hadiah_teknikal

// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hadiah_teknikal.databinding.ActivityMainBinding

// Class utama yang akan menjadi entry point aplikasi
class MainActivity : AppCompatActivity() {

    // Variabel untuk View Binding
    private lateinit var binding: ActivityMainBinding

    // Fungsi yang pertama kali dipanggil saat aktivitas dibuat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inisialisasi View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Data untuk RecyclerView
        val cardList = listOf(
            "Card 1" to "Description 1",
            "Card 2" to "Description 2",
            "Card 3" to "Description 3",
            "Card 4" to "Description 4",
            "Card 5" to "Description 5",
            "Card 6" to "Description 6",
            "Card 7" to "Description 7",
            "Card 8" to "Description 8",
            "Card 9" to "Description 9",
            "Card 10" to "Description 10"
        )

        // Inisialisasi dan set adapter untuk RecyclerView
        val cardAdapter = CardAdapter(cardList)
        binding.cardRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.cardRecyclerView.adapter = cardAdapter
    }
}
