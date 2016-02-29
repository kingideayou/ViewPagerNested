package me.next.viewpagernested;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.next.viewpagernested.adapter.ViewPagerAdapterMain;
import me.next.viewpagernested.view.MainViewPager;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.viewpager_main)
    MainViewPager viewPagerMain;
    @Bind(R.id.tabs)
    PagerSlidingTabStrip tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        viewPagerMain.setAdapter(new ViewPagerAdapterMain(getSupportFragmentManager()));
        tabs.setViewPager(viewPagerMain);
    }

}
