package com.example.animationactivity.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.animationactivity.R;

public class ExpandablelistActivity extends AppCompatActivity {
    private ExpandableListView mExpandableListView;
    private BaseExpandableListAdapter mAdapter;
//    private List< >

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandablelist);

        initViews();
    }

    private void initViews() {
        mExpandableListView =findViewById(R.id.id_expandableListView);
        mExpandableListView.setAdapter(new BaseExpandableListAdapter() {
            @Override
            public int getGroupCount() {
                return 0;
            }

            @Override
            public int getChildrenCount(int i) {
                return 0;
            }

            @Override
            public Object getGroup(int i) {
                return null;
            }

            @Override
            public Object getChild(int i, int i1) {
                return null;
            }

            @Override
            public long getGroupId(int i) {
                return 0;
            }

            @Override
            public long getChildId(int i, int i1) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }

            @Override
            public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
                return null;
            }

            @Override
            public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
                return null;
            }

            @Override
            public boolean isChildSelectable(int i, int i1) {
                return false;
            }
        });
    }
}