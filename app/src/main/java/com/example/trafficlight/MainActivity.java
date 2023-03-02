package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnChangeColorRed(View view){
        LinearLayout bgElement = findViewById(R.id.container);
        bgElement.setBackgroundColor(Color.RED);
    }
    public void onClickBtnChangeColorYellow(View view){
        LinearLayout bgElement = findViewById(R.id.container);
        bgElement.setBackgroundColor(Color.YELLOW);
    }
    public void onClickBtnChangeColorGreen(View view){
        LinearLayout bgElement = findViewById(R.id.container);
        bgElement.setBackgroundColor(Color.GREEN);
    }
    }
