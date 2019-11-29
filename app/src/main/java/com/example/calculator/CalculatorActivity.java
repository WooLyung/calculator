package com.example.calculator;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.calculator.Adapters.MyPagerAdapter;
import com.example.calculator.Fragments.DisplayFragment;

public class CalculatorActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter adapter;
    DisplayFragment displayFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayFragment = (DisplayFragment) getSupportFragmentManager().getFragments().get(0);
        adapter = new MyPagerAdapter(getSupportFragmentManager(), displayFragment);

        viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }
}
