package com.example.logonrm.exemplofragmentlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Carro1Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Carro1Fragment carro1Fragment =  new Carro1Fragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, carro1Fragment)
                .commit();

    }

    @Override
    public void avisarUsuario(String msg) {
        Toast.makeText(this, "Carro1 processou algo: " + msg, Toast.LENGTH_SHORT).show();
    }
}
