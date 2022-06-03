package com.example.learnalphabets;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter {
    public MyAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        itempattern student = (itempattern) getItem(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.pattern,null ,false);
        TextView textViewName =(TextView) convertView.findViewById(R.id.alphabet);
        textViewName.setText(student.getLetter());


        ImageView imageView =(ImageView) convertView.findViewById(R.id.img);
        imageView.setImageResource(student.getImgId());

//        textViewName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Intent intent = new Intent(getContext());
//                Log.d("Tag",textViewName.getText().toString());
//            }
//        });
        return convertView;
    }
}
