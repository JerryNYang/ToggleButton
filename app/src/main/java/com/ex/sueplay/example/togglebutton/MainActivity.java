package com.ex.sueplay.example.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton mToggleButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView)findViewById(R.id.peekaBooTextID);
        mToggleButton = (ToggleButton)findViewById(R.id.toggleButtonID);

        mToggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    // Toggle button enable
                    resultView.setVisibility(View.VISIBLE);
                }

                else
                {
                    // Toggle button disable
                    resultView.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
