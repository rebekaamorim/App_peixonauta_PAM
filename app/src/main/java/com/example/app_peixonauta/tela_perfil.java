package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class tela_perfil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        resultado_usuario = (TextView)findViewById(R.id.resultado_usuario);
        resultado_senha = (TextView)findViewById(R.id.resultado_senha);
        button_confirmar = (Button) findViewById(R.id.button_confirmar);
        sair = (ImageButton) findViewById(R.id.voltar);

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

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(tela_perfil.this, MainActivity.class);

                startActivity(in);
            }

        });
        button_confirmar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent intent = new Intent(tela_perfil.this, Lista_de_historias.class);
                startActivity(intent);

                Toast.makeText(tela_perfil.this, "Dados Confirmados com Sucesso!", Toast.LENGTH_SHORT).show();
                Toast.makeText(tela_perfil.this, "Balance o celular para ouvir a música tema ou para pausa-la!", Toast.LENGTH_LONG).show();
            }
        });
    }

    Button button_confirmar;
    TextView resultado_usuario;
    TextView resultado_senha;
    ImageButton sair;

}