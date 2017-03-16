package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class TelaCheiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cheia);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(android.R.drawable.ic_search_category_default);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}
