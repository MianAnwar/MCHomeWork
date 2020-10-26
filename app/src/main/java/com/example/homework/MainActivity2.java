package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private String gender, names;
    boolean b1, b2, b3, b4;
    private TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = (TextView) findViewById(R.id.textView1);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt3 = (TextView) findViewById(R.id.textView3);
        gender = getIntent().getExtras().get("s1").toString();
        names = getIntent().getExtras().get("s2").toString();
        b1 = getIntent().getExtras().getBoolean("b1");
        b2 = getIntent().getExtras().getBoolean("b2");
        b3 = getIntent().getExtras().getBoolean("b3");
        b4 = getIntent().getExtras().getBoolean("b4");
        txt1.setText(gender);
        txt2.setText(names);
        txt3.setText("Check 1 is " + b1 + "\n" + "Check 2 is " + b2 + "\n" + "Check 3 is " + b3 + "\n" + "Check 4 is " + b4);
    }

}