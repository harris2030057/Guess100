package com.harris.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Random random = new Random();
    int min = 1 ;
    int max = 100;
    int r = random.nextInt(100)+1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void findViews(View view){


    }
}
