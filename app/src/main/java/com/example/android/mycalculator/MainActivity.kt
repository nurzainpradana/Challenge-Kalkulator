package com.example.android.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnTambah: Button
    private lateinit var btnTambah: Button
    private lateinit var btnTambah: Button
    private lateinit var btnTambah: Button
    private lateinit var btnTambah: Button
    private lateinit var btnTambah: Button



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
        btnKurang.setOnClickListener { hitungKurang() }
        btnKali.setOnClickListener { hitungKali() }
        btnBagi.setOnClickListener { hitungBagi() }
        btnClear.setOnClickListener { clearKolom() }
    }

    // function ketika button btnTambah di klik
    private fun hitungTambah() {
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // Mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var angkaPertama: Double = 0.0
        var angkaKedua: Double = 0.0

        // Jika editText nya kosong maka akan memberi default nilai 0
        if (!etKolomPertama.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }
        if (!etKolomKedua.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }

        // Membuat variable hasil yang bernilai hasil dari angkaPertama ditambah angkaKedua
        val hasil = angkaPertama + angkaKedua

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        tvHasil.text = hasil.toString()
    }

    // function ketika button btnKurang di klik
    private fun hitungKurang() {
        // Inisialisasi view EditText dan TextView
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // Mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var angkaPertama: Double = 0.0
        var angkaKedua: Double = 0.0

        // Jika editText nya kosong maka akan memberi default nilai 0
        if (!etKolomPertama.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }
        if (!etKolomKedua.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }

        // Membuat variable hasil yang bernilai hasil dari angkaPertama dikurang angkaKedua
        val hasil = angkaPertama - angkaKedua

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        tvHasil.text = hasil.toString()
    }

    // function ketika button btnKali di klik
    private fun hitungKali() {
        // Inisialisasi view EditText dan TextView
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // Mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var angkaPertama: Double = 0.0
        var angkaKedua: Double = 0.0

        // Jika editText nya kosong maka akan memberi default nilai 0
        if (!etKolomPertama.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }
        if (!etKolomKedua.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }

        // Membuat variable hasil yang bernilai hasil dari angkaPertama dikali angkaKedua
        val hasil = angkaPertama * angkaKedua

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        tvHasil.text = hasil.toString()
    }

    // function ketika button btnBagi di klik
    private fun hitungBagi() {
        // Inisialisasi view EditText dan TextView
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // Mengambil hasil inputan dari user kemudian di konversi menjadi tipe data Double
        var angkaPertama: Double = 0.0
        var angkaKedua: Double = 0.0

        // Jika editText nya kosong maka akan memberi default nilai 0
        if (!etKolomPertama.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }
        if (!etKolomKedua.text.isEmpty()){
            angkaPertama = etKolomPertama.text.toString().toDouble()
        }

        // Membuat variable hasil yang bernilai hasil dari angkaPertama dikali angkaKedua
        val hasil = angkaPertama / angkaKedua

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        tvHasil.text = hasil.toString()
    }

    // function ketika button btnBagi di klik
    private fun clearKolom() {
        // Inisialisasi view EditText dan TextView
        val etKolomPertama: EditText = findViewById(R.id.et_kolom_pertama)
        val etKolomKedua: EditText = findViewById(R.id.et_kolom_kedua)
        val tvHasil: TextView = findViewById(R.id.tv_hasil)

        // hasil di konversi ke tipe data String kemudian ditampilkan pada tvHasil
        etKolomPertama.text.clear()
        etKolomKedua.text.clear()
        tvHasil.text = ""
    }
}