package com.lsw.plugin1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lsw.pluginlibrary.BaseFragment;

public class Fragment2 extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        if (getArguments() != null) {
            String username = getArguments().getString("username");
            TextView tv =  (TextView)view.findViewById(R.id.label);
            tv.setText(username);
        }

        view.findViewById(R.id.btnReturn).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //从栈中将当前fragment推出
                getFragmentManager().popBackStack();
            }
        });

        return view;
    }
}