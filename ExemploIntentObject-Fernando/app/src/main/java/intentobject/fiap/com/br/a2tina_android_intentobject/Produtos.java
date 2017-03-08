package intentobject.fiap.com.br.a2tina_android_intentobject;

import java.io.Serializable;

/**
 * Created by logonrm on 07/03/2017.
 */

public class Produtos implements Serializable {

    private String nome;
    private double preco;
    private String descricao;
    private int id;

    public Produtos(int id, String nome, double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Produtos() {

    }


    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
