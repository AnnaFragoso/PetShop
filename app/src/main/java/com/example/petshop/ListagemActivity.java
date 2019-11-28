package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListagemActivity extends AppCompatActivity {

    TextView nomeProduto;
    TextView descProduto;
    TextView precProduto;
    TextView qtdProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        nomeProduto = findViewById(R.id.nomeProduto);
        descProduto = findViewById(R.id.descProduto);
        precProduto = findViewById(R.id.precProduto);
        qtdProduto = findViewById(R.id.qtdProduto);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://oficinacordova.azurewebsites.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiProduto api = retrofit.create(ApiProduto.class);

        Call<Produto> chamada = api.getIdCategoria(1);

        chamada.enqueue(new Callback<Produto>() {
            @Override
            public void onResponse(Call<Produto> call, Response<Produto> response) {
                Produto produto = response.body();
                nomeProduto.setText(produto.getNomeProduto());
                descProduto.setText(produto.getDescProduto());
                precProduto.setText(Float.toString(produto.getPrecProduto()));
                qtdProduto.setText(Integer.toString(produto.getQtdMinEstoque()));
            }

            @Override
            public void onFailure(Call<Produto> call, Throwable t) {
                Toast.makeText
                        (ListagemActivity.this,
                                "deu erro",
                                Toast.LENGTH_LONG).show ();

            }
        });

        /**
         *
         * new Callback<Produto>() {
         *             @Override
         *             public void onResponse(Call<Produto> call, Response<Produto> response) {
         *
         *                 if (response.code() != 200) {
         *                     Toast.makeText
         *                             (ListagemActivity.this,
         *                                     "ERRO " + response.code(),
         *                                     Toast.LENGTH_LONG).show();
         *                 } else {
         *                     Produto retorno = response.body();
         *
         *                 }
         *             }
         */

    }
}