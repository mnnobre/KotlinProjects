package br.com.empresa.enterpriseconnectionesg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class home_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        supportActionBar?.hide()


    }
}