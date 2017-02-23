package br.com.fiap.exemplodespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    String[] cursos = {"TIN","TDS","TRC","SI","ADM","EC","EP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cursos);
        // adaptor pega um layout para inserir em outro layout
        //cada item do combobox é uma layout desse layout padrao escolhido do android
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,cursos[position], Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
