package com.max.agendasql.Listeners;

import android.content.Intent;
import android.view.View;
import com.max.agendasql.Interfaz.MainActivity;
import com.max.agendasql.Interfaz.Principal;

public class ListenerRegistrar implements View.OnClickListener {
    Principal context;

    public ListenerRegistrar(Principal context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {
        Intent intentRegistrar= new Intent(context, MainActivity.class);
        Integer valor=0;
        intentRegistrar.putExtra("Indice",valor);//Necesito un Bundle antes en el activity q paso
        context.startActivity(intentRegistrar);
    }
}
