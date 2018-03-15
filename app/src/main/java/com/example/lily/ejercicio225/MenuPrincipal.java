package com.example.lily.ejercicio225;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
Button btnSalir, btnObras, btnTrabajadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.lily.ejercicio225.R.layout.activity_menu_principal);
        fnStrartingButtons();
        btnTrabajadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goWorkers = new Intent(getApplicationContext(),Workers.class);
                startActivity(goWorkers);
            }
        });

        btnObras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBuildings = new Intent(getApplicationContext(),Buildings.class);
                startActivity(goBuildings);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    void fnStrartingButtons(){
        btnSalir = findViewById(com.example.lily.ejercicio225.R.id.btnSalir);
        btnObras = findViewById(com.example.lily.ejercicio225.R.id.btnObras);
        btnTrabajadores = findViewById(com.example.lily.ejercicio225.R.id.btnTrabajadores);
    }
}
