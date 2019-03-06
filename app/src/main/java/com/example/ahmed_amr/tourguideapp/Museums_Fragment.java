package com.example.ahmed_amr.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Museums_Fragment extends Fragment {


    public Museums_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList Museums = new ArrayList<Locations>();
        Museums.add(new Locations(getString(R.string.CopticMuseum),getString(R.string.MisrlQadimah),R.drawable.copticmuseum));
        Museums.add(new Locations(getString(R.string.SayedahZeinab),getString(R.string.AlHaram),R.drawable.gayerandersonmuseum));
        Museums.add(new Locations(getString(R.string.MuseumofIslamicArt),getString(R.string.AlHaram),R.drawable.museumofislamic));
        Locations_Adapter adapter = new Locations_Adapter(getActivity(),Museums);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return  rootView ;

    }

}
