package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton1, radioButton2;
    private RadioGroup gender, names;
    private Button btn;
    private CheckBox check1, check2, check3, check4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = (RadioGroup) findViewById(R.id.RG1);
        names = (RadioGroup) findViewById(R.id.RG2);
        btn = (Button) findViewById(R.id.btn);
        check1 = (CheckBox) findViewById(R.id.check1);
        check2 = (CheckBox) findViewById(R.id.check2);
        check3 = (CheckBox) findViewById(R.id.check3);
        check4 = (CheckBox) findViewById(R.id.check4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean b1, b2, b3, b4;
                int i, i2;
                b1 = check1.isChecked();
                b2 = check2.isChecked();
                b3 = check3.isChecked();
                b4 = check4.isChecked();
                i = gender.getCheckedRadioButtonId();
                i2 = names.getCheckedRadioButtonId();
                radioButton1 = (RadioButton) findViewById(i);
                radioButton2 = (RadioButton) findViewById(i2);
                String s1 = (String) radioButton1.getText();
                String s2 = (String) radioButton2.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("s1", s1);
                intent.putExtra("s2", s2);
                intent.putExtra("b1", b1);
                intent.putExtra("b2", b2);
                intent.putExtra("b3", b3);
                intent.putExtra("b4", b4);
                startActivity(intent);
            }
        });
    }
}