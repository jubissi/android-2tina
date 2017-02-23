package com.example.logonrm.exemplodeintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View v){
        Intent it = new Intent(this, OtherActivity.class);

        //passando um objeto
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Juliana Bissi");
        pessoa.setIdade(27);
        pessoa.setDeficiente(false);

        it.putExtra("pessoa",pessoa);
        startActivity(it);

        /*it.putExtra("nome", "Juliana Bissi");
        it.putExtra("idade", 27);
        it.putExtra("deficiente", false);
        startActivity(it);*/
    }
}
