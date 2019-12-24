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

     private float posX,posY = 400;
    private int beerHeight;
    private int bearWidth;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game", "onDraw: "+ getWidth() + "," + getHeight());
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.bear);
        canvas.drawBitmap(bitmap,posX,posY,paint);
        bearWidth = bitmap.getWidth();
        beerHeight = bitmap.getHeight();
    }

    public void setPosX(float posX) {
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
    }
}
