package br.com.empresa.enterpriseconnectionesg

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitServices {

    @GET("{CEP}/json/")
    fun getEnderecoByJSON(@Path("CEP") CEP : String) : Call<CEP>


}
