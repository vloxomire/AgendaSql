package com.max.agendasql.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.max.agendasql.Listeners.ListenerRegistrar;
import com.max.agendasql.Listeners.ListenerVerRegistro;
import com.max.agendasql.R;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4,et5,et6,et7,et8;
    private Button botonRegistrar, botonVerRegistro;

    public EditText getEt1() {
        return et1;
    }

    public EditText getEt2() {
        return et2;
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

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);
        et7=findViewById(R.id.et7);
        et8=findViewById(R.id.et8);
        botonRegistrar=findViewById(R.id.botonRegistrar);
        botonVerRegistro=findViewById(R.id.botonVerRegristros);

        ListenerRegistrar listenerRegistrar= new ListenerRegistrar(this);
        ListenerVerRegistro listenerVerRegistro=new ListenerVerRegistro(this);

        botonRegistrar.setOnClickListener(listenerRegistrar);
        botonVerRegistro.setOnClickListener(listenerVerRegistro);


    }

}
