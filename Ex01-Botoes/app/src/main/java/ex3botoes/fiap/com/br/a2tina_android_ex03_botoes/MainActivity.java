package ex3botoes.fiap.com.br.a2tina_android_ex03_botoes;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    TextView txtv;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtv = (TextView) findViewById(R.id.lblN);


    }

    public void incrementar(View v) {
       if(cont < 10){
            cont++;
        }else{
            Toast.makeText(this, "Contador só pode incrementar até 10", Toast.LENGTH_SHORT).show();
        }
        txtv.setText("" + cont);
    }

    public void decrementar(View v){
        if(cont > 0){
            cont = cont - 1;
        }else{
            Toast.makeText(this, "Contador só pode decrementar até 0", Toast.LENGTH_SHORT).show();
        }
        txtv.setText("" + cont);
    }

}
