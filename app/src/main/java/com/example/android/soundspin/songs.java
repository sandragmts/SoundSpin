package com.example.android.soundspin;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create a list of songLists
        ArrayList<SongList> songLists = new ArrayList<SongList>();
        songLists.add(new SongList("3:24", getString(R.string.m_song_1), R.drawable.songs));
        songLists.add(new SongList("2:41", getString(R.string.m_song_2), R.drawable.songs));
        songLists.add(new SongList("2:42", getString(R.string.m_song_3), R.drawable.songs));
        songLists.add(new SongList("3:00", getString(R.string.m_song_4), R.drawable.songs));
        songLists.add(new SongList("3:25", getString(R.string.f_song_1), R.drawable.songs));
        songLists.add(new SongList("1:51", getString(R.string.f_song_2), R.drawable.songs));
        songLists.add(new SongList("2:05", getString(R.string.f_song_3), R.drawable.songs));
        songLists.add(new SongList("3:43", getString(R.string.f_song_4), R.drawable.songs));
        songLists.add(new SongList("1:17", getString(R.string.a_song_1), R.drawable.songs));
        songLists.add(new SongList("2:20", getString(R.string.a_song_2), R.drawable.songs));
        songLists.add(new SongList("2:39", getString(R.string.a_song_3), R.drawable.songs));
        songLists.add(new SongList("0:53", getString(R.string.a_song_4), R.drawable.songs));

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

        //Set onclick to open next activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                //Set loop to open each section activity
                for (int i = 0; i < 4; i++)

                    if (position == i) {
                        Intent myIntent = new Intent(view.getContext(), moanadisc.class);
                        startActivityForResult(myIntent, 0);
                    }

                for (int i = 4; i < 8; i++)

                    if (position == i) {
                        Intent myIntent = new Intent(view.getContext(), frozendisc.class);
                        startActivityForResult(myIntent, 0);
                    }

                for (int i = 8; i < 11; i++)

                    if (position == i) {
                        Intent myIntent = new Intent(view.getContext(), aladdindisc.class);
                        startActivityForResult(myIntent, 0);
                    }


            }


        });
    }
}




