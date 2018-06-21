package etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20;

import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.adapter.CategoriaAdapter;
import etiqueta.restaurante.todosolucoes.com.restauranteetiqueta20.dao.Categoria;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;

    ArrayList<Categoria> listaCategoriasFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.listacategorias);
        listaCategoriasFirebase = new ArrayList<>();
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        getListaCategorias();
        getListaCategorias();
        FloatingActionButton button = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Floationg pressionado", Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        LogApp.i("Antes carregar adapter " + listaCategoriasFirebase.size());

        CategoriaAdapter categoriaAdapter = new CategoriaAdapter(listaCategoriasFirebase);
        mRecyclerView.setAdapter(categoriaAdapter);
        mRecyclerView.setVisibility(View.VISIBLE);
        // row click listener
        mRecyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), mRecyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Categoria categoriaDAO = listaCategoriasFirebase.get(position);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        categoriaAdapter.notifyDataSetChanged();
    }

    public void getListaCategorias() {
        for (int cont = 0; cont < 10; cont++)
            listaCategoriasFirebase.add(new Categoria("1 = " + cont, "nome categoria 1=" + cont, "qtidade1=" + cont));
    }


    @Override
    protected void onStart() {
        super.onStart();
        LogApp.i("OnStart = " + listaCategoriasFirebase.size());
    }


}

