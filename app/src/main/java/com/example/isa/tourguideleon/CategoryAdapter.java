package com.example.isa.tourguideleon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ISA on 15/02/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_monuments);
        } else if (position == 1) {
            return mContext.getString(R.string.category_gastronomy);
        } else if (position == 2) {
            return mContext.getString(R.string.category_tapas);
        } else {
            return mContext.getString(R.string.category_more);
        }
    }

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1) {
            return new GastronomyFragment();
        } else if (position == 2) {
            return new TapasFragment();
        } else {
            return new MoreFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
