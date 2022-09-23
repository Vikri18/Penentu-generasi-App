package com.vyx.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi komponen
        var edTanggalLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnKlik = findViewById<Button>(R.id.btn_klik)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnKlik.setOnClickListener {
            val input = edTanggalLahir.text.toString()
            val hasil = when (input.toInt()){
                in 1946..1964 -> "Baby boomers"
                in 1965..1980 -> "x"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "z"
                else -> "ndak tau"
            }
            tvHasil.text = "Kamu Generasi $hasil"
        }
    }
}
