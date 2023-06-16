package com.example.app_peixonauta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener(){
           @Overridd
           public void OnClick(View v){
             Intent tela1 = New Intent(MainActivity.this), MainActivity.class);

           StartActivity (tela2)
            
          }
        });

    }


    }
    // Definindo botãos
    final Button btn= (Button) findViewById(R.id.button_start);
    //Verificar nome do id
    final EditText txt= (EditText) findViewById(R.id.nome);
}