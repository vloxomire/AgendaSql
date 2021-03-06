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

        ArrayList<Agenda> agendaArrayList= sqliteAgenda.getAgenda();    //consulta de ArrayList
        context.getAdapterAgenda().setAgendaArrayList(agendaArrayList);    //lo vuelve a escribir
        context.getAdapterAgenda().notifyDataSetChanged();      //ejecutar Sql
    }
}
