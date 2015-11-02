package com.android.ngynstvn.slidingtablayouttest.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ngynstvn.slidingtablayouttest.R;

/**
 * Created by Ngynstvn on 10/30/15.
 */

public class TestFragment1 extends Fragment {

    private static final String TAG = TestFragment1.class.getSimpleName();

    public static TestFragment1 newInstance(int position) {
        TestFragment1 testFragment1 = new TestFragment1();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        testFragment1.setArguments(bundle);
        return testFragment1;
    }

    @Override
    public void onAttach(Activity activity) {
        Log.e(TAG, "onAttach() API <= 22 called");
        super.onAttach(activity);
    }

    @Override
    public void onAttach(Context context) {
        Log.e(TAG, "onAttach() API > 23 called");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView() called");
        View view = inflater.inflate(R.layout.fragment_test_1, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_test_fragment_1);
        textView.setText("Test Fragment " + (getArguments().getInt("position") + 1));
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.e(TAG, "onActivityCreated() called");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        Log.e(TAG, "onResume() called");
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.e(TAG, "onSaveInstanceState() called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause() called");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "onDestroyView() called");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy() called");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach() called");
        super.onDetach();
    }

}
