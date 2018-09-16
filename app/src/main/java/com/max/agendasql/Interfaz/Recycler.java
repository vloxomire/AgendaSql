package com.max.agendasql.Interfaz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.max.agendasql.Adapters.AdapterRecycler;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Models.Agenda;
import com.max.agendasql.R;

import java.util.ArrayList;

public class Recycler extends AppCompatActivity{
    private SqliteAgenda sqliteAgenda;
    private ArrayList<Agenda>agendaArrayList;
    private AdapterRecycler adapterRecycler;
    private RecyclerView recyclerView;
    private CardView cardView;

    public ArrayList<Agenda> getAgendaArrayList() {
        return agendaArrayList;
    }

    public AdapterRecycler getAdapterRecycler() {
        return adapterRecycler;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        recyclerView=findViewById(R.id.recyclerXml);
        SqliteAgenda sqliteAgenda=new SqliteAgenda(this);
        agendaArrayList=sqliteAgenda.getAgenda();
        adapterRecycler=new AdapterRecycler(this,agendaArrayList);
        recyclerView.setAdapter(adapterRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setHasFixedSize(true);


    }}
