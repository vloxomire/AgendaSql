package com.max.agendasql.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
