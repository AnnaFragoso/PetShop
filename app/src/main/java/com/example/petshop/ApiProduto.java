package com.example.petshop;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiProduto {

    @GET("/produto/{nomeProduto}")
    Call<Produto> getNomeProduto(@Path("nomeProduto") String nomeProduto);

    @GET("/produto/{idCategoria}")
    Call<Produto> getIdCategoria(@Path("idCategoria") int idCategoria);
}
