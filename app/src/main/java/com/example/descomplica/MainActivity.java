package com.example.descomplica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String NOME = "com.exemple.descomplica.NOME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMensagem = findViewById(R.id.mensagem);
        tvMensagem.setText("Olá, teste");
    }

    public void navegar(View view){
        Intent intent = new Intent(this,SegundaActivity.class);
        String nome = "Leandro";
        intent.putExtra(NOME,nome);
        startActivity(intent);
    }

}