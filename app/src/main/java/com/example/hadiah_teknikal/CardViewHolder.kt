package com.example.hadiah_teknikal

// CardViewHolder.kt
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hadiah_teknikal.databinding.CardItemBinding

// Class untuk menahan tampilan card item di RecyclerView
class CardViewHolder(private val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root) {

    // Fungsi untuk mengikat data ke tampilan
    fun bind(title: String, description: String) {
        binding.cardTitle.text = title
        binding.cardDescription.text = description
    }
}
