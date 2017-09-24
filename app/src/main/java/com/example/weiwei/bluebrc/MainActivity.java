package com.example.weiwei.bluebrc;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.TextView;

import com.zhy.autolayout.AutoLayoutActivity;
import com.zhy.autolayout.AutoRelativeLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AutoLayoutActivity {
    //主题
    public ViewAnimatorWordComponent varMain1,varMain2,varMain3,varMain4,varMain5,varMain6,varMain7,varMain8,varMain9,varMain10,varMain11,varMain12,
    varMain13,varMain14,varMain15,varMain16;
    //时间
    public ViewAnimatorWordComponent varTime1,varTime2,varTime3,varTime4,varTime5,varTime6,varTime7,varTime8,varTime9,varTime10,varTime11,varTime12,
            varTime13,varTime14,varTime15,varTime16;
    //预订人
    public ViewAnimatorWordComponent varUser1,varUser2,varUser3,varUser4,varUser5,varUser6,varUser7,varUser8,varUser9,varUser10,varUser11,varUser12,
            varUser13,varUser14,varUser15,varUser16;
    public AutoRelativeLayout rlMain;
    TextView tvRoom1,tvRoom2,tvRoom3,tvRoom4,tvRoom5,tvRoom6,tvRoom7,tvRoom8;
    public String[] strings = new String[]{
            "物业及CRML经营体系例会",
            "景观装饰公司人事制度评审会",
            "公司例会",
            "动员大会"
    };
    public String[] strings2 = new String[]{
            "9:00-12:00",
            "14:00-15:00",
            "17:00-19:00",
            "20:00-21:00"
    };
    public String[] strings3 = new String[]{
            "张伟",
            "谭有独",
            "诸葛孔明",
            "周强"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        init();
        timer.schedule(task, 1000*20, 1000*20); // 1s后执行task,经过1s再次执行

    }
    public void setSchool(){
        rlMain = (AutoRelativeLayout)findViewById(R.id.rlMain);
        rlMain.setBackgroundResource(R.mipmap.back5);
        tvRoom1 = (TextView)findViewById(R.id.tvRoom1);
        tvRoom1.setText("培训301");
        tvRoom2 = (TextView)findViewById(R.id.tvRoom2);
        tvRoom2.setText("培训302");
        tvRoom3 = (TextView)findViewById(R.id.tvRoom3);
        tvRoom3.setText("培训303");
        tvRoom4 = (TextView)findViewById(R.id.tvRoom4);
        tvRoom4.setText("培训304");
        tvRoom5 = (TextView)findViewById(R.id.tvRoom5);
        tvRoom5.setText("培训401");
        tvRoom6 = (TextView)findViewById(R.id.tvRoom6);
        tvRoom6.setText("培训402");
        tvRoom7 = (TextView)findViewById(R.id.tvRoom7);
        tvRoom7.setText("培训403");
        tvRoom8 = (TextView)findViewById(R.id.tvRoom8);
        tvRoom8.setText("培训404");

    }
    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            if (msg.what == 1) {
                update();
            }
            super.handleMessage(msg);
        }
    };

    private void update() {
        varMain1.update();
        varMain2.update();
        varMain3.update();
        varMain4.update();
        varMain5.update();
        varMain6.update();
        varMain7.update();
        varMain8.update();
        varMain9.update();
        varMain10.update();
        varMain11.update();
        varMain12.update();
        varMain13.update();
        varMain14.update();
        varMain15.update();
        varMain16.update();
        varTime1.update();
        varTime2.update();
        varTime3.update();
        varTime4.update();
        varTime5.update();
        varTime6.update();
        varTime7.update();
        varTime8.update();
        varTime9.update();
        varTime10.update();
        varTime11.update();
        varTime12.update();
        varTime13.update();
        varTime14.update();
        varTime15.update();
        varTime16.update();
        varUser1.update();
        varUser2.update();
        varUser3.update();
        varUser4.update();
        varUser5.update();
        varUser6.update();
        varUser7.update();
        varUser8.update();
        varUser9.update();
        varUser10.update();
        varUser11.update();
        varUser12.update();
        varUser13.update();
        varUser14.update();
        varUser15.update();
        varUser16.update();
    }

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {

        @Override
        public void run() {
            // 需要做的事:发送消息
            Message message = new Message();
            message.what = 1;
            handler.sendMessage(message);
        }
    };
    int i;
    private void init() {
        setSchool();
        varMain1 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain1);
        varMain1.setStrings(strings);
        varMain2 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain2);
        varMain2.setStrings(strings);
        varMain3 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain3);
        varMain3.setStrings(strings);
        varMain4 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain4);
        varMain4.setStrings(strings);
        varMain5 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain5);
        varMain5.setStrings(strings);
        varMain6 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain6);
        varMain6.setStrings(strings);
        varMain7 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain7);
        varMain7.setStrings(strings);
        varMain8 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain8);
        varMain8.setStrings(strings);
        varMain9 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain9);
        varMain9.setStrings(strings);
        varMain10 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain10);
        varMain10.setStrings(strings);
        varMain11 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain11);
        varMain11.setStrings(strings);
        varMain12 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain12);
        varMain12.setStrings(strings);
        varMain13 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain13);
        varMain13.setStrings(strings);
        varMain14 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain14);
        varMain14.setStrings(strings);
        varMain15 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain15);
        varMain15.setStrings(strings);
        varMain16 = (ViewAnimatorWordComponent)this.findViewById(R.id.varMain16);
        varMain16.setStrings(strings);
        varTime1 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime1);
        varTime1.setStrings(strings2);
        varTime2 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime2);
        varTime2.setStrings(strings2);
        varTime3 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime3);
        varTime3.setStrings(strings2);
        varTime4 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime4);
        varTime4.setStrings(strings2);
        varTime5 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime5);
        varTime5.setStrings(strings2);
        varTime6 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime6);
        varTime6.setStrings(strings2);
        varTime7 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime7);
        varTime7.setStrings(strings2);
        varTime8 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime8);
        varTime8.setStrings(strings2);
        varTime9 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime9);
        varTime9.setStrings(strings2);
        varTime10 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime10);
        varTime10.setStrings(strings2);
        varTime11 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime11);
        varTime11.setStrings(strings2);
        varTime12 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime12);
        varTime12.setStrings(strings2);
        varTime13 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime13);
        varTime13.setStrings(strings2);
        varTime14 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime14);
        varTime14.setStrings(strings2);
        varTime15 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime15);
        varTime15.setStrings(strings2);
        varTime16 = (ViewAnimatorWordComponent)this.findViewById(R.id.varTime16);
        varTime16.setStrings(strings2);
        varUser1 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser1);
        varUser1.setStrings(strings3);
        varUser2 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser2);
        varUser2.setStrings(strings3);
        varUser3 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser3);
        varUser3.setStrings(strings3);
        varUser4 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser4);
        varUser4.setStrings(strings3);
        varUser5 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser5);
        varUser5.setStrings(strings3);
        varUser6 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser6);
        varUser6.setStrings(strings3);
        varUser7 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser7);
        varUser7.setStrings(strings3);
        varUser8 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser8);
        varUser8.setStrings(strings3);
        varUser9 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser9);
        varUser9.setStrings(strings3);
        varUser10 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser10);
        varUser10.setStrings(strings3);
        varUser11 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser11);
        varUser11.setStrings(strings3);
        varUser12 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser12);
        varUser12.setStrings(strings3);
        varUser13 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser13);
        varUser13.setStrings(strings3);
        varUser14 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser14);
        varUser14.setStrings(strings3);
        varUser15 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser15);
        varUser15.setStrings(strings3);
        varUser16 = (ViewAnimatorWordComponent)this.findViewById(R.id.varUser16);
        varUser16.setStrings(strings3);
    }
}
