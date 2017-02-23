package segundotina.fiap.com.br.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { //classe de compatibilidade com a versao do android
    //Button btnMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate cria os componentes antes de sair na tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //indica o layout que está sendo usado
        //classe R é a mais importante > de referência > gerada automaticamente apontando para os arquivos de resource (diversos formatos)

        /*LinearLayout linearLayout = new LinearLayout(this); //this > contexto vai aparecer nessa activity em questao
        Button btnExemplo = new Button(this);
        btnExemplo.setText("Não Aperte");
        linearLayout.addView(btnExemplo);
        setContentView(linearLayout);*/

        /*Button btnExemplo = new Button(this);
        setContentView(btnExemplo); //agora a view toda é o botão > não usa mais o layout do xml
        btnExemplo.setText("Botão");*/

        /*btnMensagem = (Button) findViewById(R.id.btnMensagem); //ligou o botão ao do xml
        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Olá", Toast.LENGTH_SHORT).show(); //texto que sobe na tela
            }
        });*/
    }

    public void ClickBtnEnviar(View v){
        EditText edtNome = (EditText) findViewById(R.id.edtNome);
        String nome = edtNome.getText().toString();
        //if(nome.equals("")){
        if(nome.trim().isEmpty()){ //.trim() desconsidera os espaços
            Toast.makeText(this, "Digite seu nome", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Olá, " + nome, Toast.LENGTH_SHORT).show();
        }
    }

    /*@Override
    protected void onStart() {
        super.onStart();
        Log.d("TESTE","onStart funcionando"); // d > debug, e > erro, i > info
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TESTE","onResume funcionando");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TESTE","onPause funcionando");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TESTE","onStop funcionando");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TESTE","onDestroy funcionando");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TESTE","onRestart funcionando");
    }
    public void clickVerMensagem(View v){ //maneira mais simples que a anterior
        Toast.makeText(this, getString(R.string.ola), Toast.LENGTH_SHORT).show();
    }*/
}
