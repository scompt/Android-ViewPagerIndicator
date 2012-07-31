package com.viewpagerindicator.sample;

import android.support.v4.app.FragmentManager;
import com.viewpagerindicator.IconProvider;

/**
 * Created with IntelliJ IDEA.
 * User: edward
 * Date: 7/31/12
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTitleFragmentAdapterWithIcons extends TestTitleFragmentAdapter implements IconProvider {
    public TestTitleFragmentAdapterWithIcons(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getIcon(int position) {
        return R.drawable.icon;
    }
}
