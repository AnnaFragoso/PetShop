package com.example.petshop;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiProduto {

    @GET("/android/rest/produto/{nomeProduto}")
    Call<Produto> getNomeProduto(@Path("nomeProduto") String nomeProduto);

    @GET("/android/rest/produto/categoria/{idCategoria}")
    Call<Produto> getIdCategoria(@Path("idCategoria") int idCategoria);
}
