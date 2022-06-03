package com.example.learnalphabets;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomizedView extends AppCompatActivity {
    List<itempattern> items;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customized_view);
        items= new ArrayList<itempattern>() ;
        lv=  (ListView)findViewById(R.id.lv);


        initalize();
        MyAdapter ma= new MyAdapter(CustomizedView.this,0,items);
        lv.setAdapter(ma);


    }

    private void initalize() {
        itempattern[] ip=new itempattern[26];
        ip[0]=new itempattern("A",R.drawable.a);
        ip[1]=new itempattern("B",R.drawable.b);
        ip[2]=new itempattern("C",R.drawable.c);
        ip[3]=new itempattern("D",R.drawable.d);
        ip[4]=new itempattern("E",R.drawable.e);
        ip[5]=new itempattern("F",R.drawable.f);
        ip[6]=new itempattern("G",R.drawable.g);
        ip[7]=new itempattern("H",R.drawable.h);
        ip[8]=new itempattern("I",R.drawable.i);
        ip[9]=new itempattern("J",R.drawable.j);
        ip[10]=new itempattern("K",R.drawable.k);
        ip[11]=new itempattern("L",R.drawable.l);
        ip[12]=new itempattern("M",R.drawable.m);
        ip[13]=new itempattern("N",R.drawable.n);
        ip[14]=new itempattern("O",R.drawable.o);
        ip[15]=new itempattern("P",R.drawable.p);
        ip[16]=new itempattern("Q",R.drawable.q);
        ip[17]=new itempattern("R",R.drawable.r);
        ip[18]=new itempattern("S",R.drawable.s);
        ip[19]=new itempattern("T",R.drawable.t);
        ip[20]=new itempattern("U",R.drawable.u);
        ip[21]=new itempattern("V",R.drawable.v);
        ip[22]=new itempattern("W",R.drawable.w);
        ip[23]=new itempattern("X",R.drawable.x);
        ip[24]=new itempattern("Y",R.drawable.y);
        ip[25]=new itempattern("Z",R.drawable.z);
        for(int i=0;i<26;i++)
        {
            items.add(ip[i]);
        }

    }
}