package com.example.pkumar.interactivestory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.mopub.common.MoPub;

import io.fabric.sdk.android.Fabric;


public class MainActivity extends Activity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics(), new MoPub());
        setContentView(R.layout.activity_main);
        mNameField =(EditText)findViewById(R.id.editText);
        mStartButton  = (Button)findViewById(R.id.button);


        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameField.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome "+ name, Toast.LENGTH_LONG).show();
                startStory(name);
            }
        });

    } //end onCreate()

    private void startStory(String nameUser) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", nameUser);
        startActivity(intent);
    }



}
