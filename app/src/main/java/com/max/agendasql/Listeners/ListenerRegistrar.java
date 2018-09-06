package com.max.agendasql.Listeners;

import android.view.View;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.MainActivity;
import com.max.agendasql.Models.Agenda;

public class ListenerRegistrar implements View.OnClickListener{
    MainActivity context;
    SqliteAgenda sqliteAgenda;

    public ListenerRegistrar(MainActivity context) {
        this.context = context;
    }

    @Override
    public void onClick(View vRegistrar) {
    SqliteAgenda sqliteAgenda= new SqliteAgenda(context);
    String nombre= context.getEt1().getText().toString();
    String apellido=context.getEt2().getText().toString();
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
