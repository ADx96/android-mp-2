package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.ArrayList;
import java.util.Objects;

import static com.example.myapplication.R.*;

public class MovieAdapter extends RecyclerView.Adapter  {


    ArrayList<Movie> mArray;
    Context c;

    public MovieAdapter(ArrayList<Movie> mArray, Context c) {
        this.mArray = mArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(layout.movie_list_item,parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //connecting to movie_list_item xml
        ((ViewHolder) holder).rating.setText(mArray.get(position).getRating()+"");
        ((ViewHolder) holder).duration.setText(mArray.get(position).getDuration()+"");
        ((ViewHolder) holder).year.setText(mArray.get(position).getYear());
        ((ViewHolder) holder).rating.setText(mArray.get(position).getName());
        ((ViewHolder) holder).img.setImageResource(mArray.get(position).getImg());
    }


    @Override
    public int getItemCount() {
        return mArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView duration;
        public TextView name;
        public TextView rating;
        public TextView year;
        public View view;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(id.img1);
            name = itemView.findViewById(id.name);
            duration = itemView.findViewById(id.duration);
            rating = itemView.findViewById(id.rating);
            year = itemView.findViewById(id.year);
        }
    }
}
