package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class tela3_historia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3_historia);

btnproximo = (ImageButton)findViewById(R.id.btn_avancar)
btnvoltar = (ImageButton)findViewById(R.id.btn_voltar)
his1 = (ImageButton)findViewById(R.id.parte1)
his2 = (ImageButton)findViewById(R.id.parte2)
his3 = (ImageButton)findViewById(R.id.parte3)
his4 = (ImageButton)findViewById(R.id.parte4)
his5 = (ImageButton)findViewById(R.id.parte5)

btnvoltar.setOnClickListener(New View.OnClickListener(){
           @override
           public void OnClick (View v)
           Intent in = new Intent (tela3_historia.this, Lista_com_historias.class);

           startActivity (in);
       });

btnproximo.setOnClickListener(New View.OnClickListener(){

           @override
           public void OnClick (View v)
           Intent in = new Intent (Tela_historia.this, Tela_com_estrelas.class);

           startActivity (in);
});

    }
  ImageButton btnproximo
  ImageButton btnvoltar
  ImageButton his1
  ImageButton his2
  ImageButton his3
  ImageButton his4
  ImageButton his5
}