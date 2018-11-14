package com.example.duvan.peluchitosdrawer.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ContactoSQLiteHelper extends SQLiteOpenHelper {

    String sqlCreate = "CREATE TABLE contactos (" + // LA APLICACION GESTIONA LOS ESPACIOS VACIOS
            "id         INTEGER PRIMARY KEY AUTOINCREMENT, " +  //0
            "nombre     TEXT, " +                               //1
            "telefono   TEXT, " +                               //2
            "correo     TEXT)";                                 //3

    public ContactoSQLiteHelper(Context context,//CONSTRUCTOR
                                 String name,
                                 SQLiteDatabase.CursorFactory factory,  //SE TOMA COMO NULL
                                 int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);
    } //CREAR BASE DE DATOS

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { //ACTUALIZAMOS LA BASE DE DATOS
        db.execSQL("DROP TABLE IF EXISTS contactos");
        db.execSQL(sqlCreate);
    }
}