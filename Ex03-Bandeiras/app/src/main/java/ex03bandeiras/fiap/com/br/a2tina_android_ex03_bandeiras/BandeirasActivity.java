package ex03bandeiras.fiap.com.br.a2tina_android_ex03_bandeiras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class BandeirasActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imgV;

    String[] pais = {
            "Argentina", "Brasil", "Franca", "Japao"
    };

    int[] fotos = {
    R.drawable.argentina,
        R.drawable.brasil,
        R.drawable.franca,
        R.drawable.japao
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandeiras);

        spinner = (Spinner)findViewById(R.id.spinner);
        imgV = (ImageView)findViewById(R.id.imgV);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pais);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgV.setImageResource(fotos[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }





}
