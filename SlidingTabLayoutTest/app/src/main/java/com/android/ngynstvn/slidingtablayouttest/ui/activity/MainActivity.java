package com.android.ngynstvn.slidingtablayouttest.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.android.ngynstvn.slidingtablayouttest.R;
import com.android.ngynstvn.slidingtablayouttest.ui.adapter.TestPageAdapter;
import com.android.ngynstvn.slidingtablayouttest.ui.tabs.SlidingTabLayout;

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

        // For toolbar

        toolbar = (Toolbar) findViewById(R.id.tb_activity_main);
        setSupportActionBar(toolbar);

        // Tab related methods

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

}
