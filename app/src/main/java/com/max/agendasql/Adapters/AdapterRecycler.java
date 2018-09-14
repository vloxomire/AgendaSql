package com.max.agendasql.Adapters;

public class AdapterRecycler extends RecyclerView.Adapter{
  private Context context;
  private Arraylist<Agenda>agendaArraylist;
  private ListenerRecycler listenerRecycler;
  
  public AdapterRecyler(Context context,Arraylist<Agenda> agendaArraylist){
    this.context=context;
    this.agendaArraylist=agendaArraylist;
  }
  @NoNull
  @Override
  publicRecyclerView.ViewHolder onCreateViewHolder(@NoNull ViewGroup vGRecycler,int posicion){
    LayoutInflater inflaterRecycler=LayoutInflater.from(context);
    View viewRecycler=inflaterRecycler.inflate(R.layout.celdas,parent,false);
    viewRecycler.setOnClickListener(listenerRecycler);
    
    AgendaViewHolder agendaViewHolder=new AgendaViewHolder(viewRecycler);
    
    return agendaViewHolder;
  }
}
