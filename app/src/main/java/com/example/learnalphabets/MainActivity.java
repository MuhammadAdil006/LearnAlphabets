package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{
Button repo,learn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo=(Button) findViewById(R.id.Repo);
        learn=(Button) findViewById(R.id.Learn);
    }
    public void onClick(View view) {
        if(view.getId()==R.id.Repo)
        {
            String url= "https://github.com/MuhammadAdil006/LearnAlphabets";
            Uri uri= Uri.parse(url);
            Intent intent2=new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent2);
        }else if(R.id.Learn==view.getId())
        {
            Intent intent2=new Intent(MainActivity.this,LearnAlphabets.class);
            startActivity(intent2);
        }
    }


}