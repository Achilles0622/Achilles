package com.example.application;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class TabViewPagerActivity extends AppCompatActivity implements TabHost.TabContentFactory {

    private TabHost mtabHost;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_viewpager);
        mtabHost = (TabHost) findViewById(R.id.tab_host);
        mtabHost.setup();
        int[]titleIDs={R.string.home,R.string.message,R.string.me};
        int[]drawableIDs={R.drawable.color_main_tab_txt,R.drawable.color_main_tab_txt,R.drawable.color_main_tab_txt};
        //数据和视图相结合
        for (int index = 0; index <titleIDs.length ; index++) {
          View view=getLayoutInflater().inflate(R.layout.main_tan_layout,null,false);
            ImageView icon=(ImageView) view.findViewById(R.id.main_tab_icon);
            TextView title=(TextView) view.findViewById(R.id.main_tab_txt);
            View tab=view.findViewById(R.id.tab_bg);

            icon.setImageResource(drawableIDs[index]);
            title.setText(titleIDs[index]);
            tab.setBackgroundColor(getResources().getColor(R.color.white));
            mtabHost.addTab(mtabHost.newTabSpec(getString(titleIDs[index]))
                    .setIndicator(view)
                    .setContent(this)
            );

        }
//三个fragment组成的viewpager
        Fragment[] fragments = new Fragment[]{
                TestFragment.newInstance("home"),
                TestFragment.newInstance("message"),
                TestFragment.newInstance("me")
        };
        //初始化布局

        //
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments[position];
            }

            @Override
            public int getCount() {
                return fragments.length;
            }
        });

    }

    @Override
    public View createTabContent(String s) {
        View view =new View(this);
        view.setMinimumHeight(0);
        view.setMinimumWidth(0);
        return view;
    }
}
