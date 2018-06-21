package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.adapter.CategoriaAdapter;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.adapter.ProdutosAdapter;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao.Categoria;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao.Produtos;

public class ListarProdutosCategoria extends AppCompatActivity {

    RecyclerView mRecyclerView;

    ArrayList<Produtos> listaProdutosFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);

        mRecyclerView = (RecyclerView) findViewById(R.id.listacategorias);
        listaProdutosFirebase = new ArrayList<>();
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        /**
         * TODO: precisa ser implementado
         */
        getListaProdutosDaCategoria("242324234");
        Toast.makeText(this, "Chamado tela lista d eprodutos", Toast.LENGTH_SHORT).show();
        FloatingActionButton button = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListarProdutosCategoria.this, "Floationg pressionado", Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        LogApp.i("Antes carregar adapter " + listaProdutosFirebase.size());

        ProdutosAdapter categoriaAdapter = new ProdutosAdapter(listaProdutosFirebase);
        mRecyclerView.setAdapter(categoriaAdapter);
        mRecyclerView.setVisibility(View.VISIBLE);
        // row click listener
        mRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), mRecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Produtos categoriaDAO = listaProdutosFirebase.get(position);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        categoriaAdapter.notifyDataSetChanged();
    }

    private void getListaProdutosDaCategoria(String s) {
        for (int cont = 0; cont < 10; cont++)
            listaProdutosFirebase.add(new Produtos("1 = " + cont, "nome produtos 1=" + cont, "qtidade1=" + cont));
    }


    @Override
    protected void onStart() {
        super.onStart();
        LogApp.i("OnStart = " + listaProdutosFirebase.size());
    }


}

