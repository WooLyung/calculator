package com.example.calculator;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tool_a:
                displayFragment.expression.setText(displayFragment.expression.getText().toString() + "a");
                displayFragment.result.setText("");
                return true;
            case R.id.tool_result:
                adapter.baseFragment.calc(displayFragment.expression.getText().toString());
                return true;
            case R.id.tool_x:
                displayFragment.expression.setText(displayFragment.expression.getText().toString() + "x");
                displayFragment.result.setText("");
                return true;
            default:
                return super.onOptionsItemSelected(item) ;
        }
    }
}
