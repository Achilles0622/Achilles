package com.example.application;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //如何把laytout布局转换成view
//        return super.onCreateView(inflater, container, savedInstanceState);?
        View view = inflater.inflate(R.layout.fragment_my_fragment, container, false);
        TextView text=view.findViewById(R.id.textFragment);
        text.setText("静态加载");
        return view;

    }
}
