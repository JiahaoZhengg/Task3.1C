package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    String name2;
    public void jump(View view){
        Intent intent = new Intent(this,question1.class);
        intent.putExtra("username",name.getText().toString());
        startActivity(intent);




    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        Intent intent =getIntent();
       name2 = intent.getStringExtra("username");
       name.setText(name2);


    }

}