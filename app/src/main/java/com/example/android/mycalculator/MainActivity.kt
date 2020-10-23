package com.example.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialiasi View Button berdasarkan ID pada xml
        val btnTambah: Button = findViewById(R.id.btn_tambah)
        val btnKurang: Button = findViewById(R.id.btn_kurang)
        val btnKali: Button = findViewById(R.id.btn_kali)
        val btnBagi: Button = findViewById(R.id.btn_bagi)
        val btnClear: Button = findViewById(R.id.btn_clear)

        // Menambahkan aksi ketika button di klik
        btnTambah.setOnClickListener { hitungTambah() }
    }

    // function ketia button btnTambah di klik
    private fun hitungTambah() {
        // Inisialisasi view EditText dan TextView
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // Mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        val angkaPertama: Double = etKolomPertama.text.toString().toDouble()
        val angkaKedua: Double = etKolomKedua.text.toString().toDouble()

        // Membuat variable hasil yang bernilai hasil dari angkaPertama ditambah angkaKedua
        val hasil: Double = angkaPertama + angkaKedua

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        tvHasil.text = hasil.toString()
    }
}