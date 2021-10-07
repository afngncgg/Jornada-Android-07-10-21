package com.helpf1.jornada_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val etNome = findViewById<TextView>(R.id.etNome)

        btnEnviar.setOnClickListener {
            tvResultado.text= etNome.text.toString()
        }
    }
}