package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela_curiosidades extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_curiosidades);

        btnproximo= (Button) findViewById(R.id.btn_proximo);

        btnproximo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (tela_curiosidades.this, Tela_com_estrelas.class);

                startActivity (in);
            }

        });
    }

    Button btnproximo;
}