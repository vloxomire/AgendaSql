package com.max.agendasql.Interfaz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.max.agendasql.Listeners.ListenerFabRegistrar;
import com.max.agendasql.Listeners.ListenerRecycler;
import com.max.agendasql.Listeners.ListenerRegistrar;
import com.max.agendasql.Listeners.ListenerVerRegistro;
import com.max.agendasql.R;

public class Principal extends AppCompatActivity {
private Button botonRegistrarX,botonVerListadoX,botonRecycler;
private FloatingActionButton fabRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Act_Inicio);
        botonRegistrarX=findViewById(R.id.botonRegistrar);
        botonVerListadoX=findViewById(R.id.botonVerListado);
        botonRecycler=findViewById(R.id.botonRecycler);
        fabRegistrar=findViewById(R.id.fab);
        //new(<INVESTIGAR>invoca al constructor de la clase,reserva memoria, y obtiene la direccion de memoria donde esta
        //almacenado el objetoy se habilita para cargar dato) instancia la memoria lo q tengo como esqueleto en la clase)
        ListenerRegistrar listenerRegistrar=new ListenerRegistrar(this);
        ListenerVerRegistro listenerVerRegistro=new ListenerVerRegistro(this);
        ListenerRecycler listenerRecycler=new ListenerRecycler(this);
        ListenerFabRegistrar listenerFabRegistrar=new ListenerFabRegistrar(this);

        botonRegistrarX.setOnClickListener(listenerRegistrar);
        botonVerListadoX.setOnClickListener(listenerVerRegistro);
        botonRecycler.setOnClickListener(listenerRecycler);
        fabRegistrar.setOnClickListener(listenerFabRegistrar);
    }
}
