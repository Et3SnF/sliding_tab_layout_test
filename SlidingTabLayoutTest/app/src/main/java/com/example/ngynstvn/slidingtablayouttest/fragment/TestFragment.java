package com.example.ngynstvn.slidingtablayouttest.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ngynstvn.slidingtablayouttest.R;

/**
 * Created by Ngynstvn on 10/30/15.
 */
public class TestFragment extends Fragment {

    public static TestFragment newInstance(int position) {
        TestFragment testFragment = new TestFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        testFragment.setArguments(bundle);
        return testFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test_1, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_test_fragment);
        textView.setText("Test Fragment " + (getArguments().getInt("position") + 1));
        return view;
    }
}
