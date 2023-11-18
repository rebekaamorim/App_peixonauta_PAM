package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.media.MediaPlayer;


public class Lista_de_historias extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor sensor;
    private MediaPlayer mediaPlayer; // conseguir usar audio
    private boolean isPlaying = false; // varivel para não reproducir o audio a principio

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE); // Acessar os sensores
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // Acessar o sensor de acelerômetro

        mediaPlayer = MediaPlayer.create(Lista_de_historias.this, R.raw.tema);
        mediaPlayer.setLooping(true); // vai ficar reproduzindo até balançar o dispositivo de novo


        btnavancar = (ImageButton) findViewById(R.id.historia1);
        sair = (ImageButton) findViewById(R.id.sair);
        consumo = (Button) findViewById(R.id.consumo);



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

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];

        if (x > 18) { // valor que vai fazer o audio começar, quando o celular balançar
            if (isPlaying) {
                mediaPlayer.pause();
                isPlaying = false;
            } else {
                mediaPlayer.start();
                isPlaying = true;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onResume() {
        super.onResume();// retorna o audio de onde parou
        sensorManager.registerListener(Lista_de_historias.this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(Lista_de_historias.this);
        mediaPlayer.pause(); // Pausa a música
        isPlaying = false;
    }
// a ação do audio vai ser destruida caso o usuario entre em outra tela, por isso não colocamos um método pra isso.
    Button consumo;
    ImageButton sair;
    ImageButton btnavancar;
    }
