package com.example.fullstack.appfoody.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.RadioButton;

import com.example.fullstack.appfoody.R;
import com.example.fullstack.appfoody.adapter.AdapterViewPageHomePage;

/**
 * Created by FullStack on 9/16/2017.
 */

public class HomePageActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    ViewPager viewPager;
    AdapterViewPageHomePage adapterViewPageHomePage;
    RadioButton rd_anGi,rd_Odau;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home_page);
        viewPager = (ViewPager) findViewById(R.id.viewPageIntent);
        rd_anGi = (RadioButton) findViewById(R.id.rd_angi);
        rd_Odau = (RadioButton) findViewById(R.id.rd_odau);
        adapterViewPageHomePage = new AdapterViewPageHomePage(getSupportFragmentManager());
        viewPager.setAdapter(adapterViewPageHomePage);
        viewPager.setOnPageChangeListener(this);

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
}
