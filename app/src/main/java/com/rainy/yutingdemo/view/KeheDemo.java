package com.rainy.yutingdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Author: Rainy <br>
 * Description: YutingDemo <br>
 * Since: 2017/1/10 0010 上午 10:54 <br>
 */

public class KeheDemo extends View {
    private final static String TAG = KeheDemo.class.getSimpleName();
    private Paint mPaint;

    public KeheDemo(Context context) {
        super(context);
        init();
    }

    public KeheDemo(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public KeheDemo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.GRAY);
        //FILL填充, STROKE描边,FILL_AND_STROKE填充和描边
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        int width = getWidth();
        int height = getHeight();
        Log.d(TAG, "onDraw: ---------->"+width+"-----------"+height);
        float radius = width/4;
        canvas.drawCircle(width/2,width/2,radius,mPaint);

        mPaint.setColor(Color.BLUE);
        RectF oval = new RectF(width/2-radius,width/2-radius,width/2+radius,width/2+radius);  //用于定义的圆弧的形状和大小的界限,圆的外接正方形
        /**
         * 五个参数
         * oval：表示用于定义的圆弧的形状和大小的界限,圆的外接正方形
         * 270：开始的角度
         * 120：扫过的角度
         * true：是否包括圆心
         * mPaint：画笔
         */
        canvas.drawArc(oval,270,120,true,mPaint);//根据进度画圆弧，
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode  = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode   = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        Log.d(TAG, "onMeasure: ---widthMode--------->" + widthMode);
        switch (widthMode){
            case MeasureSpec.UNSPECIFIED://没有给定大小
                Log.d(TAG, "onMeasure: ------------>UNSPECIFIED");
                break;
            case MeasureSpec.EXACTLY://确定的大小
                Log.d(TAG, "onMeasure: ------------>EXACTLY");
                break;
            case MeasureSpec.AT_MOST://根据父控件来
                Log.d(TAG, "onMeasure: ------------>AT_MOST");
                break;
        }

        Log.e(TAG, "onMeasure--widthSize-->" + widthSize);
        Log.e(TAG, "onMeasure--heightMode-->" + heightMode);
        Log.e(TAG, "onMeasure--heightSize-->" + heightSize);

    }

    @Override
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
        Log.d(TAG, "layout: --------->"+l+"------>"+t+"---------->"+r+"---------->"+b);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d(TAG, "onLayout: --------->"+changed+"------>"+left+"---------->"+top+"--------->"+right+"---------->"+bottom);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d(TAG, "onSizeChanged: ---------->"+w+"---------->"+h+"----------->"+oldw+"------------->"+oldh);
    }
}
