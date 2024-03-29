package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View; //
import android.widget.EditText; //
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.helloworld.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


public void sendMessage(View view){
    Intent intent = new Intent(this, DisplayMessageActivity.class);
    TextView editText = (TextView) findViewById(R.id.editText);
    String message = editText.getText().toString();
    intent.putExtra(EXTRA_MESSAGE,message);
    startActivity(intent);
}
}