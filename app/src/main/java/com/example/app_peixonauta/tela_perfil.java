package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tela_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        TextView resultado_usuario = findViewById(R.id.resultado_usuario);
        TextView resultado_senha = findViewById(R.id.resultado_senha);
        Button button_confirmar = findViewById(R.id.button_confirmar);

        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("username");
            if (username != null) {
                resultado_usuario.setText(username);
            }

            String password = intent.getStringExtra("password");
            if (password != null) {
                resultado_senha.setText(password);
            }
        }
        button_confirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(tela_perfil.this, Lista_de_historias.class);
                startActivity(intent);

                Toast.makeText(tela_perfil.this, "Dados Confirmados com Sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    Button button_confirmar;
    TextView nome_usuario;
    TextView nome_senha;
    TextView nome_bio;

}