package br.com.fiap.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;
    CheckBox chkSalvarSenha;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        chkSalvarSenha = (CheckBox) findViewById(R.id.chkSalvarSenha);
        //Inicializa o Shared Preferences no modo privado
        sp = getPreferences(MODE_PRIVATE); //diferença que sharedPreferences da nome pro arquivo, pode ter vários
        //modo privado, só a aplicação vai conseguir ver esse dado;
        edtUsuario.setText(sp.getString("usuario",""));
        edtSenha.setText(sp.getString("senha",""));
    }

    public void login(View v) {
        String usuario = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if(usuario.trim().equals("fiap") && senha.trim().equals("123")) {
            SharedPreferences.Editor e = sp.edit();
            if(chkSalvarSenha.isChecked()) {
                e.putString("usuario", usuario); //pega os dados
                e.putString("senha", senha);
            }else{
                e.remove("usuario");
                e.remove("senha");
            }
            e.commit(); //realmente salva no Shared Preferences
            //logica para abrir outra activity
            Intent it = new Intent(this, DadosActivity.class);
            startActivity(it); //chamar a intent
            return; //se chegou no return termina e nao roda o Toast
        }
            Toast.makeText(this, R.string.usuario_incorreto, Toast.LENGTH_SHORT).show();
    }
}
