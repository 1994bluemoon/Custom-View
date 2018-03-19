package com.example.dminh.customviews.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.example.dminh.customviews.R;

/**
 * Created by dminh on 11/27/2017.
 */

public class MyButton extends AppCompatButton{

    private Context mycontext;

    public MyButton(Context context) {
        super(context);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public  void  init(Context context){
        mycontext = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        if(isPressed()){
            setBackgroundDrawable(mycontext.getResources().getDrawable(R.drawable.bt_pressed, null));
        }else{
            setBackgroundDrawable(mycontext.getResources().getDrawable(R.drawable.bt_not_pressed, null));
        }

        setTextColor(Color.parseColor("#FFFFFF"));
        super.onDraw(canvas);
    }
}
