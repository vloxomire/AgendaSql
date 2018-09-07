package com.max.agendasql.Listeners;

import android.view.View;
import android.widget.ListView;

import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.ListaVista;
import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class ListenerImagenEditar implements View.OnClickListener{
    ListaVista context;
    SqliteAgenda sqliteAgenda;
    ListView listView;
    ArrayList<Agenda>agendaArrayList;

    public ListenerImagenEditar(ListaVista context, ListView listView, ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.listView = listView;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public void onClick(View view) {

    }
}
