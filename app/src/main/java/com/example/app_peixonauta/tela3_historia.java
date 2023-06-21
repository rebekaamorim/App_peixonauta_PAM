package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


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
                Intent intent = new Intent (tela3_historia.this, tela_curiosidades.class);

                startActivity (intent);
            }

        });

        btnvoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent in = new Intent (tela3_historia.this, Lista_de_historias.class);

                startActivity (in);
            }

        });
        //botões de áudio
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cena1);

        his1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.start();
                }

            }
        });

        MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.cena2);

        his2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                } else {
                    mediaPlayer1.start();
                }
            }
        });

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.cena3);

        his3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.pause();
                } else {
                    mediaPlayer2.start();
                }
            }
        });

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.cena4);

        his4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                } else {
                    mediaPlayer3.start();
                }
            }
        });

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.cena5);

        his5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                } else {
                    mediaPlayer4.start();
                }
            }
        });

    }
  ImageButton btnproximo;
  ImageButton btnvoltar;
  ImageButton his1;
  ImageButton his2;
  ImageButton his3;
  ImageButton his4;
  ImageButton his5;
}