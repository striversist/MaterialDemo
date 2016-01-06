package com.creator.materialdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by aarontang on 2015/12/30.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int COUNT = 5;
    private String[] titles = new String[] {"Tab1111", "Tab22222", "Tab333333", "Tab444444", "Tab5555555"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(String.valueOf(position + 1), "");
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
