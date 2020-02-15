package com.ecut.huandong.sport_fragment;

import androidx.lifecycle.ViewModelProviders;

import android.graphics.Rect;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ecut.huandong.R;
import com.ecut.huandong.adapters.sport_FirstFragmentAdapter;

import java.util.List;

public class FirstFragment extends Fragment {

    private FirstViewModel mViewModel;
    private RecyclerView mRec;
    private static final String TAG = "FirstFragment";



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view =inflater.inflate(R.layout.first_fragment, container, false);
        mRec= view.findViewById(R.id.recycle_view);
        mRec.setLayoutManager(new LinearLayoutManager(getContext()));
        mRec.addItemDecoration(new MyDecoration());  //设置间隔线
        mRec.setAdapter(new sport_FirstFragmentAdapter(getContext()));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FirstViewModel.class);

        // TODO: Use the ViewModel
    }

    //设置用于间隔线的类
    class MyDecoration extends RecyclerView.ItemDecoration
    {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));//设置间隔线，间隔线宽度参考value文件夹中的firstFragment_demon文件
        }
    }

}
