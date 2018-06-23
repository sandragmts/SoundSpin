package com.example.android.soundspin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList<SongList> songLists) {
        super(context, 0, songLists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get songList from the two different lists:
        SongList songList = (SongList) getItem(position);

        //Miwok textviews
        TextView mainTextView = listItemView.findViewById(R.id.main_name);
        mainTextView.setText(songList.getMainView());

        //English textviews
        TextView defaultTextView = listItemView.findViewById(R.id.default_name);
        defaultTextView.setText(songList.getmDefaultView());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(songList.getImageResourceId());

        return listItemView;


    }
}