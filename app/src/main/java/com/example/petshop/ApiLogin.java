package com.example.petshop;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiLogin {

    @POST("/android/rest/cliente")
    Call<Login> loginUsuario(@Body Login senha);

}
