package com.example.dell.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
public class BottomSecFragment extends Fragment {
    private static TextView topTv;
    private static TextView bottomTv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.top_sec_fragment,container,false);
        topTv=(TextView)view.findViewById(R.id.top_tv);
        bottomTv=(TextView)view.findViewById(R.id.bottom_tv);
        return view;
    }
    public void setMemeText(String top,String bottom)
    {
        topTv.setText(top);
        bottomTv.setText(bottom);
    }
}
