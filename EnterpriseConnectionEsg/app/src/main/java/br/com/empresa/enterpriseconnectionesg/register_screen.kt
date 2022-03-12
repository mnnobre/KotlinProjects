package br.com.empresa.enterpriseconnectionesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val btncep = findViewById<Button>(R.id.btn_cep)
        val edt_cep = findViewById<EditText>(R.id.edt_cep)
        val edt_street = findViewById<EditText>(R.id.edt_street)
        val edt_district = findViewById<EditText>(R.id.edt_district)
        val edt_city = findViewById<EditText>(R.id.edt_city)
        val edt_uf = findViewById<EditText>(R.id.edt_uf)

        btncep.setOnClickListener {
            val call = RetrofitInitializer().apiRetrofitServiceJSON().getEnderecoByJSON(edt_cep.text.toString())


            call.enqueue(object : Callback<CEP> {


                override fun onResponse(call: Call<CEP>, response: Response<CEP>) {

                    response.let {
                        val CEPs: CEP? = it.body()

                        if (CEPs == null) {
                            Toast.makeText(this@register_screen, "CEP não localizado", Toast.LENGTH_LONG).show()

                        } else {
                            edt_street.setText(CEPs.logradouro)
                            edt_district.setText(CEPs.bairro)
                            edt_city.setText(CEPs.localidade)
                            edt_uf.setText(CEPs.uf)
                        }
                    }
                }


                override fun onFailure(call: Call<CEP>?, t: Throwable?) {
                    t?.message?.let { it1 -> Log.e("Erro", it1) }
                }
            })
        }

    }
}






