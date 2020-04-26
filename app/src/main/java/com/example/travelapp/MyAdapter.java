package com.example.travelapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int tabcount;

    public MyAdapter(Context context, FragmentManager fm, int tabcount) {
        super(fm);
        this.context = context;
        this.tabcount = tabcount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return (new Home());
            case 1:
                return (new Lakes());
            case 2:
                return (new PetrolStation());
            case 3:
                return (new Hospital());
        }
        return (new Home());
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
