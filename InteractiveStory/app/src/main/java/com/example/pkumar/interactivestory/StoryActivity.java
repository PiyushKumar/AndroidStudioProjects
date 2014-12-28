package com.example.pkumar.interactivestory;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.pkumar.interactivestory.R;
import android.content.Intent;
import android.util.Log;
public class StoryActivity extends Activity {

    public static  final  String TAG = StoryActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");


        if (name == null){
            name = "Friend-Dummy";
        }
        Log.d(TAG, name);
    }

}
