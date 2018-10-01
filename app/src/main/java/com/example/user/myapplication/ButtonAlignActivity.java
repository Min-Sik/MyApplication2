package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {

    private TextView draw_txt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        draw_txt = findViewById(R.id.draw_txt);
    }

    public void draw1(View v) {
//       Button btn = (Button)v;
//       btn.setText("다시 뽑기");
       int a = (int)(Math.random()*1000 +1);
       if(a<=10) {
           draw_txt.setText("UR!!!");
       } else if (a<=50) {
           draw_txt.setText("SSR!!");
       } else if (a<=150) {
           draw_txt.setText("SR!");
       } else {
           draw_txt.setText("R");
       }
    }

    public void draw2(View v) {
        Button btn = (Button)v;
        if(btn.getId() == R.id.draw1) {
            Button btn2 = findViewById(R.id.draw2);
            btn2.setText("0");
            btn.setText("1회 뽑기");
        } else if (btn.getId() == R.id.draw2) {
            Button btn3 = findViewById(R.id.draw1);
            btn3.setText("0");
            btn.setText("10회 뽑기");
        }
        draw_txt.setText("");
        for(int i=0; i<11; i++) {
            int a = (int)(Math.random()*1000 +1);
            if(a<=10) {
                draw_txt.setText(draw_txt.getText() + " UR!!!");
            } else if (a<=50) {
                draw_txt.setText(draw_txt.getText() + " SSR!!");
            } else if (a<=150) {
                draw_txt.setText(draw_txt.getText() + " SR!");
            } else {
                draw_txt.setText(draw_txt.getText() + " R");
            }
        }
    }
}
