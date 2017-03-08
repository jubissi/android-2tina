package ex02dados.fiap.com.br.a2tina_android_ex02_dados;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    ImageView img1;
    int[] fotos = {
        R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.dadouser);
        img1 = (ImageView)findViewById(R.id.dadopc);

    }


    public void jogar(View v){
        Random sort = new Random();
        int posicao = sort.nextInt(6);
        int posicao1 = sort.nextInt(6);
        img.setImageResource(fotos[posicao]);
        img1.setImageResource(fotos[posicao1]);

        if(posicao > posicao1){
            Toast.makeText(this, "Usuário ganhou!", Toast.LENGTH_SHORT).show();
        }else if(posicao1 > posicao){
            Toast.makeText(this, "PC ganhou!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Empate!", Toast.LENGTH_SHORT).show();
        }

    }




}
