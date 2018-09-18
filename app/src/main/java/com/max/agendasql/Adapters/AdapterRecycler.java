package com.max.agendasql.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.max.agendasql.Listeners.ListenerRecycler;
import com.max.agendasql.Models.Agenda;
import com.max.agendasql.R;
import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter{
    private Context context;
    private ArrayList<Agenda> agendaArrayList;
    private ListenerRecycler listenerRecycler;

    public AdapterRecycler(Context context,ArrayList<Agenda> agendaArrayList)
    {
        this.context = context;
        this.agendaArrayList = agendaArrayList; //Recibe la lista
        this.listenerRecycler = listenerRecycler;

    }

    public void setAgendaArrayList(ArrayList<Agenda> agendaArrayList) {
        this.agendaArrayList = agendaArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,null,false);
        view.setOnClickListener(listenerRecycler);
        return new AgendaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        Agenda unAgenda =  agendaArrayList.get(position);
        AgendaViewHolder agendaViewHolder = (AgendaViewHolder)holder;
        agendaViewHolder.cargarAgenda(unAgenda);
    }

    @Override
    public int getItemCount()
    {
        return agendaArrayList.size();
    }


    private class AgendaViewHolder extends RecyclerView.ViewHolder
    {
        private TextView nombre,apellido,telefono,dni,calle,altura,pisoDto,email;

        public AgendaViewHolder(@NonNull View itemView)
        {
            super(itemView);
            nombre = itemView.findViewById(R.id.cardNombre);
            apellido = itemView.findViewById(R.id.cardApellido);
            telefono = itemView.findViewById(R.id.cardTelefono);
            dni = itemView.findViewById(R.id.cardDni);
            calle = itemView.findViewById(R.id.cardCalle);
            altura = itemView.findViewById(R.id.cardAltura);
            pisoDto = itemView.findViewById(R.id.cardPidoDto);
            email = itemView.findViewById(R.id.cardEmail);
        }

        public void cargarAgenda (Agenda unaAgenda)
        {
            nombre.setText(unaAgenda.getNombre());
            apellido.setText(unaAgenda.getApellido());
            telefono.setText(unaAgenda.getTelefono().toString());
            dni.setText(unaAgenda.getDni().toString());
            calle.setText(unaAgenda.getCalle());
            altura.setText(unaAgenda.getAltura().toString());
            pisoDto.setText(unaAgenda.getPisoDto().toString());
            email.setText(unaAgenda.getEmail());
        }
    }
}
