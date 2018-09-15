package com.max.agendasql.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.max.agendasql.Listeners.ListenerRecycler;
import com.max.agendasql.Listeners.ListenerRegistrar;
import com.max.agendasql.Listeners.ListenerVerRegistro;
import com.max.agendasql.R;

public class Principal extends AppCompatActivity {
private Button botonRegistrarX,botonVerListadoX,botonRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        botonRegistrarX=findViewById(R.id.botonRegistrar);
        botonVerListadoX=findViewById(R.id.botonVerListado);
        botonRecycler=findViewById(R.id.botonRecycler);
        //new(<INVESTIGAR>invoca al constructor de la clase,reserva memoria, y obtiene la direccion de memoria donde esta
        //almacenado el objetoy se habilita para cargar dato) instancia la memoria lo q tengo como esqueleto en la clase)
        ListenerRegistrar listenerRegistrar=new ListenerRegistrar(this);
        ListenerVerRegistro listenerVerRegistro=new ListenerVerRegistro(this);
        ListenerRecycler listenerRecycler=new ListenerRecycler(this);

        botonRegistrarX.setOnClickListener(listenerRegistrar);
        botonVerListadoX.setOnClickListener(listenerVerRegistro);
        botonRecycler.setOnClickListener(listenerRecycler);
    }
}
