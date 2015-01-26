package com.example.studyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);//默认为true，可设置为false
        Intent intent=getIntent();
        String message=intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        TextView textView=new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        setContentView(textView);
    }
}
