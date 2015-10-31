package com.android.ngynstvn.slidingtablayouttest.ui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.android.ngynstvn.slidingtablayouttest.ui.fragment.TestFragment;

/**
 * Created by Ngynstvn on 10/30/15.
 */

public class TestPageAdapter extends FragmentPagerAdapter {

    String[] tabNames;

    public TestPageAdapter(FragmentManager fm) {
        super(fm);
        tabNames = new String[]{"Test 1", "Test 2", "Test 3"};
    }

    @Override
    public Fragment getItem(int position) {
        TestFragment testFragment = TestFragment.newInstance(position);
        return testFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabNames[position];
    }

    @Override
    public int getCount() {
        return tabNames.length;
    }
}