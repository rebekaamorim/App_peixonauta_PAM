package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class tela_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        TextView resultado_usuario = findViewById(R.id.resultado_usuario);
        TextView resultado_senha = findViewById(R.id.resultado_senha);

            Intent intent = getIntent();
            if (intent != null) {
                String username = intent.getStringExtra("username");
                if (username != null) {
                    resultado_usuario.setText(username);
                }
            }

            if (intent != null) {
                String password = intent.getStringExtra("password");
                if (password != null) {
                    resultado_senha.setText(password);
                }
            }
        }
    }
}