package com.example.studyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE="com.example.studyAndroid";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void sendMessage(View view){
        EditText editText= (EditText) findViewById(R.id.edit_text);
        String message=editText.getText().toString();
        Intent intent=new Intent(this,DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
