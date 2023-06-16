package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart= (Button) findViewById(R.id.button_start);
        txt= (EditText) findViewById(R.id.nome);

        btnstart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (MainActivity.this, Lista_de_historias.class);

                startActivity (in);
            }

        });

    }

    // Definindo botãos
    Button btnstart;
    EditText txt;
}