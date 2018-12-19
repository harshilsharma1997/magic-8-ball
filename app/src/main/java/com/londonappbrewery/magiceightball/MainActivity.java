package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton=(Button)findViewById(R.id.askButton);

        final ImageView Ball=(ImageView)findViewById(R.id.Ball);

        final int[] ball={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3
        ,R.drawable.ball4,R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Random rnum=new Random();
                int num=rnum.nextInt(5);
                Log.d("* ball","the num is:" +num);
                Ball.setImageResource(ball[num]);
            }
        });
    }
}
