package com.vigneshtraining.assignment64;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by vimadhavan on 4/8/2017.
 */

public class TabPageAdapter extends FragmentPagerAdapter {

    private String[] data;

    public TabPageAdapter(FragmentManager fm,String[] data) {
        super(fm);
        this.data=data;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return data[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (data[position]){
            case "Audio":
                return new AudioFragment();

            case "Video":
                return new VideoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
