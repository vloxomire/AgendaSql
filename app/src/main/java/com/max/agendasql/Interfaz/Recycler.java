package com.max.agendasql.Interfaz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.CheckBox;

import com.max.agendasql.Adapters.AdapterAgenda;
import com.max.agendasql.Adapters.AdapterRecycler;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Listeners.ListenerCheckDni;
import com.max.agendasql.Listeners.ListenerCheckNombre;
import com.max.agendasql.Models.Agenda;
import com.max.agendasql.R;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity{
    private SqliteAgenda sqliteAgenda;
    private ArrayList<Agenda>agendaArrayList;
    private AdapterRecycler adapterRecycler;
    private RecyclerView recyclerView;
    private CheckBox checkBoxNombre,checkBoxDni;


    public AdapterRecycler getAdapterRecycler() {
        return adapterRecycler;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        checkBoxNombre=findViewById(R.id.ChkNombre);
        checkBoxDni=findViewById(R.id.ChkDni);
        recyclerView=findViewById(R.id.recyclerXml);

        ListenerCheckNombre listenerCheckNombre=new ListenerCheckNombre(this,agendaArrayList);
        checkBoxNombre.setOnClickListener(listenerCheckNombre);

        ListenerCheckDni listenerCheckDni=new ListenerCheckDni(this,recyclerView,agendaArrayList);
        checkBoxDni.setOnClickListener(listenerCheckDni);

        SqliteAgenda sqliteAgenda=new SqliteAgenda(this);
        agendaArrayList=sqliteAgenda.getAgenda();
        adapterRecycler=new AdapterRecycler(this,agendaArrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setHasFixedSize(true);


    }}
