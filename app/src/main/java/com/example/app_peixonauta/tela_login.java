package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tela_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        usuario = findViewById(R.id.usuario);
        senha = findViewById(R.id.senha);
        button_entrar = findViewById(R.id.button_entrar);

        button_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usuario.getText().toString();
                String password = senha.getText().toString();

                Intent intent = new Intent(tela_login.this, tela_perfil.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }
    EditText usuario;
    EditText senha;
    Button button_entrar;

}