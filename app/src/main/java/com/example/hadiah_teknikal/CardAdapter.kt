package com.example.hadiah_teknikal

// CardAdapter.kt
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hadiah_teknikal.databinding.CardItemBinding

// Class adapter yang mengatur data dan tampilan
class CardAdapter(private val cardList: List<Pair<String, String>>) : RecyclerView.Adapter<CardViewHolder>() {

    // Fungsi untuk membuat ViewHolder baru ketika dibutuhkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        // Inflate layout untuk setiap card item
        val binding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    // Fungsi untuk mengikat data ke ViewHolder
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        // Ambil data pada posisi tertentu
        val (title, description) = cardList[position]
        // Panggil fungsi bind pada ViewHolder untuk mengisi data ke tampilan
        holder.bind(title, description)
    }

    // Fungsi untuk mengembalikan jumlah total item dalam dataset
    override fun getItemCount(): Int {
        return cardList.size
    }
}
