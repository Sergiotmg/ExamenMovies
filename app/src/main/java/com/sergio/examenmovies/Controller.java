package com.sergio.examenmovies;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<List<Movies>> {
    private  ServerResponse handler;
    private static final String BASE_URL="http://192.168.1.165:8080/";

    public Controller(ServerResponse handler)    {
        this.handler=handler;
    }



    public void start(){
        Gson gson= new GsonBuilder().setLenient().create();
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MoviesAPI api= retrofit.create(MoviesAPI.class);
        Call <List<Movies>> call=api.loadMovies();
        call.enqueue(this);




    }


    @Override
    public void onResponse(Call<List<Movies>> call, Response<List<Movies>> response) {
        //puede ser correcta o incorrecta la respuesta
        if (response.isSuccessful()){

            List<Movies> movies=response.body();
            if (movies.size()>0){
                Log.d("CONTROLLER ",movies.get(0).getName());
                //
                handler.onResponse(movies);

            }
        }else {
            Log.d("Controller", String.valueOf(response.errorBody()));
        }

    }

    @Override
    public void onFailure(Call<List<Movies>> call, Throwable t) {
        t.printStackTrace();

    }
    // metodo que le queramos poner a la interfaz
    public interface ServerResponse{
        void onResponse(List<Movies> movies);



    }
}
