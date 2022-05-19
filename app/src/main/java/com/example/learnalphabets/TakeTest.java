package com.example.learnalphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class TakeTest extends AppCompatActivity {
TextView score;
int[] letterDrawable;
int[] imageDrawable;
ImageView letter;
ImageView[] option;
int ans;
int countScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_test);
        score=(TextView) findViewById(R.id.Score);
        letter=(ImageView) findViewById(R.id.Letter);
        countScore=0;
        option=new ImageView[4];
        option[0]=(ImageView) findViewById(R.id.option1);
        option[1]=(ImageView) findViewById(R.id.option2);
        option[2]=(ImageView) findViewById(R.id.option3);
        option[3]=(ImageView) findViewById(R.id.option4);
        letterDrawable=new int[26];
        imageDrawable=new int[26];
        initializeDrawable();
        beginTest();
    }

    private void beginTest() {


            int a=0,b=0,c=0,d=0,e=0,f=0;
            a=GenrateNumber(0,25);
            while(b==a)
            {
                b=GenrateNumber(0,25);
            }
            while(c==a || c==b)
            {
                c=GenrateNumber(0,25);
            }
            while(d==a || d==b || d==c)
            {
                d=GenrateNumber(0,25);
            }
            while(e==a || e==b || e==c || e==d)
            {
                e=GenrateNumber(0,25);
            }

            letter.setImageResource(letterDrawable[a]);
            option[0].setImageResource(imageDrawable[b]);
            option[1].setImageResource(imageDrawable[c]);
            option[2].setImageResource(imageDrawable[d]);
            option[3].setImageResource(imageDrawable[e]);
            option[f].setImageResource(imageDrawable[a]);
            ans=f;


    }

    private int GenrateNumber(int min,int max)
    {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private void  initializeDrawable()
    {
        letterDrawable[0]=R.drawable.a_letter;
        letterDrawable[1]=R.drawable.b_letter;
        letterDrawable[2]=R.drawable.c_letter;
        letterDrawable[3]=R.drawable.d_letter;
        letterDrawable[4]=R.drawable.e_letter;
        letterDrawable[5]=R.drawable.f_letter;
        letterDrawable[6]=R.drawable.g_letter;
        letterDrawable[7]=R.drawable.h_letter;
        letterDrawable[8]=R.drawable.i_letter;
        letterDrawable[9]=R.drawable.j_letter;
        letterDrawable[10]=R.drawable.k_letter;
        letterDrawable[11]=R.drawable.l_letter;
        letterDrawable[12]=R.drawable.m_letter;
        letterDrawable[13]=R.drawable.n_letter;
        letterDrawable[14]=R.drawable.o_letter;
        letterDrawable[15]=R.drawable.p_letter;
        letterDrawable[16]=R.drawable.q_letter;
        letterDrawable[17]=R.drawable.r_letter;
        letterDrawable[18]=R.drawable.s_letter;
        letterDrawable[19]=R.drawable.t_letter;
        letterDrawable[20]=R.drawable.letter_u;
        letterDrawable[21]=R.drawable.v_letter;
        letterDrawable[22]=R.drawable.w_letter;
        letterDrawable[23]=R.drawable.x_letter;
        letterDrawable[24]=R.drawable.y_letter;
        letterDrawable[25]=R.drawable.z_letter;



        imageDrawable[0]=R.drawable.ant;
        imageDrawable[1]=R.drawable.boy;
        imageDrawable[2]=R.drawable.cow;
        imageDrawable[3]=R.drawable.duck;
        imageDrawable[4]=R.drawable.earth;
        imageDrawable[5]=R.drawable.fan;
        imageDrawable[6]=R.drawable.girl;
        imageDrawable[7]=R.drawable.horse;
        imageDrawable[8]=R.drawable.iglo;
        imageDrawable[9]=R.drawable.jeep;
        imageDrawable[10]=R.drawable.kangroo;
        imageDrawable[11]=R.drawable.ledder;
        imageDrawable[12]=R.drawable.mouse;
        imageDrawable[13]=R.drawable.net;
        imageDrawable[14]=R.drawable.owl;
        imageDrawable[15]=R.drawable.pan;
        imageDrawable[16]=R.drawable.question;
        imageDrawable[17]=R.drawable.rabbit;
        imageDrawable[18]=R.drawable.sheep;
        imageDrawable[19]=R.drawable.teddy;
        imageDrawable[20]=R.drawable.unicorn;
        imageDrawable[21]=R.drawable.vaccum;
        imageDrawable[22]=R.drawable.wall;
        imageDrawable[23]=R.drawable.xray;
        imageDrawable[24]=R.drawable.yellow;
        imageDrawable[25]=R.drawable.zip;
    }

    public void onClick(View view) {
        if(view==option[ans])
        {
           countScore=Integer.parseInt((String) score.getText());
           countScore=countScore+1;
           score.setText(String.valueOf(countScore));
        }
        beginTest();
    }
}