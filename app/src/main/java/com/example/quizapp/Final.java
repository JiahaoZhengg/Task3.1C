package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    TextView congra;
    TextView grade1;
    String name;
    public void jump(View view){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("username",name);
        startActivity(intent);




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent1 = getIntent();
         name = intent1.getStringExtra("username");
        int value = intent1.getIntExtra("value",-1);
        congra = findViewById(R.id.congra);
        grade1 = findViewById(R.id.grade1);
        congra.setText("Congratulation "+name);
        grade1.setText("your grade:"+value+"/5");



    }

}