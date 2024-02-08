package com.example.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends AppCompatActivity {

    private ViewPager mviewPager;
    private int[] mLayoutIDs = {
            R.layout.view_1,
            R.layout.view_2,
            R.layout.view_3,

    };
    private List<View> mViews;
    private ViewGroup mDotViewGroup;
    private List<ImageView> mDotViews=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        mviewPager = (ViewPager) findViewById(R.id.view_pager);
        mDotViewGroup=(ViewGroup) findViewById(R.id.dot_layout);
        mViews = new ArrayList<>();
        for (int index = 0; index < mLayoutIDs.length; index++) {
//            final View view = getLayoutInflater().inflate(mLayoutIDs[index], null);
//            mViews.add(view);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.ic_launcher);
            mViews.add(imageView);
            ImageView dot=new ImageView(this);
            dot.setImageResource(R.mipmap.ic_launcher);
            dot.setMaxWidth(100);
            dot.setMaxHeight(100);
            LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(20,20);
            layoutParams.leftMargin=20;
            dot.setLayoutParams(layoutParams);
            dot.setEnabled(false);
            mDotViewGroup.addView(dot);


        }
        //数据 创建
        mviewPager.setAdapter(mPagerAdapter);
        mviewPager.setOffscreenPageLimit(4);
        mviewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int index = 0; index <mDotViews.size(); index++) {
                    mDotViews.get(index).setImageResource(position==index ? R.mipmap.ic_launcher_round: R.drawable.ic_launcher_foreground);

                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
    PagerAdapter mPagerAdapter=new PagerAdapter() {
        @Override
        public int getCount() {
            return mLayoutIDs.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view==object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            View child=mViews.get(position);
            container.addView(child);
            return child;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView(mViews.get(position));
        }
    };
}