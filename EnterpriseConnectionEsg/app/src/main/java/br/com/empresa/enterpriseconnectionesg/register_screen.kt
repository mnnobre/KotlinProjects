package br.com.empresa.enterpriseconnectionesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class register_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)
        supportActionBar?.hide()


    val login = findViewById<TextView>(R.id.txv_login)

    login.setOnClickListener {
        val x = Intent (this, MainActivity::class.java)
        startActivity(x)
    }
    }
}