package com.example.petshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class MainActivity : AppCompatActivity() {

    EditText etUsuario, etSenha;
    Button btnLogin, btnCadastro;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsuario = findViewById(R.id.etUsuario);
        etSenha = findViewById(R.id.etSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnCadastro = findViewById(R.id.btnCadastro);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://oficinacordova.azurewebsites.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

                ApiLogin api = retrofit
                        .create(ApiLogin.class);

                Login login = new Login();
                login.setEmailCliente("m@m.com");
                login.setSenhaCliente("123456");
                Call<Login> chamada = api.loginUsuario(login);

                chamada.enqueue(new Callback<Login>() {
                    @Override
                    public void onResponse(Call<Login> call, Response<Login> response) {

                        if (response.code() != 200) {
                            Toast.makeText
                            (MainActivity.this,
                            "deu erro " + response.code(),
                            Toast.LENGTH_SHORT).show();
                        } else {

                            Toast.makeText
                            (MainActivity.this,
                            "bem vindo " + response.code(),
                            Toast.LENGTH_SHORT).show();

                        }

                    }
                    @Override
                    public void onFailure(Call<Login> call, Throwable t) {
                        Toast.makeText
                        (MainActivity.this,
                        "deu erro",
                        Toast.LENGTH_LONG).show();
                    }
                });


            }
        });
    }
}
