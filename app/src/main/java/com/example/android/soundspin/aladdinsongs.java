package com.example.android.soundspin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class aladdinsongs extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            // Create a list of songLists
            ArrayList<SongList> songLists = new ArrayList<SongList>();
            songLists.add(new SongList(getString(R.string.a_singer_1), getString(R.string.a_song_1), R.drawable.aladdin));
            songLists.add(new SongList(getString(R.string.a_singer_2), getString(R.string.a_song_2), R.drawable.aladdin));
            songLists.add(new SongList(getString(R.string.a_singer_3), getString(R.string.a_song_3), R.drawable.aladdin));
            songLists.add(new SongList(getString(R.string.a_singer_4), getString(R.string.a_song_4), R.drawable.aladdin));

            // Create an {@link SongAdapter}, whose data source is a list of {@link SongList}s. The
            // adapter knows how to create list items for each item in the list.
            SongAdapter adapter = new SongAdapter(this, songLists);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // activity_numbers.xml layout file.
            ListView listView = findViewById(R.id.list);

            // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link SongList} in the list.
            listView.setAdapter(adapter);

        }
    }


