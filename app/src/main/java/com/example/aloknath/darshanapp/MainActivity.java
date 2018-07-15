package com.example.aloknath.darshanapp;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements com.example.aloknath.darshanapp.FoodActivity.OnFragmentInteractionListener,
        com.example.aloknath.darshanapp.HistoryActivity.OnFragmentInteractionListener, com.example.aloknath.darshanapp.HotelsActivity.OnFragmentInteractionListener,
        com.example.aloknath.darshanapp.SightsActivity.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.food));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.hotels));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.sights));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.history));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        final com.example.aloknath.darshanapp.PagerAdapter pagerAdapter = new com.example.aloknath.darshanapp.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
