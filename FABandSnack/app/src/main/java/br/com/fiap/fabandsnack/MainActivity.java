package br.com.fiap.fabandsnack;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clique(View view) {
        Snackbar.make(findViewById(R.id.app), getString(R.string.eu_sou), Snackbar.LENGTH_LONG)
        .setAction(getString(R.string.acao), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Teste", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}
