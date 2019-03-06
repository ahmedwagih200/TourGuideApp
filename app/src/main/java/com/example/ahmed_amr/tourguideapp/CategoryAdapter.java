package com.example.ahmed_amr.tourguideapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
        {
            return new TouristAttractions_Fragment();
        }
        else if (position == 1)
        {
            return new Hotels_Fragment();
        }
        else if (position == 2)
        {
            return new Museums_Fragment();
        }
        else
        {
            return new Restaurants_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 4 ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.TouristAttractions);
        } else if (position == 1) {
            return mContext.getString(R.string.Hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.Museums);
        } else {
            return mContext.getString(R.string.Restaurants);
        }
    }
}
