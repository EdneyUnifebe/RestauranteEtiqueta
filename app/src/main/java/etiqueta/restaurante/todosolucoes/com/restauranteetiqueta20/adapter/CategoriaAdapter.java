package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.ListarProdutosCategoria;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.LogApp;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.MainActivity;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.R;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao.Categoria;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaHolder> {

    private List<Categoria> categoriaList;


    public class CategoriaHolder extends RecyclerView.ViewHolder {
        public TextView nomeCategoria, qtidadeProdutos;
        ImageView add;

        public CategoriaHolder(View view) {
            super(view);
            nomeCategoria = (TextView) view.findViewById(R.id.adapterNomeCategoria);
            qtidadeProdutos = (TextView) view.findViewById(R.id.adapterQtidadeProdutos);
            add = (ImageView) view.findViewById(R.id.imageViewAdd);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(view.getContext(), ListarProdutosCategoria.class);

                    view.getContext().startActivity(i);

                }
            });
        }
    }


    public CategoriaAdapter(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    @Override
    public CategoriaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.linha_adapter_categorias, parent, false);

        return new CategoriaHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CategoriaHolder holder, int position) {
        Categoria categoria = categoriaList.get(position);
        holder.nomeCategoria.setText(categoria.getNomeCategoria());
        holder.qtidadeProdutos.setText(categoria.getQtidadeProdutos());
        holder.add.setTag(position);

    }

    @Override
    public int getItemCount() {
        return categoriaList.size();
    }

}
