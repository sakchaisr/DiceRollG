package com.softeng.sakchai.dicerollg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image1;

    public void roll(View v){
        Random rand = new Random();
        int val1 = rand.nextInt(6) + 1;
        int val2 = rand.nextInt(6) + 1;
        int val3 = rand.nextInt(6) + 1;

        if (val1 == 1)
            image1.setImageResource(R.drawable.dice1);
        else if (val1 == 2)
            image1.setImageResource(R.drawable.dice2);
        else if (val1 == 3)
            image1.setImageResource(R.drawable.dice3);
        else if (val1 == 4)
            image1.setImageResource(R.drawable.dice4);
        else if (val1 == 5)
            image1.setImageResource(R.drawable.dice5);
        else if (val1 == 6)
            image1.setImageResource(R.drawable.dice6);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=(ImageView)findViewById(R.id.imageView1);
    }
}
