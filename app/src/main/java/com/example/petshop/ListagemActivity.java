package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://oficinacordova.azurewebsites.net/android/rest")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiProduto api = retrofit.create(ApiProduto.class);
    }
}
