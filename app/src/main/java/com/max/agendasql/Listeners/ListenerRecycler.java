package com.max.agendasql.Listeners;

import android.content.Intent;
import android.view.View;

import com.max.agendasql.Interfaz.Principal;
import com.max.agendasql.Interfaz.Recycler;

public class ListenerRecycler implements View.OnClickListener{
  private Principal context;

    public ListenerRecycler(Principal context) {
        this.context = context;
    }

    @Override
  public void onClick(View vRecycler){
    Intent intentRecycler;
      intentRecycler = new Intent(context,Recycler.class);
      context.startActivity(intentRecycler);
  }
}
