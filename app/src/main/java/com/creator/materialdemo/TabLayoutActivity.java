package com.creator.materialdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * 目的：TabLayout和ViewPager结合的基本用法
 */
public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        findViewById();
        initViews();
    }

    public void findViewById() {

    }

    public void initViews() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        if (tabLayout.getTabCount() > 0) {
            tabLayout.getTabAt(0).setCustomView(R.layout.custom_tab);
        }

        testSnackbar();
    }

    private void testSnackbar() {
        Snackbar.make(getWindow().getDecorView(), "Snackbar comes out", Snackbar.LENGTH_LONG).show();
    }
}
