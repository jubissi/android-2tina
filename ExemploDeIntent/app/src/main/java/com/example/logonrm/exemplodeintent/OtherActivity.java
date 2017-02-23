package com.example.logonrm.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent it = getIntent();

        Pessoa pessoa = (Pessoa)it.getSerializableExtra("pessoa");

        /*String nome = it.getStringExtra("nome");
        int idade = it.getIntExtra("idade", 0);
        boolean deficiente = it.getBooleanExtra("deficiente", false);*/

        /*TextView txtNome = (TextView) findViewById(R.id.txtNome);
        txtNome.setText(nome);
        TextView txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtIdade.setText("Idade: " + idade); //qualquer coisa concatenado com string vira string*/

        TextView txtNome = (TextView) findViewById(R.id.txtNome);
        txtNome.setText(pessoa.getNome());
        TextView txtIdade = (TextView) findViewById(R.id.txtIdade);
        txtIdade.setText("Idade: " + pessoa.getIdade()); //qualquer coisa concatenado com string vira string

        String strDeficiente = (pessoa.isDeficiente()) ? "Sim" : "Não"; //operador ternário
        //String strDeficiente = (deficiente) ? "Sim" : "Não"; //operador ternário
        TextView txtDeficiente = (TextView) findViewById(R.id.txtDeficiente);
        txtDeficiente.setText(strDeficiente);

        //ou pode ser:
        /*if(txtDeficiente.equals(false)){
            txtDeficiente.setText("Sim");
        }else{
            txtDeficiente.setText("Não");
        }*/

    }
}
