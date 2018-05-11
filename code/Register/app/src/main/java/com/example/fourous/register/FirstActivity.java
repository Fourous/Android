package com.example.fourous.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you click Remove",Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1=(Button) findViewById(R.id.button_1);
        //获取到布局文件定义的元素这里返回的View对象，需要向下转型成Button
        final EditText editText1=(EditText) findViewById(R.id.editText1);
        final EditText editText2=(EditText) findViewById(R.id.editText2);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String name=editText1.getText().toString();
               String passwd=editText2.getText().toString();
               Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
               intent.putExtra("name",name);
               intent.putExtra("passwd",passwd);
               startActivity(intent);
           }
       });
        /*
        button1.setOnClickListener(new View.OnClickListener() {//注册一个监听器，setonclickListenler
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"you click Button 1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        */
        //项目任何活动都需要重写oncreate 方法
    }

}
