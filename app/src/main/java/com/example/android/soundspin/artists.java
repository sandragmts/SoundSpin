package com.example.android.soundspin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("1 song", "Christopher Jackson, Rachel House +3", R.drawable.singer));
        words.add(new Word("1 song", "Auli'i Cravalho", R.drawable.singer));
        words.add(new Word("1 song", "Dwayne Johnson", R.drawable.singer));
        words.add(new Word("1 song", "Jamaine Clement", R.drawable.singer));
        words.add(new Word("1 song", "Kristen Bell, Agatha Lee Monn +1", R.drawable.singer));
        words.add(new Word("1 song", "Josh Gad", R.drawable.singer));
        words.add(new Word("1 song", "Kristen Bell, Santino Fontana", R.drawable.singer));
        words.add(new Word("1 song", "Idina Menzel",R.drawable.singer));
        words.add(new Word("1 song ", "Bruce Adler", R.drawable.singer));
        words.add(new Word("1 song", "Brad Kane", R.drawable.singer));
        words.add(new Word("1 song ", "Bruce Adler, Lea Salong", R.drawable.singer));
        words.add(new Word("1 song", "Jonathan Freeman", R.drawable.singer));

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

                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 10) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 11) {
                    Intent myIntent = new Intent(view.getContext(), albums.class);
                    startActivityForResult(myIntent, 0);
                }

            }

        });


    }
}



