package br.com.fiap.fragmentsexemplos;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    //Fragments > conceito de mini actvitys dentro da actvity
    //Mesmo conceito de iframe
    //Para reaproveitamento de código

    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentContainer = (FrameLayout) findViewById(R.id.fragment_container);
    }
    public void altera_fragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        //getSupportFragmentManager > classe responsavel por manipula fragment na tela > da pra usar sem support (varias versoes)
        //addToBackStack > coloca na lista de telas abertas sobrepostas > possivel voltar
    }
    public void exibir_carro1(View view) {
        altera_fragment(new Carro1Fragment());
    }
    public void exibir_carro2(View view) {
        altera_fragment(new Carro2Fragment());
    }
}
