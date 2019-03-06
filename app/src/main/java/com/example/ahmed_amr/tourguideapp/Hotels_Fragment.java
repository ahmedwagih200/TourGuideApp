package com.example.ahmed_amr.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotels_Fragment extends Fragment {


    public Hotels_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);
        ArrayList Hotels = new ArrayList<Locations>();
        Hotels.add(new Locations(getString(R.string.FourSeasonsHotel),getString(R.string.AlexandriaatSanStefano),R.drawable.fourseasonshotel));
        Hotels.add(new Locations(getString(R.string.KempinskiNileHotel),getString(R.string.GardenCityCairo),R.drawable.kempinskinilehotel));
        Hotels.add(new Locations(getString(R.string.RixosSeagate),getString(R.string.shram),R.drawable.rixosseagate));

        Locations_Adapter adapter = new Locations_Adapter(getActivity(),Hotels);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return  rootView ;

    }
}

