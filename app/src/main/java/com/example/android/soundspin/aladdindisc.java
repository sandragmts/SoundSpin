package com.example.android.soundspin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class aladdindisc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create list of songLists:
        ArrayList<SongList> songLists = new ArrayList<SongList>();
        songLists.add(new SongList("4 songs", "Disney Aladdin", R.drawable.aladdin));

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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()

        {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(view.getContext(), aladdinsongs.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}

