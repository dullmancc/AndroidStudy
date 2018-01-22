package com.cc.activitycirclelife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String Str = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Str,this.toString());
        Log.d(Str,"OnCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        Button bt3 = (Button) findViewById(R.id.bt3);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(Str,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(Str,"onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(Str,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(Str,"onStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(Str,"onRestart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(Str,"onDestroy");
    }
}
