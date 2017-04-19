package br.com.fiap.a2tina_android_apisretrofit;

import java.io.Serializable;

/**
 * Created by logonrm on 12/04/2017.
 */

public class Contato implements Serializable {
    private String nome;
    private String telefone;
    private String status;
    private String imagem;

    public Contato() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
