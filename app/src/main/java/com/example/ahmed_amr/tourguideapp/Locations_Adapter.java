package com.example.ahmed_amr.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Locations_Adapter extends ArrayAdapter<Locations> {

    public Locations_Adapter (Activity context , ArrayList<Locations> locations)
    {
        super(context,0 ,locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Locations currentLocation = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentLocation.getLocation_name());

        TextView address = listItemView.findViewById(R.id.address);
        address.setText(currentLocation.getLocation_address());

        TextView phone =listItemView.findViewById(R.id.phone);
        if (currentLocation.Check_for_Phone())
            phone.setVisibility(View.GONE);
        else
        {
            phone.setText(currentLocation.getPhone_number());
        }

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentLocation.getLocation_picture());

        return listItemView ;
    }
}
