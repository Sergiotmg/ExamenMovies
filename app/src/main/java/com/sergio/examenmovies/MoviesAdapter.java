package com.sergio.examenmovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder> {
    List<Movies> movies;
    LayoutInflater inflater;
    Context context;


    public MoviesAdapter(Context context,List<Movies> movies) {
        this.movies=movies;//si es de internet no va esa linea
        inflater= LayoutInflater.from(context);
        this.context=context;
    }

    public class MoviesViewHolder  extends RecyclerView.ViewHolder{

        TextView txtName;
        ImageView imgThumbnail;

        public MoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            imgThumbnail=itemView.findViewById(R.id.imagen);
            txtName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Movies movie=movies.get(getAdapterPosition());
                    Toast.makeText(context,
                            movie.getName(),
                            Toast.LENGTH_LONG).show();
                }
            });

            //con la view seria para todo el layout
        }

    }




    @NonNull
    @Override
    public MoviesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        MoviesViewHolder viewHolder= new MoviesViewHolder(
                inflater.inflate(R.layout.movies_item,
                viewGroup,
                false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesViewHolder vh, int position) {
        Movies movie=movies.get(position);

       vh.txtName.setText(movie.getName());
       //vh.imgThumbnail.set
        GlideApp.with(context)
                .load(movie.getThumbnail())
                .into(vh.imgThumbnail);


    }

    @Override
    public int getItemCount() {
        if (movies==null){
            return  0;
        }
        return movies.size();
    }

    public void setData(List<Movies> newList){
        movies=newList;
        notifyDataSetChanged();

    }
}
