package com.example.isiahlibor.quizvotereceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (TextView)findViewById(R.id.msg);
        num = (TextView)findViewById(R.id.num);

        Intent sms_intent = getIntent();
        Bundle b = sms_intent.getExtras();

        if (b!=null){


            SMSClass smsObj = (SMSClass) b.getSerializable("sms_obj");
            num.setText("From :"+smsObj.getNumber().toString());
            msg.setText("Message:"+smsObj.getMessage().toString());


        }

    }

}
