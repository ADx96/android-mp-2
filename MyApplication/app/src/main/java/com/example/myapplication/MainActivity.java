package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> MovieData = new ArrayList<>();
       Movie m = new Movie("avenfers1",1.5,7,2010,R.drawable.Avengers1);
       Movie a =  new Movie("avengers2",2,7,2013,R.drawable.Avengers2);
        Movie b =  new Movie("avengers3",2,8,2017,R.drawable.Avengers3);
        Movie c =  new Movie("avengers4",2,7,2019,R.drawable.Avengers4);

MovieData.add(m);
MovieData.add(a);
MovieData.add(b);
MovieData.add(c);

       RecyclerView movielist = findViewById(R.id.rv);
       //aligning the item linear layout
  movielist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
movielist.setLayoutManager(lm);

MovieAdapter ma = new MovieAdapter(MovieData,MainActivity.this);
movielist.setAdapter(ma);
    }
}