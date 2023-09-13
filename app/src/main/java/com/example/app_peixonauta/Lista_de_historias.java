package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Lista_de_historias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

        btnavancar = (ImageButton) findViewById(R.id.historia1);
        sair = (ImageButton) findViewById(R.id.sair);
        consumo = (Button) findViewById(R.id.consumo);
        button_perfil = (ImageButton) findViewById(R.id.button_perfil);

        button_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lista_de_historias.this, tela_perfil.class);

                startActivity(in);
            }

        });
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lista_de_historias.this, MainActivity.class);

                startActivity(in);
            }

        });
        btnavancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lista_de_historias.this, tela3_historia.class);

                startActivity(in);

                Toast.makeText(Lista_de_historias.this, "Role as imagens e aperte para sair som!", Toast.LENGTH_SHORT).show();
            }

        });


        consumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lista_de_historias.this, calculadora.class);

                startActivity(in);
            }

        });
    }
    ImageButton button_perfil;
    Button consumo;
    ImageButton sair;
    ImageButton btnavancar;
    }
