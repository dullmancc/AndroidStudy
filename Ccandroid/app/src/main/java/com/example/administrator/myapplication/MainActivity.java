package com.example.administrator.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //创建主活动
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //Logcat中输出
        Log.d("MainActivity","onCreate execute");
        //button添加事件
        Button bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this,"You clicked button 1",Toast.LENGTH_SHORT).show();
                //finish();
                String s = new  Date().getTime()+"";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
              // Intent intent = new Intent("com.example.activitytest.ACTION_START");
                //Intent intent = new Intent(Intent.ACTION_VIEW);
               // intent.setData(Uri.parse("http://www.baidu.com"));
               //intent.addCategory("com.example.activitytest.MY_CATEGORY");
                intent.putExtra("date", s);
                startActivityForResult(intent,1);
            }
        });
    }
    //创建目录
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    //给目录添加事件
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return  true;
    }
    @Override
    protected  void onActivityResult(int requestCode,int resultCode,Intent data){
        Log.d("FirstActivity",requestCode+"");
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedData = data.getStringExtra("STR");
                    Log.d("FirstActivity",returnedData);
                    Toast.makeText(this,returnedData,Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }
}
