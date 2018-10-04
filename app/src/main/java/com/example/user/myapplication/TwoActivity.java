package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.IntProperty;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    private EditText p1 = null;
    private EditText p2 = null;
    private TextView calc = null;
    private TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        init();
    }

    private void init() {
        getSupportActionBar().setTitle(R.string.calc);
        p1 = findViewById(R.id.p1);
        p1.setShowSoftInputOnFocus(false);
        p2 = findViewById(R.id.p2);
        p2.setShowSoftInputOnFocus(false);
        calc = findViewById(R.id.calc);
        result = findViewById(R.id.result);
    }

    public void calc(View v) {
        Button btn = (Button)v;
        String str = btn.getText().toString();
        calc = findViewById(R.id.calc);
        calc.setText(str);
    }

    public void pNum(View v) {
        Log.i("test", "이벤트 연결 성공");
        if(result.getText().toString().equals("")) {
            Button btn = (Button) v;
            String str = btn.getText().toString();
            EditText target = null;
            if (calc.getText().toString().equals("")) {
                target = p1;
            } else {
                target = p2;
            }

            if(target != null) {
                if(v instanceof Button) {
                    Button b = (Button)v;
                    String no = b.getText().toString();

                    String old = target.getText().toString();
                    old += no;
                    old = old.replaceAll("^0+$","");
                    target.setText(old);
                }
            }
        }
    }

    public void rightBtn(View v) {
        if(v instanceof Button) {
            Button b = (Button)v;
            String str = b.getText().toString();
            if(str.equals("C")) {
                p1.setText("");
                p2.setText("");
                calc.setText("");
                result.setText("");
            } else if(result.getText().toString().equals("")) {
                calc = findViewById(R.id.calc);
                calc.setText(str);
            }
        }
    }

    public void enter(View v) {
        if(result.getText().toString().equals("")) {
            try {
                int a = Integer.parseInt(p1.getText().toString());
                int b = Integer.parseInt(p2.getText().toString());
                double answer = 0;
                switch (calc.getText().toString()) {
                    case "*":
                        result.setText(Integer.toString(a * b));
                        break;
                    case "/":
                        if (b != 0) {
                            answer = (double) a / b;
                            result.setText(Double.toString(answer));
                        } else {
                            result.setText("div 0");
                        }
                        break;
                    case "+":
                        result.setText(Integer.toString(a + b));
                        break;
                    case "-":
                        result.setText(Integer.toString(a - b));
                        break;
                }
            } catch (Exception e) {
                result.setText("incomplete");
            }
        }
    }
    //( || 로 공백 예외처리도 해보자)

    private int intParse(String v) {
        int result = -1;
        try {
            result = Integer.parseInt(v);
        } catch (Exception e) {

        }
        return result;
    }

    private String doCalc(String a, String b, String c) {
        String result = "";
        int n1 = intParse(a);
        int n2 = intParse(b);




        return result;
    }

}
