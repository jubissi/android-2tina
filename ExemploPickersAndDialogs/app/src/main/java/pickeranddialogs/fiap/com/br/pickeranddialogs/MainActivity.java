package pickeranddialogs.fiap.com.br.pickeranddialogs;

import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actvPaises;
    DatePicker dtpAniversario;
    TimePicker tmpHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actvPaises = (AutoCompleteTextView) findViewById(R.id.actvPaises);
        String[] paises = new String[]{"Brasil","Argentina","Chile","Dinamarca","Escócia"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,paises);
        actvPaises.setAdapter(adapter);

        dtpAniversario = (DatePicker)findViewById(R.id.datePicker);
        tmpHorario = (TimePicker)findViewById(R.id.tmpHorario);

    }

    public void salvar(View v){
        int year = dtpAniversario.getYear();
        int month = dtpAniversario.getMonth();
        int day = dtpAniversario.getDayOfMonth();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            int hour = tmpHorario.getHour();
            int minute = tmpHorario.getMinute();
        }

        //Calendar calendar = new GregorianCalendar(year, month, day);
        //calendar.getTimeInMillis();

        //Builder ele deixa que setamos cada parte do componente a hora que quisermos no metodo construtor
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(getString(R.string.data_escolhida));
        dialog.setMessage(day + "/" + month + "/" + year);
        dialog.show();
    }




}
