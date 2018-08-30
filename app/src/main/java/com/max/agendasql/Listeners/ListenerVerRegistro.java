package com.max.agendasql.Listeners;
import android.content.Intent;
import android.view.View;

import com.max.agendasql.Interfaz.ListView;
import com.max.agendasql.Interfaz.MainActivity;

public class ListenerVerRegistro implements View.OnClickListener{
  MainActivity context;
  public ListenerVerRegistro(MainActivity context) {
    this.context = context;
  }
  @Override
  public void onClick(View v) {
    Intent miListView=new Intent(context, ListView.class);
    context.startActivities(miListView);
  }
}
