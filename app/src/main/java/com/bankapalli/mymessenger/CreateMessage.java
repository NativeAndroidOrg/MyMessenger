package com.bankapalli.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void sendMessage(View view) {
        EditText txtMessage = (EditText) findViewById(R.id.txtMessage);
        String message = String.valueOf(txtMessage.getText());

        Intent sendMessage = new Intent(this, ReceiveMessage.class);
        sendMessage.putExtra("message", message);
        startActivity(sendMessage);
    }
}
