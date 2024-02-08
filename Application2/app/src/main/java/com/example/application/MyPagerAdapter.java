package com.example.application;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {
    private List<View> viewList;
    private List<String>titleList;
    public MyPagerAdapter(List<View> viewList,List<String>titleList){
        this.viewList=viewList;
        this.titleList=titleList;
    }
    //返回的是页卡的数量
    @Override
    public int getCount() {
        return viewList.size();
    }
    //判断当前view对象是否来自于对象
    @Override
    public boolean isViewFromObject(@NonNull View arg0, @NonNull Object arg1) {

        return arg0==arg1;
    }
    //实例化一个页卡
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(viewList.get(position));
        return viewList.get(position);
    }
    //销毁页卡
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(viewList.get(position ));
    }
    //设置ViewPager的标题
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
