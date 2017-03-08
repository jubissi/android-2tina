package petshop.rm77282.desafio2.fiap.com.br.petshop_rm77282;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox checkBoxFemea;
    CheckBox checkBoxAdestrado;
    CheckBox checkBoxVacinas;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    radioGroup = (RadioGroup)findViewById(R.id.rgGroup);
    txtView = (TextView)findViewById(R.id.txtValor);
    checkBoxFemea = (CheckBox)findViewById(R.id.check_femea1);
    checkBoxAdestrado = (CheckBox)findViewById(R.id.check_adestra2);
    checkBoxVacinas = (CheckBox)findViewById(R.id.check_vacinas3);
    }



    public void calcular(View v){
        double valor = 0;
        double soma = 0;
        int idRadio = radioGroup.getCheckedRadioButtonId();
        if(idRadio == R.id.radio_borderCollie1){
            valor = 800.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_pitBull2){
            valor = 750.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_pastorAlemao3){
            valor = 700.00;
            txtView.setText("R$ " + valor);
        }else if(idRadio == R.id.radio_pastorCanade4){
            valor = 800.00;
            txtView.setText("R$ " + valor);
        }else{
            valor = 00.00;
            txtView.setText("R$ " + valor);
        }

        if(checkBoxFemea.isChecked()){
            soma = 180.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if(checkBoxAdestrado.isChecked()){
            soma = 400.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }
        if(checkBoxVacinas.isChecked()){
            soma = 200.00;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

        if(checkBoxFemea.isChecked() == false && checkBoxAdestrado.isChecked() == false && checkBoxVacinas.isChecked() == false){
            soma = 0;
            valor = (valor + soma);
            txtView.setText("R$ " + valor);
        }

    }
}
