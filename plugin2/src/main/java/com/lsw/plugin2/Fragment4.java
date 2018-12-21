package com.lsw.plugin2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsw.pluginlibrary.BaseFragment;


public class Fragment4 extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4, container, false);

        if (getArguments() != null) {
            String username = getArguments().getString("username");
            TextView tv =  (TextView)view.findViewById(R.id.label);
            tv.setText(username);
        }

        return view;
    }
}