package com.max.agendasql.Dao;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.max.agendasql.Models.Agenda;

import java.util.ArrayList;

public class SqliteAgenda extends SQLiteOpenHelper{
    private static final String DBNAME="dbAgenda";
    private static final Integer DBVERSION=1;
    private Context context;
    private SQLiteDatabase conexion;

    public SqliteAgenda(Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String query="CREATE TABLE `AgendaTabla` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,`Nombre` TEXT NOT NULL, `Apellido` TEXT NOT NULL, `Telefono` INTEGER NOT NULL,`Dni` INTEGER NOT NULL UNIQUE, `Calle` TEXT NOT NULL, `Altura` INTEGER NOT NULL,`PisoDto` INTEGER NOT NULL )";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    String query="CREATE TABLE `AgendaTabla` ( `Id` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,`Nombre` TEXT NOT NULL, `Apellido` TEXT NOT NULL, `Telefono` INTEGER NOT NULL,`Dni` INTEGER NOT NULL UNIQUE, `Calle` TEXT NOT NULL, `Altura` INTEGER NOT NULL,`PisoDto` INTEGER NOT NULL )";
        db.execSQL(query);
    }
    private void Conectar(){
        conexion=getWritableDatabase();
    }
    private void Desconectar(){
        conexion.close();
    }
    public void GuardarAgendaSql(Agenda agenda){
    this.Conectar();
    String query="";
    query="insert into historial(Nombre, Apellido, Telefono, Dni, Calle, Altura, PisoDto) values('" +agenda.getAgenda()+"')";
    conexion.execSQL(query);
    this.Desconectar();
    }
    public ArrayList<Agenda> getAgenda(){
      ArrayList<Agenda> agendaArrayList = new ArrayList<>();
      this.Conectar();
      String query="";
      query="Select Nombre, Apellido, Telefono, Dni, Calle, Altura, PisoDto, Id from historial";
      Cursor cursor= conexion.rawQuery(query, null);
      while (cursor.moveToNext()){
          Agenda miAgenda = new Agenda(cursor.getInt(cursor.getColumnIndex("Id")),cursor.getString(cursor.getColumnIndex("Nombre")),cursor.getString(cursor.getColumnIndex("Apellido")),cursor.getInt(cursor.getColumnIndex("Telefono")),cursor.getInt(cursor.getColumnIndex("Dni")),cursor.getString(cursor.getColumnIndex("Calle")),cursor.getInt(cursor.getColumnIndex("Altura")),cursor.getInt(cursor.getColumnIndex("PisoDto")));
          agendaArrayList.add(miAgenda);
      }
      this.Desconectar();
      return agendaArrayList;
    }

}
