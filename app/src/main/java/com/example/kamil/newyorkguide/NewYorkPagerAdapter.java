package com.example.kamil.newyorkguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Kamil on 2018-02-27.
 */

public class NewYorkPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 3;

    private String tabTitles[] = new String[]{
            MuseumFragment.NAME,
            RestaurantFragment.NAME,
            SightFragment.NAME};

    private Context mContext;

    public NewYorkPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, MuseumFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, RestaurantFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, SightFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}