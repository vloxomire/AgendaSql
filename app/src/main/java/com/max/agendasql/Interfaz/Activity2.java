package com.max.agendasql.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Listeners.ListenerGuardar;
import com.max.agendasql.Listeners.ListenerGuardarLongClick;
import com.max.agendasql.Models.Agenda;
import com.max.agendasql.R;

public class Activity2 extends AppCompatActivity {
    private EditText editNombre, editApellido, editTelefono, editDni, editEmail, editCalle, editAltura, editPisoDto;
    private Button botonRegistrar;
    private Integer id;
    private SqliteAgenda sqliteAgenda;
    private ListenerGuardarLongClick listenerGuardarLongClick;

    public Integer getId() {
        return id;
    }

    public EditText getEditNombre() {
        return editNombre;
    }

    public EditText getEditApellido() {
        return editApellido;
    }

    public EditText getEditTelefono() {
        return editTelefono;
    }

    public EditText getEditDni() {
        return editDni;
    }

    public EditText getEditEmail() {
        return editEmail;
    }

    public EditText getEditCalle() {
        return editCalle;
    }

    public EditText getEditAltura() {
        return editAltura;
    }

    public EditText getEditPisoDto() {
        return editPisoDto;
    }

    public Button getBotonRegistrar() {
        return botonRegistrar;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        Bundle bundleEnviados = getIntent().getExtras();

        id = bundleEnviados.getInt("ID");

        editNombre =findViewById(R.id.et1);
        editApellido =findViewById(R.id.et2);
        editTelefono =findViewById(R.id.et3);
        editDni =findViewById(R.id.et4);
        editEmail =findViewById(R.id.et5);
        editCalle =findViewById(R.id.et6);
        editAltura =findViewById(R.id.et7);
        editPisoDto =findViewById(R.id.et8);
        botonRegistrar=findViewById(R.id.botonRegistrar);

        ListenerGuardar listenerGuardar = new ListenerGuardar(this);
        //ListenerGuardarLongClick listenerGuardarLongClick=new ListenerGuardarLongClick(this);

        botonRegistrar.setOnClickListener(listenerGuardar);
        botonRegistrar.setOnLongClickListener(listenerGuardarLongClick);

        if(!id.equals(0)) {
            sqliteAgenda = new SqliteAgenda(this);
            Agenda agenda = sqliteAgenda.getAgendaPorID(id);

            editNombre.setText(agenda.getNombre());
            editApellido.setText(agenda.getApellido());
            editTelefono.setText(String.valueOf(agenda.getTelefono()));
            editDni.setText(String.valueOf(agenda.getDni()));
            editEmail.setText(agenda.getEmail());
            editCalle.setText(agenda.getCalle());
            editAltura.setText(String.valueOf(agenda.getAltura()));
            editPisoDto.setText(String.valueOf(agenda.getPisoDto()));
        }


    }

}
