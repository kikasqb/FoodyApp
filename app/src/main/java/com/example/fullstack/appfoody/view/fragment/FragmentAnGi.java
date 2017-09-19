package com.example.fullstack.appfoody.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fullstack.appfoody.R;

/**
 * Created by FullStack on 9/20/2017.
 */

public class FragmentAnGi extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_angi, container, false);
        return view;
    }
}
