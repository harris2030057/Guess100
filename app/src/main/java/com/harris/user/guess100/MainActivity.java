package com.harris.user.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        EditText number = (EditText) findViewById(R.id.info);
        Button send = (Button) findViewById(R.id.send);
       int n = Integer.parseInt(number.getText().toString());
       boolean b = true ;

        if (n>max || n<min){
            b=false;
            /*Toast.makeText(this,)*/
        }
        if(b==true){
            if(n==r){
                new AlertDialog.Builder(this)
                        .setMessage("你答對了")
                        .setPositiveButton("確定",null)
                        .show();
            }
            if(n>r){
                max = n;
                        Toast.makeText(this,"請輸入："+min+"-"+max,Toast.LENGTH_LONG).show();
            }
            if(n<r){
                n=min;
                Toast.makeText(this,"請輸入："+min+"-"+max,Toast.LENGTH_LONG).show();
            }
        }
    }
}
