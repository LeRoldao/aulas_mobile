package com.example.descomplica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView msg_segunda_act = findViewById(R.id.mensagem2);

        Intent intentRecebida = getIntent();
        String nome = intentRecebida.getStringExtra(MainActivity.NOME);
        msg_segunda_act.setText("Olá, " + nome);


    }
}