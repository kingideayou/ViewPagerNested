package me.next.viewpagernested.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by NeXT on 16/2/29.
 * ViewPagerNested
 */
public class MainViewPager extends ViewPager {

    public MainViewPager(Context context) {
        super(context);
    }

    public MainViewPager(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    /*
    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        return v != this && v instanceof ViewPager || super.canScroll(v, checkV, dx, x, y);
    }
    */

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        if(v != this && v instanceof ViewPager) {
            int currentItem = ((ViewPager) v).getCurrentItem();
            int countItem = ((ViewPager) v).getAdapter().getCount();
            if((currentItem == (countItem-1) && dx<0) || (currentItem==0 && dx>0)){
                return false;
            }
            return true;
        }
        return super.canScroll(v, checkV, dx, x, y);
    }
}
