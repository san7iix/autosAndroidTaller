package com.example.appautos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Auto> autosM = new ArrayList<>();
    Button btn_agregar;
    EditText modelo, marca, matricula;
    AutoAdapter mAdapter;
    ListView carList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carList = findViewById(R.id.listViewAutos);
        modelo = findViewById(R.id.modelo_et);
        marca = findViewById(R.id.marca_tv);
        matricula = findViewById(R.id.matricula_tv);
        btn_agregar = findViewById(R.id.btn_ins);


        autosM.add(new Auto("asd","qwa","asdas"));
        mAdapter = new AutoAdapter(this, R.layout.filaauto,autosM);
        carList.setAdapter(mAdapter);

        btn_agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(modelo.getText().toString().isEmpty() || marca.getText().toString().isEmpty() || matricula.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Todos los campos deben ser llenados",Toast.LENGTH_SHORT).show();
                    return;
                }

                Auto auto = new Auto(modelo.getText().toString(),marca.getText().toString(),matricula.getText().toString());
                autosM.add(auto);
                carList.setAdapter(mAdapter);
            }
        });

    }



}