package com.ecut.huandong.ui.sport;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.ecut.huandong.R;
import com.ecut.huandong.sport_activity.GymnasiumActivity;
import com.ecut.huandong.sport_activity.SubjectActivity;
import com.ecut.huandong.sport_activity.TrainActivity;
import com.ecut.huandong.sport_fragment.FirstFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cora
 */
public class SportFragment extends Fragment {

    private static final String TAG = "SportFragment";
    private SportViewModel sportViewModel;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sportViewModel =
                ViewModelProviders.of(this).get(SportViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sport, container, false);
        return root;
    }

    //实现fragment里面的导航项的点击事件
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        BottomNavigationView navigationView = getActivity().findViewById(R.id.bottomNavigationView);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.secondfragment:
                        Intent intent1 = new Intent(getActivity(), SubjectActivity.class);
                        startActivity(intent1);
                        Log.d(TAG, "onNavigationItemSelected: ");
                        break;
                    case R.id.thirdfragment:
                        Intent intent2 = new Intent(getActivity(), TrainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.fourthfragment:
                        Intent intent3 = new Intent(getActivity(), GymnasiumActivity.class);
                        startActivity(intent3);
                        break;
                    default:
                        break;
                }
                return false;
            }
        });


    }

}