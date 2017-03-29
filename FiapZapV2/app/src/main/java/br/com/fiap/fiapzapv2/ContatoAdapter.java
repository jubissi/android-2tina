package br.com.fiap.fiapzapv2;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by logonrm on 29/03/2017.
 */

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder>{

    private Context context;
    private List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos){
        this.context = context;
        this.contatos = contatos;
    }

    @Override
    public ContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //instancia o objeto viewholder
        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_contato, parent, false);
        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(v);

        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(ContatoViewHolder holder, int position) { //para cada item da lista, pegar os dados da lista colocando no view holder > setar os dados
        final Contato contato = this.contatos.get(position);

        holder.imgContato.setImageResource(contato.getImagem());
        holder.txtNome.setText(contato.getNome());
        holder.txtStatus.setText(contato.getStatus());
        holder.cardView.setOnClickListener(new View.OnClickListener() { //implementa o click, no listview ja eh automatico
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Clicou em: " + contato.getNome(),Toast.LENGTH_SHORT);
            }
        });
    }

    @Override
    public int getItemCount() { //quantidade de itens que vai renderizar
        return this.contatos.size();
    }

    public static class ContatoViewHolder extends RecyclerView.ViewHolder { //static uma aplicação so existir em tudo

        CardView cardView;
        ImageView imgContato;
        TextView txtNome, txtStatus;

        public ContatoViewHolder(View itemView) { //classe intena que vai ser o view holder
            super(itemView);

            cardView = (CardView) itemView;
            imgContato = (ImageView) itemView.findViewById(R.id.imgContato);
            txtNome = (TextView) itemView.findViewById(R.id.txtNome);
            txtStatus = (TextView) itemView.findViewById(R.id.txtStatus);
        }



    }
}
