package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        gameView = findViewById(R.id.game);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_left:
                Log.d("MainActivity", "onClick: left");
                gameView.moveLeft();
                //gameView.setPosX(gameView.getPosX()-100);
                //gameView.invalidate();
                break;
            case R.id.arrow_right:
                Log.d("MainActivity", "onClick: right");
                gameView.moveRight();
                //gameView.setPosX(gameView.getPosX()+100);
                // gameView.invalidate();
                break;
            case R.id.arrow_up:
                Log.d("MainActivity", "onClick: up" );
                gameView.moveUp();
                //gameView.setPosY(gameView.getPosY()-100);
                //gameView.invalidate();
                break;
            case R.id.arrow_down:
                gameView.moveDown();
                Log.d("MainActivity", "onClick: down");
                //gameView.setPosY(gameView.getPosY()+100);
                //gameView.invalidate();
                break;
        }

    }
}
