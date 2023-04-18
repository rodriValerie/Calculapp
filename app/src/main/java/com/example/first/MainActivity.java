package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacion = findViewById(R.id.operacion);
    }

    int num = Integer.parseInt(operacion.getText().toString());

    public void Calcular(View view) {
        if (num == 1) {
            Intent calcular = new Intent(this, ActivitySum.class);
            startActivity(calcular);
        }else
            if (num == 2) {
                Intent calcular = new Intent(this, ActivityRes.class);
                startActivity(calcular);
            }else
                if (num == 3) {
                    Intent calcular = new Intent(this, ActivityMul.class);
                    startActivity(calcular);
                }else
                    if (num == 4) {
                        Intent calcular = new Intent(this, ActivityDiv.class);
                        startActivity(calcular);
                    }
    }
}
