package com.example.ahmed_amr.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TouristAttractions_Fragment extends Fragment {


    public TouristAttractions_Fragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList  TouristAttractions = new ArrayList<Locations>();
            TouristAttractions.add(new Locations(getString(R.string.Karnak),getString(R.string.Giza),R.drawable.d));
            TouristAttractions.add(new Locations(getString(R.string.GreatSphinxofGiza),getString(R.string.Giza),R.drawable.f));
            TouristAttractions.add(new Locations(getString(R.string.AbuSimbeltemples),getString(R.string.cairo),R.drawable.g));

        Locations_Adapter adapter = new Locations_Adapter(getActivity(),TouristAttractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return  rootView ;
    }

}
