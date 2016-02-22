package com.example.akira.spinnerpracticaexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);

        ArrayAdapter adapterCurso = ArrayAdapter.createFromResource(this, R.array.curso, android.R.layout.simple_spinner_dropdown_item);
        adapterCurso.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        final ArrayAdapter adapterDAM = ArrayAdapter.createFromResource(this, R.array.alumno_DAM, android.R.layout.simple_spinner_dropdown_item);
        adapterDAM.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        final ArrayAdapter adapterELEC = ArrayAdapter.createFromResource(this, R.array.alumno_Elec, android.R.layout.simple_spinner_dropdown_item);
        adapterELEC.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        final ArrayAdapter adapterMEC = ArrayAdapter.createFromResource(this, R.array.alumno_Mec, android.R.layout.simple_spinner_dropdown_item);
        adapterMEC.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        spinner1.setAdapter(adapterCurso);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    spinner2.setAdapter(adapterDAM);
                }

                if(position == 1){
                    spinner2.setAdapter(adapterELEC);
                }

                if(position == 2){
                    spinner2.setAdapter(adapterMEC);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}

