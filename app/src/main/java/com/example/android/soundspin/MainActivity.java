package com.example.android.soundspin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Set picture
        ImageView songs = findViewById(R.id.button1);
        songs.setImageResource(R.drawable.songs);

        // Find the View that shows the songs category
        TextView songsList = findViewById(R.id.songs);

        // Set a click listener on that View
        songsList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, songs.class);
                startActivity(numbersIntent);
            }
        });

        //Set picture
        ImageView artists = findViewById(R.id.button2);
        artists.setImageResource(R.drawable.singer);

        // Find the View that shows the songs category
        TextView artistsList = findViewById(R.id.artists);

        // Set a click listener on that View
        artistsList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, artists.class);
                startActivity(familyIntent);
            }
        });

        //Set picture
        ImageView albums = findViewById(R.id.button5);
        albums.setImageResource(R.drawable.album);

        // Find the View that shows the songs category
        TextView albumslist = findViewById(R.id.albums);

        // Set a click listener on that View
        albumslist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, albums.class);
                startActivity(colorsIntent);
            }
        });


        //Set picture
        ImageView playlist = findViewById(R.id.button6);
        playlist.setImageResource(R.drawable.playlist);

        // Find the View that shows the songs category
        TextView playlistView = findViewById(R.id.playlists);

        // Set a click listener on that View
        playlistView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, playlists.class);
                startActivity(phrasesIntent);
            }
        });

    }
}


