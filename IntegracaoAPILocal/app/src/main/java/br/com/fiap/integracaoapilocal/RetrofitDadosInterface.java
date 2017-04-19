package br.com.fiap.integracaoapilocal;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 19/04/2017.
 */

public interface RetrofitDadosInterface {
    @GET("dados")
    Call<Contato> getDados(); //para só 1 contato > se fosse uma lista usar <List<Contato>>
}
