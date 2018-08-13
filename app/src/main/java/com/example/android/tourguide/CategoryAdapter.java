package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by euenia on 2018-08-01.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.nature);
        else if (position == 1)
            return mContext.getString(R.string.culture);
        else if (position == 2)
            return mContext.getString(R.string.activity);
        else
            return mContext.getString(R.string.food);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new NatureFragment();
        else if (position == 1)
            return new CultureFragment();
        else if (position == 2)
            return new ActivityFragment();
        else
            return new FoodFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}

