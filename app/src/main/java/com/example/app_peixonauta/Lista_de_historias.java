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
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public abstract class Lista_de_historias extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    private Sensor sensor;
    private MediaPlayer mediaPlayer;
    private WakeLock wakeLock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE); // Acessar os sensores
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // Acessar o sensor de acelerômetro

        mediaPlayer = MediaPlayer.create(this, R.raw.your_sound_file);

        sensorManager.registerListener((SensorEventListener) Lista_de_historias.this, sensor, sensorManager.SENSOR_DELAY_NORMAL);

        PowerManager powerManager = (PowerManager) getSystemService(Lista_de_historias.POWER_SERVICE);
        if (powerManager != null) {
            wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MyApp::MyWakelockTag");
        }

        ImageButton btnavancar = (ImageButton) findViewById(R.id.historia1);
        ImageButton sair = (ImageButton) findViewById(R.id.sair);
        Button consumo = (Button) findViewById(R.id.consumo);



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
    protected void onResume() {
        super.onResume();
        if (sensor != null) {
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];

        if (Math.abs(x) > 18 ) {
            playSound();
        }
    }
    private void playSound() {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }
    Button consumo;
    ImageButton sair;
    ImageButton btnavancar;
    }
