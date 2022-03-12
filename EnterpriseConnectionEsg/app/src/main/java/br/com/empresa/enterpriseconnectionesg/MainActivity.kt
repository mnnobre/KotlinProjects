package br.com.empresa.enterpriseconnectionesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val register = findViewById<TextView>(R.id.txv_register)
        register.setOnClickListener {
            val i = Intent (this, register_screen::class.java)
            startActivity(i)
        }

        val login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener {
            val i = Intent (this, home_screen::class.java)
            startActivity(i)
        }


    }




}