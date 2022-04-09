package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    LinearLayout LinearLayout;
    Button btn;
    Switch sw;
    ToggleButton tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout = (LinearLayout) findViewById(R.id.change);
        btn = (Button) findViewById(R.id.button);
        sw = (Switch) findViewById(R.id.switch1);
        tb = (ToggleButton) findViewById(R.id.toggleButton1);

    }

    public void test(View view) {
        if(tb.isChecked() && sw.isChecked()){
            LinearLayout.setBackgroundColor(Color.RED);
        }
        if(!tb.isChecked() && sw.isChecked()){
            LinearLayout.setBackgroundColor(Color.GREEN);
        }
        if(tb.isChecked() && !sw.isChecked()){
            LinearLayout.setBackgroundColor(Color.BLUE);
        }
        if(!tb.isChecked() && !sw.isChecked()){
            LinearLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}