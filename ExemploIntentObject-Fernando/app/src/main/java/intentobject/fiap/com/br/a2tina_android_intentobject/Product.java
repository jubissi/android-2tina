package intentobject.fiap.com.br.a2tina_android_intentobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Product extends AppCompatActivity {

    TextView textViewId;
    TextView textViewNome;
    TextView textViewDescricao;
    TextView textViewPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


        Intent it = getIntent();
        Produtos p = (Produtos)it.getSerializableExtra("produto");


        textViewId = (TextView)findViewById(R.id.id);
        textViewId.setText(p.getId());

        textViewNome = (TextView)findViewById(R.id.nome);
        textViewNome.setText(p.getNome());

        textViewDescricao = (TextView)findViewById(R.id.descricao);
        textViewDescricao.setText(p.getDescricao());

        textViewPreco = (TextView)findViewById(R.id.preco);
        textViewPreco.setText("" + p.getPreco());




    }



}
