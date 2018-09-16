package com.max.agendasql.Listeners;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.Recycler;
import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class ListenerCheckNombre implements View.OnClickListener{
    private SqliteAgenda sqliteAgenda;
    private Recycler context;
    private RecyclerView recyclerView;
    private ArrayList<Agenda> agendaArrayList;
    private Agenda agenda;
    private ListView listView;

    public ListenerCheckNombre(Recycler context,ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.listView = listView;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context,"Ordenar por Nombre",Toast.LENGTH_SHORT).show();

        SqliteAgenda sqliteAgenda=new SqliteAgenda(context);
        Integer posicion=listView.getPositionForView(v);
        sqliteAgenda.ordenarAgendaNombreSql(agendaArrayList.get(posicion));

        ArrayList<Agenda> agendaArrayList=sqliteAgenda.getAgenda(); //consulta de ArrayList
        context.getAdapterRecycler().setAgendaArrayList(agendaArrayList);   //lo vuelve a escribir
        context.getAdapterRecycler().notifyDataSetChanged();    //ejecutar Sql


    }
}
