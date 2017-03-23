package br.com.fiap.fiapzap;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ConversaActivity extends AppCompatActivity {

    ImageView imgContato;
    TextView nomeContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        Contato contato = (Contato) getIntent().getExtras().get("contato");

        ActionBar actionBar = getSupportActionBar(); //usa a bar padrão
        actionBar.setTitle(contato.getNome());

        imgContato = (ImageView) findViewById(R.id.imgContato);
        nomeContato = (TextView) findViewById(R.id.txtNome);

        imgContato.setImageResource(contato.getImagem());
        nomeContato.setText(contato.getNome());
    }
}
