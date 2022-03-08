package br.com.empresa.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbrirSiteFIap = findViewById<Button>(R.id.btn_abrir_site)
        val btnAbrirProxActivity = findViewById<Button>(R.id.btn_abrir_prox_activity)

        btnAbrirSiteFIap.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fiap.com.br"))
            startActivity(i)
        }

        btnAbrirProxActivity.setOnClickListener {
            val i = Intent(this, ProximaActivity::class.java)
            startActivity(i)
        }
    }
}