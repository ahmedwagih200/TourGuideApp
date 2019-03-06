package com.example.ahmed_amr.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Restaurants_Fragment extends Fragment {

    public Restaurants_Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList Restaurants = new ArrayList<Locations>();
        Restaurants.add(new Locations(getString(R.string.TablaLuna),getString(R.string.Giza) ,R.drawable.a,"0225198403"));
        Restaurants.add(new Locations(getString(R.string.ABOUELSID),getString(R.string.cairo),R.drawable.b,"0227359640"));
        Restaurants.add(new Locations(getString(R.string.OakGrill),getString(R.string.Giza),R.drawable.c,"0225808440"));

        Locations_Adapter adapter = new Locations_Adapter(getActivity(),Restaurants);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
