package intentobject.fiap.com.br.a2tina_android_intentobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editTextNome;
    EditText editTextDescricao;
    EditText editTextPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editId);
        editTextNome = (EditText)findViewById(R.id.editNome);
        editTextDescricao = (EditText)findViewById(R.id.editDescricao);
        editTextPreco = (EditText)findViewById(R.id.editPreco);

    }

    public void gravar(View v){
        Intent it = new Intent(this, Product.class);
        Produtos p = new Produtos();

        p.setId(editText.getId());
        p.setNome(editTextNome.getText().toString());
        p.setDescricao(editTextDescricao.getText().toString());
        p.setPreco(Double.parseDouble(editTextPreco.getText().toString()));

        it.putExtra("produto", p);
        startActivity(it);

    }
}
