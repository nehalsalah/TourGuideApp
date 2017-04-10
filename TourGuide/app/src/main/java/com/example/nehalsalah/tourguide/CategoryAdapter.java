package com.example.nehalsalah.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    final private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CairoFragment();
        } else if (position == 1) {
            return new AlexandriaFragment();
        } else if (position == 2) {
            return new LuxorFragment();
        } else {
            return new AswanFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Cairo);
        } else if (position == 1) {
            return mContext.getString(R.string.category_Alexandria);
        } else if (position == 2) {
            return mContext.getString(R.string.category_Luxor);
        } else {
            return mContext.getString(R.string.category_Aswan);
        }
    }
}