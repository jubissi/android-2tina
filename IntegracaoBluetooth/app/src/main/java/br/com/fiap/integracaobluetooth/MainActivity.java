package br.com.fiap.integracaobluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    Spinner spDispositivos;
    EditText txtInformacao;

    BluetoothAdapter bluetooth = BluetoothAdapter.getDefaultAdapter();
    BluetoothSocket soquete = null;
    OutputStream saida = null;
    Set<BluetoothDevice> dispositivosPareados; //set nao permite repetidos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spDispositivos = (Spinner) findViewById(R.id.spDispositivos);
        txtInformacao = (EditText) findViewById(R.id.txtInformacao);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item); //para preencher o spinner
        adapter.add("Selecione um dispositivo");

        //Aparelho tem bluetooth?
        if(bluetooth != null){
            //Ativar se não estiver ativo
            if(!bluetooth.isEnabled()){
                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                int REQUEST_ENABLE_BT = 1;
                startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
            }
            dispositivosPareados = bluetooth.getBondedDevices(); //retorna um set de dispositivos pareados

            if(dispositivosPareados.size()>0){
                for(BluetoothDevice item : dispositivosPareados){
                    adapter.add(item.getName());
                }
            }
        }

        spDispositivos.setAdapter(adapter);


    }

    public void enviar(View view) throws IOException{
        for (BluetoothDevice item : dispositivosPareados){
            if(spDispositivos.getSelectedItem().toString().equalsIgnoreCase(item.getName())){
                try{
                    BluetoothDevice dispositivoRemoto = bluetooth.getRemoteDevice(item.getAddress()); //comunicar com o endereço que vem do dispositivo
                    soquete = criaSoqueteBluetooth(dispositivoRemoto);
                    soquete.connect();

                    bluetooth.cancelDiscovery(); //para parar de buscar e não ficar lento

                    saida = soquete.getOutputStream(); //para escrever os dados

                    //buffer carrega/escreve aos pedaços
                    byte[] buffer = txtInformacao.getText().toString().getBytes(); //convertendo para array de bytes
                    saida.write(buffer);

                    saida.close();
                    soquete.close();

                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private BluetoothSocket criaSoqueteBluetooth(BluetoothDevice dispositivo) throws IOException { //NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method metodo;
        BluetoothSocket tmpSoquete = null;

        try{
            metodo = dispositivo.getClass().getMethod("createRfcommSocket", new Class[]{int.class});
            tmpSoquete = (BluetoothSocket) metodo.invoke(dispositivo, 1);
        } finally {
            return tmpSoquete;
        }
    }
}
