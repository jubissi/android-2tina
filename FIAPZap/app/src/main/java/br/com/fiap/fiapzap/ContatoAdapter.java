package br.com.fiap.fiapzap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 */

public class ContatoAdapter extends BaseAdapter{
    private Context context;
    private List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos) {
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
    } //contabiliza quantos itens precisa renderizar > a quantidade que vem da lista de contatos

    @Override
    public Object getItem(int i) {
        return this.contatos.get(i);
    } //para pegar um item específico para renderizar > pega a posição do item da lista

    @Override
    public long getItemId(int i) {
        return i;
    } //dar identificador para cada item > vamos usar como identificador a propria posição

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(i);
        View v = inflater.inflate(R.layout.listview_contatos, null); //null > é o campo do view group
        ImageView imgContato = (ImageView) v.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) v.findViewById(R.id.txtNome);
        TextView txtSobre = (TextView) v.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtSobre.setText(contato.getSobre());

        return v;
    } //renderiza a view criada > inflar ela (transformar um xml em um objeto)


}
