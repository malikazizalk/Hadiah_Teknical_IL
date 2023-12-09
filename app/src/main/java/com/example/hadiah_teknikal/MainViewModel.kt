package com.example.hadiah_teknikal

// MainViewModel.kt
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // MutableLiveData untuk menyimpan dan mengamati data yang dapat berubah
    val textData = MutableLiveData<String>()

    init {
        // Menginisialisasi nilai awal
        textData.value = "Hello, ViewModel!"
    }

    // Fungsi untuk mengupdate nilai textData
    fun updateText() {
        textData.value = "Text Updated!"
    }
}
