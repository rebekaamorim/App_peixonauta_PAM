package com.example.app_peixonauta;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        sair2 = (ImageButton)findViewById(R.id.idsair2);
        minutos = (EditText)findViewById(R.id.entrada1);
        dias = (EditText)findViewById(R.id.entrada2);
        result = (TextView)findViewById(R.id.resultado);
        cal = (Button)findViewById(R.id.btncacular);
        opcao = (ToggleButton) findViewById(R.id.opcaos);

        sair2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(calculadora.this, Lista_de_historias.class);

                startActivity(in);
            }

        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                min = Double.parseDouble(minutos.getText().toString());
                periodo = Double.parseDouble(dias.getText().toString());

                if (opcao.isChecked()){
                    calcular_chuveiro();
                } else {
                    calcular_torneira();
                }

            }
        });


    }

    public void calcular_chuveiro() {
        double consumo = min * 15;
        double consumototal = consumo * periodo;

        result.setText (String.format(String.valueOf(consumototal)));

    }
    public void calcular_torneira(){
        double consumo = min * 16;
        double consumototal =  periodo * consumo;
        result.setText (String.format(String.valueOf(consumototal)));
    }


    ImageButton sair2;
    EditText minutos;
    EditText dias;
    TextView result;
    Button cal;
    Double periodo;
    Double min;
    ToggleButton opcao;
}