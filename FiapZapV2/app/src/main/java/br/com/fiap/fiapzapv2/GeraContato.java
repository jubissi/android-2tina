package br.com.fiap.fiapzapv2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class GeraContato {
    public static List<Contato> listaContatos(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("João", "(11) 11111-1111", "Hello There, I'm using FIAP ZAP", R.drawable.male3));
        contatos.add(new Contato("Bianca", "(11) 22222-2222", "Olá", R.drawable.female1));
        contatos.add(new Contato("Ana", "(11) 33333-3333", "Bom dia!", R.drawable.girl));

        return contatos;
    }
}
