package com.example.android.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * author of images:
 * Agata Uliszak
 */

public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        // Create a list of attractions
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.string.pol_wetlinska, R.string.pol_wet_localization, R.drawable.wetlinska, R.string.pol_wet_description));
        places.add(new Place(R.string.pol_carynska, R.string.pol_car_localization, R.drawable.carynska, R.string.pol_car_description));
        places.add(new Place(R.string.otryt, R.string.otryt_localization, R.drawable.otryt, R.string.otryt_description));
        places.add(new Place(R.string.wolosaty, R.string.wolosaty_localization, R.drawable.wolosaty, R.string.wolosaty_description));

        //Create an PlaceAdapter, whose data source is a list of places.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        //Find the ListView object in the view hierarchy of the {@link Activity}.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the PlaceAdapter.
        listView.setAdapter(adapter);

        // When listView is clicked, item data is sent to new activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View v, int p, long id) {
                                                Place place = (Place) listView.getItemAtPosition(p);
                                                Intent currentPlace = new Intent(getActivity(), CurrentPlace.class);
                                                currentPlace.putExtra("R.string.name_key", getString(place.getName()));
                                                currentPlace.putExtra("R.string.localization_key", getString(place.getLocalization()));
                                                currentPlace.putExtra("R.string.image_key", place.getImage());
                                                currentPlace.putExtra("R.string.description_key", getString(place.getDescription()));
                                                startActivity(currentPlace);
                                            }
                                        }
        );

        return rootView;
    }

}
