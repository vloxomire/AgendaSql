package com.max.agendasql.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.max.agendasql.Interfaz.ListaVista;
import com.max.agendasql.Models.Agenda;
import com.max.agendasql.R;

import java.util.ArrayList;

public class AdapterAgenda extends BaseAdapter {
    ListaVista context;
    private ArrayList<Agenda> agendaArrayList;

    public AdapterAgenda(ListaVista context, ArrayList<Agenda> agendaArrayList) {
        this.context = context;
        this.agendaArrayList = agendaArrayList;
    }

    @Override
    public int getCount() {
        return agendaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return agendaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup vGroup) {
        LayoutInflater milayoutInflater;
        milayoutInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        v = milayoutInflater.inflate(R.layout.celdas, vGroup, false);
        TextView nombre, apellido, telefono, dni, calle, altura, pisoDto;

        nombre = v.findViewById(R.id.et1);
        apellido = v.findViewById(R.id.et2);
        telefono = v.findViewById(R.id.et3);
        dni = v.findViewById(R.id.et4);
        calle = v.findViewById(R.id.et5);
        altura = v.findViewById(R.id.et6);
        pisoDto = v.findViewById(R.id.et7);

        nombre.setText(agendaArrayList.get(i).getNombre());
        apellido.setText(agendaArrayList.get(i).getApellido());
        telefono.setText(String.valueOf(agendaArrayList.get(i).getTelefono()));
        dni.setText(String.valueOf(agendaArrayList.get(i).getDni()));
        calle.setText(agendaArrayList.get(i).getCalle());
        altura.setText(String.valueOf(agendaArrayList.get(i).getAltura()));
        pisoDto.setText(String.valueOf(agendaArrayList.get(i).getPisoDto()));

        return v;
    }
}