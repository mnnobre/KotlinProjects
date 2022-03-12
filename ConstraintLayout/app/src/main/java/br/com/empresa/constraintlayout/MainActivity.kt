package br.com.empresa.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txt = findViewById<EditText>(R.id.et_id)
        val et = findViewById<TextView>(R.id.txt_id)
        val et2 = findViewById<TextView>(R.id.et_2)
        val buton = findViewById<Button>(R.id.btn_submit_id)

        buton.setOnClickListener {
            txt.setText(et2.text);
        }
    }
}