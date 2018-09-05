package com.max.agendasql.Listeners;
import android.view.View;
import android.widget.ListView;

import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.ListaVista;
import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class ListenerImageBorrar implements View.OnClickListener{
    private SqliteAgenda sqliteAgenda;
    private ListaVista context;
    private ListView listView;
    private ArrayList<Agenda> agendaArrayList;

    public ListenerImageBorrar(ListaVista context, ListView listView, ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.listView = listView;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public void onClick(View view) {
        SqliteAgenda sqliteAgenda= new SqliteAgenda(context);
        Integer posicion=listView.getPositionForView(view);
        sqliteAgenda.BorrarAgendaSql(agendaArrayList.get(posicion));
        //redirigir a pantalla listview.Prueba
        //Intent intent =new Intent(context,ListaVista.class);//crear
        //context.startActivity(intent);//iniciar
    }
}
