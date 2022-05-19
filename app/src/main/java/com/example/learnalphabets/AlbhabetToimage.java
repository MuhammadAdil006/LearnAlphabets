package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AlbhabetToimage extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albhabet_toimage);
        tv=(TextView) findViewById(R.id.textView);
        Intent intent1=getIntent();
        String i=intent1.getStringExtra("ImageIndex");
        tv.setText(i);

    }
}