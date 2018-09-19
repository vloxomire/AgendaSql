package com.max.agendasql.Listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.max.agendasql.Interfaz.Activity2;
import com.max.agendasql.Interfaz.Principal;

public class ListenerFabRegistrar implements View.OnClickListener {
    private Principal contextFabReg;

    public ListenerFabRegistrar(Principal contextFabReg) {
        this.contextFabReg = contextFabReg;
    }

    @Override
    public void onClick(View vFabRgt) {
        Toast.makeText(contextFabReg, "Fab,BotonFlotante>Registrar", Toast.LENGTH_SHORT).show();
        Intent intentfabRgt=new Intent(contextFabReg, Activity2.class);
        intentfabRgt.putExtra("ID",0);
        contextFabReg.startActivity(intentfabRgt);
    }
}
