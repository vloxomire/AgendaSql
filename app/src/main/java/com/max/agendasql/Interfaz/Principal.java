package com.max.agendasql.Interfaz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.max.agendasql.Listeners.ListenerFabRegistrar;
import com.max.agendasql.Listeners.ListenerRecycler;
import com.max.agendasql.Listeners.ListenerRegistrar;
import com.max.agendasql.Listeners.ListenerVerRegistro;
import com.max.agendasql.R;

public class Principal extends AppCompatActivity {
private Button botonRegistrarX,botonVerListadoX,botonRecycler;
private FloatingActionButton fabRegistrar;
private Toolbar toolbarPrin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_inicio);

        toolbarPrin=findViewById(R.id.toolBarId);
        botonRegistrarX=findViewById(R.id.botonRegistrar);
        botonVerListadoX=findViewById(R.id.botonVerListado);
        botonRecycler=findViewById(R.id.botonRecycler);
        fabRegistrar=findViewById(R.id.fab);
        //Bloque Toolbar
        setSupportActionBar(toolbarPrin);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher_background);
        getSupportActionBar().setTitle("Ejemplo");

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //acciones android puras
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        //acciones del menu definido por el desarrollador<Sina android.R.
        switch (item.getItemId()){
            case R.id.agregarCliente:
                Toast.makeText(this,"Agregar cliente",Toast.LENGTH_SHORT).show();
                break;
            case R.id.salirId:
                super.finish();
                break;
             default:
                 break;
        }
        return true;
    }
}
