package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = (ImageButton) findViewById(R.id.my_image);
    }
    public void onClick(View View){
        Random rn =new Random();
        int num=rn.nextInt(3)+1;
        if(num==1){
            imageButton.setImageResource(R.drawable.picture2);
        }
        else if(num==2){
            imageButton.setImageResource(R.drawable.p2);
        }
        else{
            imageButton.setImageResource(R.drawable.p3);
        }
    }

}