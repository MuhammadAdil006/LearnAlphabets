package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class AlbhabetToimage extends AppCompatActivity {
ImageView Iv;
int[] myImageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albhabet_toimage);
        Iv=(ImageView)findViewById(R.id.imageView);
        Intent intent1=getIntent();
        myImageList=new int[26];
        imageInitialize();
        String i=intent1.getStringExtra("ImageIndex");
        int index= Integer.parseInt(i);
        Iv.setImageResource(myImageList[index]);


    }
    private  void imageInitialize()
    {
        myImageList[0]=R.drawable.a;
        myImageList[1]=R.drawable.b;
        myImageList[2]=R.drawable.c;
        myImageList[3]=R.drawable.d;
        myImageList[4]=R.drawable.e;
        myImageList[5]=R.drawable.f;
        myImageList[6]=R.drawable.g;
        myImageList[7]=R.drawable.h;
        myImageList[8]=R.drawable.i;
        myImageList[9]=R.drawable.j;
        myImageList[10]=R.drawable.k;
        myImageList[11]=R.drawable.l;
        myImageList[12]=R.drawable.m;
        myImageList[13]=R.drawable.n;
        myImageList[14]=R.drawable.o;
        myImageList[15]=R.drawable.p;
        myImageList[16]=R.drawable.q;
        myImageList[17]=R.drawable.r;
        myImageList[18]=R.drawable.s;
        myImageList[19]=R.drawable.t;
        myImageList[20]=R.drawable.u;
        myImageList[21]=R.drawable.v;
        myImageList[22]=R.drawable.w;
        myImageList[23]=R.drawable.x;
        myImageList[24]=R.drawable.y;
        myImageList[25]=R.drawable.z;
    }
}