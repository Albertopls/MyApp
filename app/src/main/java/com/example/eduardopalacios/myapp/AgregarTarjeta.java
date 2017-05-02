package com.example.eduardopalacios.myapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

public class AgregarTarjeta extends AppCompatActivity {
   Button fecha;
    EditText ed_Fecha;
    int dia, mes, ano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_tarjeta);
        //fecha= (Button) findViewById(R.id.button_fecha);
        //ed_Fecha=(EditText)findViewById(R.id.edit_fecha);

    }


}
