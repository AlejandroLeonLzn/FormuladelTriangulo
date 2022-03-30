package com.example.formuladeltriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainResultado extends AppCompatActivity {
    private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultado);


        tvresultado = (TextView) findViewById(R.id.tvresultado);
        String base = getIntent().getStringExtra("base");
        String altura = getIntent().getStringExtra("altura");
        int b=Integer.parseInt(base);
        float bas = Float.parseFloat(base);
        float alt = Float.parseFloat(altura);
        int a=Integer.parseInt(altura);
        int c=(b*a)/2;
        float area=(bas*alt)/2;
        tvresultado.setText("Area= "+area);
    }

    //Regresar
    public void regresar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}