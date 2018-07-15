package com.example.aloknath.darshanapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;
    public PagerAdapter(FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                FoodActivity foodActivity = new FoodActivity();
                return foodActivity;
            case 1:
                HotelsActivity hotelsActivity = new HotelsActivity();
                return hotelsActivity;
            case 2:
                SightsActivity sightsActivity = new SightsActivity();
                return sightsActivity;
            case 3:
                HistoryActivity historyActivity = new HistoryActivity();
                return historyActivity;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
