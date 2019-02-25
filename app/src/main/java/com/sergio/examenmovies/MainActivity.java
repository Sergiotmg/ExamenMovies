package com.sergio.examenmovies;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Controller.ServerResponse{
    private  List<Movies> movies;

    private  MoviesAdapter adapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Movies> movies=Movies.getMovies();

        RecyclerView recycler =findViewById(R.id.rView);

        adapter=new MoviesAdapter(this,movies );
        recycler.setAdapter(adapter);

        LinearLayoutManager manager=new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        Controller controller=new Controller(this);
        //OTRA FORMA DE HACERLO PARA NO PONER BAJO ON RESPONSE E IMLEMENTAR LAS OBLIGATORIAS
      /*  Controller controller=new Controller(new Controller.ServerResponse() {
            @Override
            public void onResponse(List<Movies> movies) {

            }
        });*/

        // e sthis porque esta clase implementa la interfaz serverResponse

        controller.start();

    }

    // fuer adel activity this nunca es un contexto
    @Override
    public void onResponse(List<Movies> movies) {

        //Toast.makeText(this,movies.get(0).getName(),Toast.LENGTH_LONG).show();
        adapter.setData(movies);

    }
}
