package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // Definindo botãos
    final Button btn= (Button) findViewById(R.id.button_start);
    //Verificar nome do id
    final EditText txt= (EditText) findViewById(R.id.nome);
}