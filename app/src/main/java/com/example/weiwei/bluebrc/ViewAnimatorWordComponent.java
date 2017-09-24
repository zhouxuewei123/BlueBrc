package com.example.weiwei.bluebrc;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;

import com.zhy.autolayout.AutoRelativeLayout;

/**
 * Created by lanshan on 2017/9/21.
 */

public class ViewAnimatorWordComponent extends AutoRelativeLayout {
    private ViewAnimator viewAnimator;
    public ViewFlipper filper;
    private final int MSG_CODE = 0x667;
    private final int TIMER_INTERVAL = 10000;
    public int delayTime = 3000;
    public String[] strings;
    public boolean isStop=false;
    public void setStrings(String[] strings) {
        this.strings = strings;
        if(strings != null){
            for (int i = 0; i < strings.length; i++) {
                TextView textView = new TextView(getContext());
                textView.setText(strings[i]);
                //任意设置你的文字样式，在这里
                textView.setTextColor(getResources().getColor(R.color.colorPrimary));
                textView.setTextSize(16);
                textView.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//                textView.setGravity(CENTER_HORIZONTAL);
                textView.setGravity(Gravity.CENTER);
//                viewAnimator.addView(textView,i);
                filper.addView(textView,i);
            }
        }
    }
    public void setDelayTime(int time){
        delayTime = time;
    }
    public void stop(){
        isStop=true;
        filper.stopFlipping();
    }
    public void start(){
        isStop=false;
        filper.startFlipping();
//        Message message = handler.obtainMessage(MSG_CODE);
//        handler.sendMessageDelayed(message,TIMER_INTERVAL);
    }
    public void update(){
        Message message = handler.obtainMessage(MSG_CODE);
        handler.sendMessageDelayed(message, TIMER_INTERVAL);
    }
    public ViewAnimatorWordComponent(Context context, AttributeSet attrs) {
        super(context, attrs);
        filper = new ViewFlipper(getContext());
//        viewAnimator = new ViewAnimator(getContext());
//        viewAnimator.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        addView(viewAnimator);
        filper.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        filper.setFlipInterval(5000);
        Animation outanimation = AnimationUtils.loadAnimation(getContext(),R.anim.slide_out_up);
        Animation inanimation = AnimationUtils.loadAnimation(getContext(),R.anim.slide_in_down);
        filper.setOutAnimation(outanimation);
        filper.setInAnimation(inanimation);
//        filper.setAutoStart(true);
        filper.showNext();
        addView(filper);
        Message message = handler.obtainMessage(MSG_CODE);
        handler.sendMessageDelayed(message,delayTime);
    }
    public Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == MSG_CODE){
//                Animation outanimation = AnimationUtils.loadAnimation(getContext(),R.anim.slide_out_up);
//                Animation inanimation = AnimationUtils.loadAnimation(getContext(),R.anim.slide_in_down);
//                viewAnimator.setOutAnimation(getContext(),R.anim.slide_out_up);
//                viewAnimator.setInAnimation(getContext(),R.anim.slide_in_down);
//                viewAnimator.setOutAnimation(outanimation);
//                viewAnimator.setInAnimation(inanimation);
//                viewAnimator.showNext();
//                filper.setOutAnimation(outanimation);
//                filper.setInAnimation(inanimation);
//                filper.setAutoStart(true);

//                filper.startFlipping();
//                Message message = handler.obtainMessage(MSG_CODE);
//                if(!isStop){
//                    handler.sendMessageDelayed(message,TIMER_INTERVAL);
//                }
                if(isStop){
                    filper.startFlipping();
                    filper.showNext();
                    isStop = false;
                }else {
                    filper.stopFlipping();
                    isStop = true;
                    Message message = handler.obtainMessage(MSG_CODE);
                    handler.sendMessageDelayed(message, TIMER_INTERVAL);
                }
            }
        }
    };
}
