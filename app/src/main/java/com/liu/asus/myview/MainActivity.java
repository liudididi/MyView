package com.liu.asus.myview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import View.HearView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      HearView hearView= findViewById(R.id.heart);


    }

    public void hello(View view) {

        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }
}
