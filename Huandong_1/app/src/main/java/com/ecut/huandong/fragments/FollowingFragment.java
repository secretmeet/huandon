package com.ecut.huandong.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecut.huandong.R;
import com.ecut.huandong.base.BaseFragment;

public class FollowingFragment extends BaseFragment {
    View mRootView;

    @Override
    protected View onSubViewLoaded(LayoutInflater layoutInflater, ViewGroup container) {
        mRootView = layoutInflater.inflate(R.layout.fragment_following,container,false);
        return mRootView;
    }
}
