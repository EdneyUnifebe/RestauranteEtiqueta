package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.R;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao.Produtos;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ProdutosHolder> {

    private List<Produtos> ProdutosList;


    public class ProdutosHolder extends RecyclerView.ViewHolder {
        public TextView nomeProdutos, qtidadeProdutos;
        ImageView add;

        public ProdutosHolder(View view) {
            super(view);
            /*
            TODO: precisa ser implementado
            nomeProdutos = (TextView) view.findViewById(R.id.adapterNomeProdutos);
            qtidadeProdutos = (TextView) view.findViewById(R.id.adapterQtidadeProdutos);
            */add = (ImageView) view.findViewById(R.id.imageViewAdd);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                   /*
                   TODO: precisa ser implementado
                   Intent i = new Intent(view.getContext(), ListarProdutosProdutos.class);

                    view.getContext().startActivity(i);*/

                }
            });
        }
    }


    public ProdutosAdapter(List<Produtos> ProdutosList) {
        this.ProdutosList = ProdutosList;
    }

    @Override
    public ProdutosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.linha_adapter_produtos, parent, false);

        return new ProdutosHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProdutosHolder holder, int position) {
        Produtos Produtos = ProdutosList.get(position);
        /*
        TODO: precisa ser implementado
        holder.nomeProdutos.setText(Produtos.getNomeProdutos());
        holder.qtidadeProdutos.setText(Produtos.getQtidadeProdutos());
        */
        holder.add.setTag(position);

    }

    @Override
    public int getItemCount() {
        return ProdutosList.size();
    }

}
