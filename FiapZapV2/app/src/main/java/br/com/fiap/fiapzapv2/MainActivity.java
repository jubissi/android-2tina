package br.com.fiap.fiapzapv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //recyclerview ele da maior possibilidade que o listview que eh so lista, ele pode ajustar em grade

    RecyclerView rvContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos = GeraContato.listaContatos();


        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(this); //a maneira que vai listar os dados
        //RecyclerView.LayoutManager LayoutManager = new GridLayoutManager(this);

        ContatoAdapter adapter = new ContatoAdapter(this, contatos);

        rvContatos = (RecyclerView) findViewById(R.id.rvContatos);
        rvContatos.setHasFixedSize(true);
        rvContatos.setAdapter(adapter);
        rvContatos.setLayoutManager(LayoutManager);
    }
}
