package br.com.fiap.a2tina_android_apisretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 12/04/2017.
 */

public interface RetrofitContatosInterface {

    @GET("contatos.php")
    Call<List<Contato>> getContatos();

}
