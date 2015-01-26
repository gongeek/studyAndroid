package com.example.studyAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 为ActionBar扩展菜单项
        MenuInflater inflater = getMenuInflater() ;
        inflater.inflate(R.menu.main_activity_actions, menu) ;
        return super.onCreateOptionsMenu(menu) ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// 处理动作按钮的点击事件
        switch (item.getItemId() ) {
            case R.id.action_search:
                Log.d("gongeek","开始搜索!");
                return true;
            case R.id.action_settings:
                Log.d("gongeek", "开始设置!");
                return true;
            default:
                return super.onOptionsItemSelected(item) ;
        }
    }

}
