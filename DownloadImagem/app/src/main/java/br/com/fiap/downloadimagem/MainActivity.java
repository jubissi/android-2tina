package br.com.fiap.downloadimagem;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    //ESTA DANDO ERRO - TALVEZ FALTANDO UM retun EM ALGUMA PARTE DO CÓDIGO

    private static final String IMG_URL = "https://www.douglascabral.com.br/aula-api/img/01.png";
    //final faz vira uma constante (nao ter o valor alterado)

    private ProgressDialog mProgressDialog; //m na frente é só um padrão do android atributos privados
    //s para private static

    private ImageView imgBaixada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBaixada = (ImageView) findViewById(R.id.imgBaixada);
    }

    public void download(View view) {
        DownloadAsyncTask downloadAsyncTask = new DownloadAsyncTask();
        downloadAsyncTask.execute(IMG_URL);
    }

    private class DownloadAsyncTask extends AsyncTask<String, Void, Bitmap>{//void para nao ter retorno do progresso

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = ProgressDialog.show(MainActivity.this, "Aguarde", "Fazendo download da imagem.");
        }

        @Override
        protected Bitmap doInBackground(String... params) {//... significa que pode parar mais de um parâmetro desse tipo
            try{
                InputStream inputStream;
                Bitmap imagem;
                URL endereco = new URL(params[0]);
                inputStream = endereco.openStream();

                imagem = BitmapFactory.decodeStream(inputStream);
                inputStream.close();

            }catch(IOException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if(bitmap != null){
                imgBaixada.setImageBitmap(bitmap);
            }
            mProgressDialog.dismiss();
        }
    }
}
