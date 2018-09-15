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
  private ArrayList<Agenda>agendaArraylist;
  private ListenerRecycler listenerRecycler;

    public AdapterRecycler(Context context, ArrayList<Agenda> agendaArraylist) {
        this.context = context;
        this.agendaArraylist = agendaArraylist;
        this.listenerRecycler= listenerRecycler;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup vGRecycler, int posicionRecycler) {
        LayoutInflater inflaterRecycler=LayoutInflater.from(context);
        View vRecycler=inflaterRecycler.inflate(R.layout.recyclerview,vGRecycler,false);
        vRecycler.setOnClickListener(listenerRecycler);

        AgendaViewHolder agendaViewHolder=new AgendaViewHolder(vRecycler);

        return agendaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int posicionRecycler) {
        Agenda agenda=agendaArraylist.get(posicionRecycler);
        AgendaViewHolder agendaViewHolder=(AgendaViewHolder)holder;
        agendaViewHolder.cargarAgenda(agenda);
    }

    @Override
    public int getItemCount() {
        return agendaArraylist.size();
    }
    private class AgendaViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,apellido,telefono,dni,calle,altura,pisoDto,email;

        public AgendaViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tv1);
            apellido = itemView.findViewById(R.id.tv2);
            telefono = itemView.findViewById(R.id.tv3);
            dni = itemView.findViewById(R.id.tv4);
            calle = itemView.findViewById(R.id.tv5);
            altura = itemView.findViewById(R.id.tv6);
            pisoDto = itemView.findViewById(R.id.tv7);
            email = itemView.findViewById(R.id.tv8);
        }
        public void cargarAgenda(Agenda agenda){
            nombre.setText(agenda.getNombre());
            apellido.setText(agenda.getApellido());
            telefono.setText(agenda.getTelefono());
            dni.setText(agenda.getDni());
            calle.setText(agenda.getCalle());
            altura.setText(agenda.getAltura());
            pisoDto.setText(agenda.getPisoDto());
            email.setText(agenda.getEmail());
        }
    }
}
  
