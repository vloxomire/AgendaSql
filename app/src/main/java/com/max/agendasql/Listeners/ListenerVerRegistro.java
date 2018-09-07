package com.max.agendasql.Listeners;
import android.content.Intent;
import android.view.View;

import com.max.agendasql.Interfaz.ListaVista;
import com.max.agendasql.Interfaz.Principal;

public class ListenerVerRegistro implements View.OnClickListener{
  Principal context;

  public ListenerVerRegistro(Principal context) {
    this.context = context;
  }

  @Override
  public void onClick(View v) {
    Intent intent =new Intent(context,ListaVista.class);//crear
    context.startActivity(intent);//iniciar
  }
}
