package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_com_estrelas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_com_estrelas);

            btnvoltar= (Button) findViewById(R.id.button_voltar);

        btnvoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (Tela_com_estrelas.this, Lista_de_historias.class);

                startActivity (in);
            }

        });
    }

    Button btnvoltar;
}