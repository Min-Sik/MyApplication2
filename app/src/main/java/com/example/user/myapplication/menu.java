package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    private Button btn1 = null;
    private Button btn2 = null;
    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(menu.this, "버튼1", Toast.LENGTH_SHORT).show();
            }
        });
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new Button2());
    }

    class Button2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(menu.this, "버튼2", Toast.LENGTH_SHORT).show();
        }
    }
}

