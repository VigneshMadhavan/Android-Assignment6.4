package com.vigneshtraining.assignment64;

import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener,OnPageChangeListener {

    private ViewPager viewPager;
    private TabPageAdapter mAdapter;
    private Toolbar actionBar;
    private TabLayout tabLayout;
    private String[] tabs = { "Audio", "Video"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionBar = (Toolbar) findViewById(R.id.toolBar);
        //setSupportActionBar(actionBar);


        viewPager =(ViewPager) findViewById(R.id.myPager);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mAdapter= new TabPageAdapter(getSupportFragmentManager(),tabs);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager.setAdapter(mAdapter);



        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(android.R.drawable.sym_def_app_icon);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.sym_def_app_icon);




    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //actionBar.setSelectedNavigationItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
