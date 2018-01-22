package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
        final Intent intent = getIntent();
        this.date = intent.getStringExtra("date");
        Button bt2 = (Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(Main2Activity.this,date, Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent();
                intent1.putExtra("STR","Hello FirstActivity");
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){
        Intent intent1 = new Intent();
        intent1.putExtra("STR","Hello FirstActivity");
        setResult(RESULT_OK,intent1);
        finish();
    }

}
