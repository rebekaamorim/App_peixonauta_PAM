package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Lista_de_historias extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_historias);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE); // Acessar os sensores
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER); // Acessar o sensor de acelerômetro

        // Atraso de resposta do sensor
        sensorManager.registerListener((SensorEventListener) Lista_de_historias.this, sensor, sensorManager.SENSOR_DELAY_NORMAL);

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

    Button consumo;
    ImageButton sair;
    ImageButton btnavancar;
    }
