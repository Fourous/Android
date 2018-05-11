package com.example.fourous.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final EditText textView_1=(EditText) findViewById(R.id.editText1);
        final EditText textView_2=(EditText) findViewById(R.id.editText2);
        Intent intent=getIntent();
        String name = intent.getStringExtra("name");
        String passwd=intent.getStringExtra("passwd");
        textView_1.setText(name);
        textView_2.setText(passwd);
    }
}
