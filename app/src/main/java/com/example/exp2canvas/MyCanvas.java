package com.example.exp2canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyCanvas extends View {
float posX=0,posY=0;
public boolean check=false;
public boolean haut=false, bas=false,
        droite=false,
    gauche=false;


    public MyCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint P= new Paint();
        P.setTextSize(20);
        P.setColor(Color.BLUE);
        P.setStyle(Paint.Style.FILL);
        P.setFakeBoldText(true);
        canvas.drawText("("+posX+","+posY+")",0,0,P);
        if (!check)
        {
            posX=getWidth()/2;
            posY=getHeight()/2;
        }
        else if (haut) {
            posY-=20;
        }
        else if (bas){
            posY+=20;
        }
        else if(gauche)
        {
            posX-=20;
        }
        else if (droite)
        {
            posX+=20;
        }

        canvas.drawCircle(posX,posY,100,P);

    }
}
