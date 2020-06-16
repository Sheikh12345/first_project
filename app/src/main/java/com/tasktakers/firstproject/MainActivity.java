package com.tasktakers.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText editText=findViewById(R.id.etName);
                TextView textView=findViewById(R.id.result);
                String name=editText.getText().toString();
                String reverseWord="";
                char[] charArray=name.toCharArray();
                //
                for(int index=charArray.length-1;index>=0;index--){
                    reverseWord=reverseWord + charArray[index];
                }
                textView.setText(reverseWord);
            }
        });
    }
}
