package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Lista_de_historias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

avancar = (Button)findViewById(R.id.)

avancar.setOnClickListener(New View.OnClickListener(){

           @override
           public void OnClick (View v)
           Intent in = new Intent (Lista_de_historias.this, Tela_historia.class);

           startActivity (in);
         });
    }

   Button avancar

}
