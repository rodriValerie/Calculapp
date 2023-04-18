package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityRes extends AppCompatActivity {

    private EditText primerNumero;
    private EditText segundoNumero;
    private EditText tvResul;
    private Button restar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);

        primerNumero = findViewById(R.id.primerNumero);
        segundoNumero = findViewById(R.id.segundoNumero);
        tvResul = findViewById(R.id.tvResul);
    }

    public void restar(View view){
        int valor1=Integer.parseInt(primerNumero.getText().toString());
        int valor2=Integer.parseInt(segundoNumero.getText().toString());

        tvResul.setText(String.valueOf(valor1-valor2));
    }

    public void Volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}