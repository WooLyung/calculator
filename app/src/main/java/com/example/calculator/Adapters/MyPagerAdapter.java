package com.example.calculator.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.calculator.Fragments.BaseFragment;
import com.example.calculator.Fragments.DisplayFragment;
import com.example.calculator.Fragments.RecordFragment;
import com.example.calculator.Fragments.VarFragment;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm, DisplayFragment displayFragment) {
        super(fm);

        BaseFragment baseFragment = new BaseFragment();
        VarFragment varFragment = new VarFragment();
        RecordFragment recordFragment = new RecordFragment();

        baseFragment.displayFragment = displayFragment;
        baseFragment.recordFragment = recordFragment;

        fragments.add(baseFragment);
        fragments.add(varFragment);
        fragments.add(recordFragment);

        titles.add("계산");
        titles.add("변수");
        titles.add("기록");
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
