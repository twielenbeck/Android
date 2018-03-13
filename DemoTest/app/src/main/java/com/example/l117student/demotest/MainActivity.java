package com.example.l117student.demotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText numInput1, numInput2;
    protected Button btnCalc;
    protected TextView outTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numInput1 = (EditText)findViewById(R.id.numInput1);
        numInput2 = (EditText)findViewById(R.id.numInput2);
        btnCalc = (Button)findViewById(R.id.btnCalc);
        outTxt = (TextView) findViewById(R.id.outTxt);

    }
    public void addEmUp(View view) {
        int num1 = Integer.parseInt(numInput1.getText().toString());
        int num2 = Integer.parseInt(numInput2.getText().toString());
        int ans = Adder.addTheNumbers(num1, num2);
        outTxt.setText(""+ans);
    }
}
