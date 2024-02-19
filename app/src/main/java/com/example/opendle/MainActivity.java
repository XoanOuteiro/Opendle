package com.example.opendle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnJugar;
    private Button btnEstadisticas;
    private Button btnAcerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.fetchElements();
        this.setListeners();
    }

    private void fetchElements() {
        this.btnJugar = findViewById(R.id.btnJugar);
        this.btnEstadisticas = findViewById(R.id.btnEstadisticas);
        this.btnAcerca = findViewById(R.id.btnAcerca);
    }

    private void setListeners() {

        this.btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Activity_Juego.class);
                startActivity(i);

            }
        });

        this.btnEstadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        this.btnAcerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), Activity_AcercaDe.class);
                startActivity(i);

            }
        });

    }

}