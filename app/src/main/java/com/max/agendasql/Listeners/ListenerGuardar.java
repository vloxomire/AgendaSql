package com.max.agendasql.Listeners;

import android.view.View;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.Activity2;
import com.max.agendasql.Models.Agenda;

public class ListenerGuardar implements View.OnClickListener{
    Activity2 context;
    SqliteAgenda sqliteAgenda;

    public ListenerGuardar(Activity2 context) {
        this.context = context;
    }

    @Override
    public void onClick(View vRegistrar) {
    SqliteAgenda sqliteAgenda= new SqliteAgenda(context);
    String nombre= context.getEditNombre().getText().toString();
    String apellido=context.getEditApellido().getText().toString();
    Integer telefono=Integer.parseInt(context.getEt3().getText().toString());
    Integer dni=Integer.parseInt(context.getEt4().getText().toString());
    String email=context.getEt5().getText().toString();
    String calle=context.getEt6().getText().toString();
    Integer altura=Integer.parseInt(context.getEt7().getText().toString());
    Integer pisoDto=Integer.parseInt(context.getEt8().getText().toString());
    Agenda agenda= new Agenda(null,nombre,apellido,telefono,dni,email,calle,altura,pisoDto);
    sqliteAgenda.GuardarAgendaSql(agenda);
    }
}
