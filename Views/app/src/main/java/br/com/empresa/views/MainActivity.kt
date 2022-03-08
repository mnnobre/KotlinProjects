package br.com.empresa.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnCliqueAqui = findViewById<Button>(R.id.btn_clique_aqui)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnCliqueAqui.setOnClickListener {
            val nome: String = edtNome.editableText.toString()
            txvResultado.text = nome
        }

    }

    fun onClickAqui(view: MainActivity) {
//        Toast.makeText("this", Toast.LENGTH_SHORT).show("Foi clicado!")
        Toast.makeText(this, "Foi clicado!", Toast.LENGTH_SHORT).show()
    }
}