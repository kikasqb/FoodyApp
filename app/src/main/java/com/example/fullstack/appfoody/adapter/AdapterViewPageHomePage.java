package com.example.fullstack.appfoody.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fullstack.appfoody.view.fragment.FragmentAnGi;
import com.example.fullstack.appfoody.view.fragment.FragmentOdau;

/**
 * Created by FullStack on 9/20/2017.
 */

public class AdapterViewPageHomePage extends FragmentStatePagerAdapter {
    FragmentAnGi fragmentAnGi;
    FragmentOdau fragmentOdau;

    public AdapterViewPageHomePage(FragmentManager fm) {
        super(fm);
        fragmentAnGi = new FragmentAnGi();
        fragmentOdau = new FragmentOdau();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragmentOdau;
            case 1:
                return fragmentAnGi;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
