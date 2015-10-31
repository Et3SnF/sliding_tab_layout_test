package com.example.ngynstvn.slidingtablayouttest.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.ngynstvn.slidingtablayouttest.R;
import com.example.ngynstvn.slidingtablayouttest.fragment.TestFragment;
import com.example.ngynstvn.slidingtablayouttest.tabs.SlidingTabLayout;

/**
 * Created by Ngynstvn on 10/30/15.
 */
public class MainActivity extends AppCompatActivity {

    private TestPageAdapter testPageAdapter;
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tb_activity_main);
        setSupportActionBar(toolbar);

        testPageAdapter = new TestPageAdapter(getFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.vp_test_viewpager);
        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.stl_test_tab_layout);

        viewPager.setAdapter(testPageAdapter);
        slidingTabLayout.setViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    class TestPageAdapter extends FragmentPagerAdapter {

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
}
