package com.tom.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {

    private Bear bear;
    private Bitmap bitmapBear;
    private Bitmap bitmapBearNG;
    private Paint paint = new Paint();
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(bear == null){
            bear = new Bear(this);
            bitmapBear = BitmapFactory.decodeResource(getResources(),R.drawable.bear);
            bitmapBearNG = BitmapFactory.decodeResource(getResources(),R.drawable.bear_ng);
        }
        Log.d("Game", "onDraw: "+ getWidth() + "," + getHeight());

        //canvas.drawLine(400,0,0,600,paint);
        canvas.drawBitmap(bitmapBear, bear.getX(), bear.getY(),paint);
    }
    public void moveRight(){
        if(bear.getX() < getWidth()-150){
            bear.setDirection(bear.DIRECTION_RIGHT);
            invalidate();
        }
    }
    public void moveLeft(){
        if(bear.getX() > 50){
            bear.setDirection(bear.DIRECTION_LEFT);
            invalidate();
        }
    }
    public void moveUp(){
        if(bear.getY() > 50){
            bear.setDirection(bear.DIRECTION_UP);
            invalidate();
        }
    }
    public void moveDown(){
        if(bear.getY() < getHeight()-150){
            bear.setDirection(bear.DIRECTION_DOWN);
            invalidate();
        }
    }

/*    public void setPosX(float posX) {
        if(posX > 0 && posX < getWidth()-bearWidth){
            this.posX = posX;
        }
    }

    public void setPosY(float posY) {
        if(posY > 0 && posY < getHeight()-beerHeight){
            this.posY = posY;
        }
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }*/
}
