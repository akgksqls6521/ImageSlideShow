package kr.hs.emirim.qls6521.imageslideshow;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper flip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flip = (ViewFlipper) findViewById(R.id.view_flip);
        flip.setFlipInterval(1000);//1초간격으로 설정

        Button but_start, but_stop;

        but_start = (Button) findViewById(R.id.but_start);
        but_start.setOnClickListener(this);//이 클래스 자체를 핸들러클래스로 만들었음

        but_stop = (Button) findViewById(R.id.but_end);
        but_stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.but_start:
                flip.startFlipping();
                break;
            case R.id.but_end:
                flip.stopFlipping();
                break;
        }

    }
}
//핸들러클래스를 구현하는법 ? 익명클래스 or 클래스를 핸들러클래스로 만들기