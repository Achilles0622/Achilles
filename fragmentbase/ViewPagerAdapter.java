package com.example.fragmentbase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder> {
    private List<String> titles = new ArrayList<>();
    private List<Integer> colors = new ArrayList<>();

    public ViewPagerAdapter() {
        titles.add("こんにちは");
        titles.add("こんばんは");
        titles.add("ご飯を食べます");
        titles.add("寝ます");
        titles.add("歩いている");
        titles.add("りんご");
        titles.add("明日");
        titles.add("月曜日");
        titles.add("火曜日");
        titles.add("水曜日です");
        colors.add(R.color.white);
        colors.add(R.color.red);
        colors.add(R.color.black);
        colors.add(R.color.colorPrimary);
        colors.add(androidx.cardview.R.color.cardview_shadow_end_color);
        colors.add(androidx.cardview.R.color.cardview_dark_background);
        colors.add(com.google.android.material.R.color.cardview_shadow_start_color);
        colors.add(com.google.android.material.R.color.design_default_color_error);
        colors.add(com.google.android.material.R.color.design_default_color_secondary_variant);
        colors.add(R.color.white);
        colors.add(R.color.colorPrimary);


    }

    @NonNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pager, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerViewHolder holder, int position) {
        holder.mTv.setText(titles.get(position));
        holder.mContainer.setBackgroundResource(colors.get(position));

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewPagerViewHolder extends RecyclerView.ViewHolder {
        TextView mTv;
        RelativeLayout mContainer;

        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            mContainer = itemView.findViewById(R.id.container);
            mTv = itemView.findViewById(R.id.tvTitle);
        }
    }
}
