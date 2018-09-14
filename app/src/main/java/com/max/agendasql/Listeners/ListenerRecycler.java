package com.max.agendasql.Listeners;

public class ListenerRecycler implements View.OnClickListener{
  Principal context;
  
  Public ListenerRecycler(Principal context){
    this.context=context;
  }
 @Override
  public void onClick(View vRecycler){
    Intent intentRecycler= new Intent(context,Recyler.class);
    context.startActivity(intentRecycler);
  }
}
