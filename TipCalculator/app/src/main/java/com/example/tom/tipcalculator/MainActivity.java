package com.example.tom.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    protected EditText in_price;
    protected EditText in_checkpayrouting;
    protected EditText in_checkpayaccount;
    protected EditText in_cardpaycardnum;
    protected EditText in_cardpaydate;
    protected RadioButton in_cardpay;
    protected RadioButton in_checkpay;
    protected Button in_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in_submit = (Button)findViewById(R.id.in_submit);
        in_checkpay = (RadioButton)findViewById(R.id.in_checkpay);
        in_cardpay = (RadioButton)findViewById(R.id.in_cardpay);
        in_cardpaydate = (EditText)findViewById(R.id.in_cardpaydate);
        in_cardpaycardnum = (EditText)findViewById(R.id.in_cardpaycardnum);
        in_checkpayaccount = (EditText)findViewById(R.id.in_checkpayaccount);
        in_checkpayrouting = (EditText)findViewById(R.id.in_checkpayrouting);
        in_price = (EditText)findViewById(R.id.in_price);
    }
    public void onClick(View view) {
        if (in_checkpay.isChecked()) {
            in_checkpayrouting.setVisibility(View.VISIBLE);
            in_checkpayaccount.setVisibility(View.VISIBLE);
            in_cardpaycardnum.setVisibility(View.GONE);
            in_cardpaydate.setVisibility(View.GONE);
        }
        if (in_cardpay.isChecked()) {
            in_cardpaycardnum.setVisibility(View.VISIBLE);
            in_cardpaydate.setVisibility(View.VISIBLE);
            in_checkpayrouting.setVisibility(View.GONE);
            in_checkpayaccount.setVisibility(View.GONE);
        }
    }
}
