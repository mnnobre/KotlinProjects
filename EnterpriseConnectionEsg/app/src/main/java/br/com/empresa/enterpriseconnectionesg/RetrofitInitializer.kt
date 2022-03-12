package br.com.empresa.enterpriseconnectionesg

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class RetrofitInitializer {

    val retrofitJSON = Retrofit.Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun apiRetrofitServiceJSON(): RetrofitServices {
        return retrofitJSON.create(RetrofitServices::class.java)
    }

    val retrofitXML = Retrofit.Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()

    fun apiRetrofitServiceXML(): RetrofitServices {
        return retrofitXML.create(RetrofitServices::class.java)
    }
}