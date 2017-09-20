package com.example.fullstack.appfoody.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.fullstack.appfoody.R;
import com.example.fullstack.appfoody.adapter.AdapterViewPageHomePage;

/**
 * Created by FullStack on 9/16/2017.
 */

public class HomePageActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {
    ViewPager viewPager;
    AdapterViewPageHomePage adapterViewPageHomePage;
    RadioButton rd_anGi, rd_Odau;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home_page);
        viewPager = (ViewPager) findViewById(R.id.viewPageIntent);
        rd_anGi = (RadioButton) findViewById(R.id.rd_angi);
        rd_Odau = (RadioButton) findViewById(R.id.rd_odau);
        radioGroup = (RadioGroup) findViewById(R.id.groupOdauAngi);
        adapterViewPageHomePage = new AdapterViewPageHomePage(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPageHomePage);
        viewPager.setOnPageChangeListener(this);
        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                rd_Odau.setChecked(true);
                break;
            case 1:
                rd_anGi.setChecked(true);
                break;
        }
        Log.d("ket qua", position + "");
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.rd_odau:
                viewPager.setCurrentItem(0);
                break;
            case R.id.rd_angi:
                viewPager.setCurrentItem(1);
                break;
        }
    }
}
