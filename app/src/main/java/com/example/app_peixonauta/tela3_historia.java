package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class tela3_historia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_historia);

        btnproximo = (ImageButton)findViewById(R.id.btn_avancar);
        btnvoltar = (ImageButton)findViewById(R.id.btn_voltar);
        his1 = (ImageButton) findViewById(R.id.parte1);
        his2 = (ImageButton) findViewById(R.id.parte2);
        his3 = (ImageButton) findViewById(R.id.parte3);
        his4 = (ImageButton) findViewById(R.id.parte4);
        his5 = (ImageButton) findViewById(R.id.parte5);

        btnproximo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (tela3_historia.this, tela_curiosidades.class);

                startActivity (in);
            }

        });

        btnvoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (tela3_historia.this, Lista_de_historias.class);

                startActivity (in);
            }

        });

        //continuar ajeitando os botãos de história


    }
  ImageButton btnproximo;
  ImageButton btnvoltar;
  ImageButton his1;
  ImageButton his2;
  ImageButton his3;
  ImageButton his4;
  ImageButton his5;
}