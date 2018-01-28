package com.bankapalli.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent receiveMessage = getIntent();
        String message = receiveMessage.getStringExtra("message");

        TextView lblMessage = (TextView) findViewById(R.id.lblMessage);
        lblMessage.setText(message);
    }
}
