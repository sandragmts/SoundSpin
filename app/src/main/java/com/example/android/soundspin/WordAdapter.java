package com.example.android.soundspin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    public WordAdapter(Context context, ArrayList<Word> Words) {
        super(context, 0, Words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get word from the two different lists:
        Word word = (Word) getItem(position);

        //Miwok textviews
        TextView mainTextView = (TextView) listItemView.findViewById(R.id.main_name);
        mainTextView.setText(word.getMainView());

        //English textviews
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_name);
        defaultTextView.setText(word.getmDefaultView());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(word.getImageResourceId());

        return listItemView;


    }
}