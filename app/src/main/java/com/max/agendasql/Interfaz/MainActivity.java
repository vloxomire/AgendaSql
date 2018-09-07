package com.max.agendasql.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.max.agendasql.Listeners.ListenerGuardar;
import com.max.agendasql.Listeners.ListenerVerRegistro;
import com.max.agendasql.R;

public class MainActivity extends AppCompatActivity {
    private EditText editNombre, editApellido,et3,et4,et5,et6,et7,et8;
    private Button botonRegistrar;

    public EditText getEditNombre() {
        return editNombre;
    }

    public EditText getEditApellido() {
        return editApellido;
    }

    public EditText getEt3() {
        return et3;
    }

    public EditText getEt4() {
        return et4;
    }

    public EditText getEt5() {
        return et5;
    }

    public EditText getEt6() {
        return et6;
    }

    public EditText getEt7() {
        return et7;
    }

    public EditText getEt8() {
        return et8;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre =findViewById(R.id.et1);
        editApellido =findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);
        et7=findViewById(R.id.et7);
        et8=findViewById(R.id.et8);
        botonRegistrar=findViewById(R.id.botonRegistrar);

        ListenerGuardar listenerGuardar = new ListenerGuardar(this);
        //ListenerVerRegistro listenerVerRegistro=new ListenerVerRegistro(this);

        botonRegistrar.setOnClickListener(listenerGuardar);
        //botonVerRegistro.setOnClickListener(listenerVerRegistro);

        Bundle bolsaMain= new Bundle(); //creo el objeto
        bolsaMain=getIntent().getExtras();
        //Integer valorBolsaMain=bolsaMain.getInt("Indice");

        //if(valorBolsaMain!=0){

       // } else if(valorBolsaMain==0){

       //}


    }

}
