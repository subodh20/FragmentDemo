package com.example.dell.fragmentdemo;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
public class TopSecFragment extends Fragment{
    private static EditText topSecEt;
    private static EditText bottomSecEt;
    TopSectionListener activityCommander;
    public interface TopSectionListener
    {
       public void createMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =inflater.inflate(R.layout.bottom_sec_fragment,container,false);
        topSecEt=(EditText)view.findViewById(R.id.top_et);
        bottomSecEt=(EditText)view.findViewById(R.id.bottom_et);
        final Button button=(Button) view.findViewById(R.id.clickBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }
    public void buttonClicked(View view)
    {
activityCommander.createMeme(topSecEt.getText().toString(),bottomSecEt.getText().toString());
    }
}
