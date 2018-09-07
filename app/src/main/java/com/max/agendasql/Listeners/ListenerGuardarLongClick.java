package com.max.agendasql.Listeners;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.max.agendasql.Interfaz.Activity2;
import com.max.agendasql.Interfaz.Principal;

public class ListenerGuardarLongClick implements View.OnLongClickListener {
    Activity2 context;

    public ListenerGuardarLongClick(Activity2 context) {
        this.context = context;
    }

    @Override
    public boolean onLongClick(View v) {
        Intent regresoLong=new Intent(context, Principal.class);
        Toast.makeText(context,"Regreso a Principal",Toast.LENGTH_SHORT).show();
        context.startActivity(regresoLong);
        return true;
    }
}
