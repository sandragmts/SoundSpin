package com.example.android.soundspin;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class songs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("3:24", "Where You Are", R.drawable.songs));
        words.add(new Word("2:41", "How Far I'll Go", R.drawable.songs));
        words.add(new Word("2:42", "You're Welcome", R.drawable.songs));
        words.add(new Word("3:00", "Shiny", R.drawable.songs));
        words.add(new Word("3:25", "Do You Wanna Build A Snowman?", R.drawable.songs));
        words.add(new Word("1:51", "In Summer", R.drawable.songs));
        words.add(new Word("2:05", "Love Is An Open Door", R.drawable.songs));
        words.add(new Word("3:43", "Let It Go", R.drawable.songs));
        words.add(new Word("1:17", "Arabian Nights", R.drawable.songs));
        words.add(new Word("2:20", "One Jump Ahead", R.drawable.songs));
        words.add(new Word("2:39", "Whole New World", R.drawable.songs));
        words.add(new Word("0:53", "Prince Ali", R.drawable.songs));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
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




