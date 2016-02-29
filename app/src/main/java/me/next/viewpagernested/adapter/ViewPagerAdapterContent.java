package me.next.viewpagernested.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import me.next.viewpagernested.fragment.TextContentFragment;

/**
 * Created by NeXT on 16/2/29.
 * ViewPagerNested
 */
public class ViewPagerAdapterContent extends FragmentPagerAdapter {

    private static final String[] TITLES = {"Tab a", "Tab b", "Tab c"};
    private static final int PAGER_COUNT = 3;

    public ViewPagerAdapterContent(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TextContentFragment.newInstance("" + position, "" + position);
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
