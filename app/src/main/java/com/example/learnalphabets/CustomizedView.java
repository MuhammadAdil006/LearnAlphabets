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
        ip[0]=new itempattern("A",R.drawable.ant);
        ip[1]=new itempattern("B",R.drawable.boy);
        ip[2]=new itempattern("C",R.drawable.cow);
        ip[3]=new itempattern("D",R.drawable.duck);
        ip[4]=new itempattern("E",R.drawable.earth);
        ip[5]=new itempattern("F",R.drawable.fan);
        ip[6]=new itempattern("G",R.drawable.girl);
        ip[7]=new itempattern("H",R.drawable.horse);
        ip[8]=new itempattern("I",R.drawable.iglo);
        ip[9]=new itempattern("J",R.drawable.jeep);
        ip[10]=new itempattern("K",R.drawable.kangroo);
        ip[11]=new itempattern("L",R.drawable.ledder);
        ip[12]=new itempattern("M",R.drawable.mouse);
        ip[13]=new itempattern("N",R.drawable.net);
        ip[14]=new itempattern("O",R.drawable.owl);
        ip[15]=new itempattern("P",R.drawable.pan);
        ip[16]=new itempattern("Q",R.drawable.question);
        ip[17]=new itempattern("R",R.drawable.rabbit);
        ip[18]=new itempattern("S",R.drawable.sheep);
        ip[19]=new itempattern("T",R.drawable.teddy);
        ip[20]=new itempattern("U",R.drawable.unicorn);
        ip[21]=new itempattern("V",R.drawable.vaccum);
        ip[22]=new itempattern("W",R.drawable.wall);
        ip[23]=new itempattern("X",R.drawable.xray);
        ip[24]=new itempattern("Y",R.drawable.yellow);
        ip[25]=new itempattern("Z",R.drawable.zip);
        for(int i=0;i<26;i++)
        {
            items.add(ip[i]);
        }

    }
}