package com.example.formuladeltriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etbase;
    private EditText etaltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etbase = (EditText)findViewById(R.id.etbase);
        etaltura = (EditText)findViewById(R.id.etaltura);

    }
    public void enviar (View view){
        Intent i = new Intent(this,MainResultado.class);
        i.putExtra("base", etbase.getText().toString());
        i.putExtra("altura", etaltura.getText().toString());
        startActivity(i);
    }
}