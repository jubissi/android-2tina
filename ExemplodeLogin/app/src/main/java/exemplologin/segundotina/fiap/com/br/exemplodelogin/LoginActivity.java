package exemplologin.segundotina.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsuario; //atributo vindo da classe EditText
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario); //define pegando da tag da View
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void Logar(View v){ //é a View que chama essa função // Alt+Enter importa o pacote
        String usuario = edtUsuario.getText().toString(); //passa para string pq retona do tipo editable
        String senha = edtSenha.getText().toString();

        if(usuario.toLowerCase().equals("fiap") && senha.toLowerCase().equals("fiap123")) {
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it); //chama a activity
        }else{
            Toast.makeText(this, getString(R.string.mensagemErro), Toast.LENGTH_SHORT).show();
        }
    }
}
