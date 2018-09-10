package com.max.agendasql.Listeners;

import android.view.View;
import android.widget.Toast;
import com.max.agendasql.Dao.SqliteAgenda;
import com.max.agendasql.Interfaz.Activity2;
import com.max.agendasql.Models.Agenda;

public class ListenerGuardar implements View.OnClickListener{
    Activity2 context;
    SqliteAgenda sqliteAgenda;

    public ListenerGuardar(Activity2 context) {
        this.context = context;
    }

    @Override
    public void onClick(View vRegistrar) {
    SqliteAgenda sqliteAgenda= new SqliteAgenda(context);
    String nombre= context.getEditNombre().getText().toString();
    String apellido=context.getEditApellido().getText().toString();
    Integer telefono=Integer.parseInt(context.getEditTelefono().getText().toString());
    Integer dni=Integer.parseInt(context.getEditDni().getText().toString());
    String email=context.getEditEmail().getText().toString();
    String calle=context.getEditCalle().getText().toString();
    Integer altura=Integer.parseInt(context.getEditAltura().getText().toString());
    Integer pisoDto=Integer.parseInt(context.getEditPisoDto().getText().toString());
        
        //metodo validar,carga.Pasar contexto
        //en la funcion validar (tue or false)levanto los datos otra ves if(){toast...falta dato xxx}
        //el valor de retorno de la funcion lo valido en el siguiente paso
        
        //boolean validacion = funcionValidar(contacto);
        //if(validacion == false) return false; interrumpe el metodo
      Agenda agenda= new Agenda(null,nombre,apellido,telefono,dni,email,calle,altura,pisoDto);
        if(valor==true){
        sqliteAgenda.GuardarAgendaSql(agenda);
        Toast.makeText(context,"Registro guardado",Toast.LENGTH_LONG).show();
        }else
        {
        }
        context.getEditNombre().setText("");
        context.getEditApellido().setText("");
        context.getEditTelefono().setText("");
        context.getEditDni().setText("");
        context.getEditEmail().setText("");
        context.getEditCalle().setText("");
        context.getEditAltura().setText("");
        context.getEditPisoDto().setText("");
    }
}
