package br.com.fiap.actionbartoolbarandnavigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();//usar com o Support se tiver usando o pacote de compatibilidade
        actionBar.setTitle("Exemplo"); //para alterar dinamicamente em cada pagina
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //passar o menu dentro do menu
        //Infla o menu com os itens do XML
        getMenuInflater().inflate(R.menu.menu_main, menu); //inflar o xml > ler o xml e transformar em um objeto java

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Verifica qual item foi clicado na ActionBar e realiza a ação
        if(item.getItemId() == R.id.mnSobre){
            //Toast.makeText(this, "Clicou em sobre.", Toast.LENGTH_SHORT).show();
            Intent it = new Intent(this, SobreActivity.class);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }

    public void abrirTelaCheia(View view) {
        Intent it = new Intent(this, TelaCheiaActivity.class);
        startActivity(it);
    }

    public void abrirNavigationDrawer(View view) {
        Intent it = new Intent(this, ExemploNavigationActivity.class);
        startActivity(it);
    }
}
