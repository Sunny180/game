package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_left:
                Log.d("MainActivity", "onClick: left");
                break;
            case R.id.arrow_right:
                Log.d("MainActivity", "onClick: right");
                break;
            case R.id.arrow_up:
                Log.d("MainActivity", "onClick: up" );
                break;
            case R.id.arrow_down:
                Log.d("MainActivity", "onClick: down");
                break;
        }

    }
}
