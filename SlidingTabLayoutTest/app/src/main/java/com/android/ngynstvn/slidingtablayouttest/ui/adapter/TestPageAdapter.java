package com.android.ngynstvn.slidingtablayouttest.ui.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.util.Log;

import com.android.ngynstvn.slidingtablayouttest.ui.fragment.TestFragment1;
import com.android.ngynstvn.slidingtablayouttest.ui.fragment.TestFragment2;
import com.android.ngynstvn.slidingtablayouttest.ui.fragment.TestFragment3;

/**
 * Created by Ngynstvn on 10/30/15.
 */

public class TestPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = TestPageAdapter.class.getSimpleName();

    String[] tabNames;

    public TestPageAdapter(FragmentManager fm) {
        super(fm);
        tabNames = new String[]{"Test 1", "Test 2", "Test 3"};
    }

    @Override
    public Fragment getItem(int position) {

        Log.v(TAG, "Current position: " + position);

        TestFragment1 testFragment1 = TestFragment1.newInstance(position);
        TestFragment2 testFragment2 = TestFragment2.newInstance(position);
        TestFragment3 testFragment3 = TestFragment3.newInstance(position);

        try {
            if(position == 0) {
                return testFragment1;
            }
            else if(position == 1) {
                return testFragment2;
            }
            else if(position == 2) {
                return testFragment3;
            }

            return null;
        }
        catch (NullPointerException e) {
            Log.v(TAG, "Unable to call Fragment " + position);
            return testFragment1;
        }
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