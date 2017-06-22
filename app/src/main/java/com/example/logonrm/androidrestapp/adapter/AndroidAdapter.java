package com.example.logonrm.androidrestapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.logonrm.androidrestapp.R;
import com.example.logonrm.androidrestapp.model.Android;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder> {

    private List<Android> androids;
    private Context context;

    public AndroidAdapter(List<Android> androids) {
        this.androids = androids;
    }



    //Cria o stack que ele precisa para funcionar (onCreateViewHolder/onBindViewHolder/getItemCount)
    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //trabalhar com inflate
        //from (precisa de um contexto)
        //quando trabalha cm list, tira o layout e coloca a lista desenhada do jeito que a gente quer
        //renderiza o xml em memória
        //parent (view group q estou trabalhando)
        //ultimo parametro (fala se vai consumir a informação na que passar aqui
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.android_row,
                parent, false);

        return new AndroidViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int position) {

        holder.tvTitulo.setText(androids.get(position).getNome());
        holder.tvSubTitulo.setText(androids.get(position).getVersao());

        Picasso.with(holder.itemView.getContext())
                .load(androids.get(position).getUrlImagem())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher) //pode colocar uma imagem de erro
                .into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return androids.size();
    }

    public class AndroidViewHolder extends RecyclerView.ViewHolder {


        public ImageView ivLogo;
        public TextView tvTitulo;
        public TextView tvSubTitulo;

        //tem que associar o elemento com o valor
        //recebe uma view pq tem um layout a ser utilizado nesse cara
        public AndroidViewHolder(View itemView) {

            //super chama o construtor da classe pai (RecyclerView)
            super(itemView);

            //bind das informações do xml com os componentes
            ivLogo = (ImageView) itemView.findViewById(R.id.ivLogo);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvSubTitulo = (TextView)itemView.findViewById(R.id.tvSubTitulo);

        }
    }

    public void update(List<Android> androids) {
        this.androids = androids;
        //notifico que foram setados novos valores nessa lista
        notifyDataSetChanged();
    }

}
