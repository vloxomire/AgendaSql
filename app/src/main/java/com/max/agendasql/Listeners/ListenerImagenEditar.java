package com.max.agendasql.Listeners;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.max.agendasql.Adapters.AdapterAgenda;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.Activity2;
import com.max.agendasql.Interfaz.ListaVista;
import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class ListenerImagenEditar implements View.OnClickListener{
    ListaVista context;
    SqliteAgenda sqliteAgenda;
    ListView listView;
    ArrayList<Agenda>agendaArrayList;
   Agenda agenda;

    public ListenerImagenEditar(ListaVista context, ListView listView, ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.listView = listView;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public void onClick(View view) {
        SqliteAgenda sqliteAgenda=new SqliteAgenda(context);
        Integer posicion=listView.getPositionForView(view);


        Agenda agendaEdit=agendaArrayList.get(posicion);

        Intent intentActivity2 = new Intent(context, Activity2.class);

        intentActivity2.putExtra("ID", agendaEdit.getId());

        context.startActivity(intentActivity2);
    }
}
