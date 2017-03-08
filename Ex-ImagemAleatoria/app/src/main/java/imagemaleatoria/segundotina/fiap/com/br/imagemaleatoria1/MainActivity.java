package imagemaleatoria.segundotina.fiap.com.br.imagemaleatoria1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgV;
    int[]fotos = {
        R.drawable.aranha,
            R.drawable.cap,
            R.drawable.dead,
            R.drawable.ferro,
            R.drawable.images
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV = (ImageView)findViewById(R.id.imageView);

    }

    public void Sortear(View v){
        Random sort = new Random();
        int posicao = sort.nextInt(5);
        imgV.setImageResource(fotos[posicao]);
    }
}
