package com.max.agendasql.Listeners;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.Recycler;
import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class ListenerCheckDni implements View.OnClickListener{
    private SqliteAgenda sqliteAgenda;
    private Recycler context;
    private RecyclerView recyclerView;
    private ArrayList<Agenda> agendaArrayList;
    private Agenda agenda;

    public ListenerCheckDni(Recycler context, RecyclerView recyclerView, ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.recyclerView = recyclerView;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context,"Ordenar por Dni",Toast.LENGTH_SHORT).show();

        SqliteAgenda sqliteAgenda=new SqliteAgenda(context);
        sqliteAgenda.ordenarPorDniSql(agenda);

        ArrayList<Agenda> agendaArrayList=sqliteAgenda.getAgenda(); //consulta de ArrayList
        context.getAdapterRecycler().setAgendaArrayList(agendaArrayList);   //lo vuelve a escribir
        context.getAdapterRecycler().notifyDataSetChanged();    //ejecutar Sql

    }
}
