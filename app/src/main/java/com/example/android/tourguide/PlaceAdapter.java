package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.security.Security;
import java.util.ArrayList;

/**
 * Created by euenia on 2018-08-01.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> PlaceList) {
        super(context, 0, PlaceList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Place currentPlace = getItem(position);
        TextView Name = listItemView.findViewById(R.id.name_text_view);
        Name.setText(currentPlace.getName());
        TextView Loc = listItemView.findViewById(R.id.localization_text_view);
        Loc.setText(currentPlace.getLocalization());
        ImageView photo = listItemView.findViewById(R.id.image_view);
        photo.setImageResource(currentPlace.getImage());

        return listItemView;
    }
}

