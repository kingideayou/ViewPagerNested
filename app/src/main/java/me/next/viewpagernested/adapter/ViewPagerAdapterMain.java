package me.next.viewpagernested.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.next.viewpagernested.fragment.TextFragment;
import me.next.viewpagernested.fragment.ViewPagerFragment;

/**
 * Created by NeXT on 16/2/29.
 * ViewPagerNested
 */
public class ViewPagerAdapterMain extends FragmentPagerAdapter {

    private static final String[] TITLES = {"Tab 1", "Tab 2", "Tab 3"};
    private static final int PAGER_COUNT = 3;

    public ViewPagerAdapterMain(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return ViewPagerFragment.newInstance("" + position, "" + position);
        } else {
            return TextFragment.newInstance("" + position, "" + position);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public int getCount() {
        return PAGER_COUNT;
    }

}
