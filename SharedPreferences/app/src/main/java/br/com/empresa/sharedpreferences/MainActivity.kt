package br.com.empresa.sharedpreferences

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSalvar = findViewById<Button>(R.id.btnSalvar)
        val btnExibir = findViewById<Button>(R.id.btnExibir)
        val txtNome = findViewById<EditText>(R.id.txtNome)
        val listTratamento = findViewById<Spinner>(R.id.list_tratamento)

        btnSalvar.setOnClickListener {
            val saudacaoPersistencia = this.getSharedPreferences("saudacao", Context.MODE_PRIVATE)
            val editor = saudacaoPersistencia.edit()

            editor.putString("nome", txtNome.editableText.toString())
            editor.putString("tratamento", listTratamento.selectedItem.toString())
            editor.apply()

            Toast.makeText(this, "Saudação gravada com sucesso", Toast.LENGTH_SHORT).show()
        }

        btnExibir.setOnClickListener {
            val i = Intent(this, SaudacaoActivity::class.java)
            startActivity(i)
        }
    }
}