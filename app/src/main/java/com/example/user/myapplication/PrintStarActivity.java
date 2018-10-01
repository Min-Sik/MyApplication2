package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {

    private EditText et = null;
    private Button btn = null;
    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("밤하늘의 별");
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et.getText().toString();
                try {
                    int output = Integer.parseInt(input.trim());
                    String star = "";
                    for(int i=0; i<output; i++) {
                        for(int j=0; j<=i; j++) {
                            star += "*";
                        }
                        star += "\n";
                    }
                    tv.setText(star);
                } catch (Exception e) {
                    e.printStackTrace();
                    tv.setText("숫자가 아님");
                }
            }
        });
        tv = findViewById(R.id.tv);
    }

    public void printStar(View v) {
        CharSequence cs = et.getText();
        String input = et.getText().toString();
        try {
            int output = Integer.parseInt(input.trim());
            String star = "";
            for(int i=0; i<output; i++) {
                for(int j=0; j<=i; j++) {
                    star += "*";
                }
                star += "\n";
            }
            tv.setText(star);
        } catch (Exception e) {
            e.printStackTrace();
            tv.setText("숫자가 아님");
        }
    }
}
