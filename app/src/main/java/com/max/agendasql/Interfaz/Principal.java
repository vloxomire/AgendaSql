package com.max.agendasql.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.max.agendasql.R;

public class Principal extends AppCompatActivity {
private Button botonRegistrarX,botonVerListadoX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        botonRegistrarX=findViewById(R.id.botonRegistrar);
        botonVerListadoX=findViewById(R.id.botonVerListado);
    }
}
