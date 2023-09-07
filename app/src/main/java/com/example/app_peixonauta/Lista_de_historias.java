package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Lista_de_historias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

        btnavancar = (ImageButton) findViewById(R.id.historia1);
        sair = (ImageButton) findViewById(R.id.sair);
        consumo = (Button) findViewById(R.id.consumo);


        btnavancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Lista_de_historias.this, tela3_historia.class);

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
    }
    Button consumo;
    ImageButton sair;
    ImageButton btnavancar;
    }
