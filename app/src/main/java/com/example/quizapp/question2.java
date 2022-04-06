package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PublicKey;

public class question2 extends AppCompatActivity {
    Button selection1;
    Button selection2;
    Button selection3;
    Button submit;
    int btn1;
    int btn2;
    int btn3;


    String answer = "Java";

    public int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


        submit = findViewById(R.id.submit);
        selection1 = findViewById(R.id.selection1);
        selection2 = findViewById(R.id.selection2);
        selection3 = findViewById(R.id.selection3);
        selection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1 = 1;
                btn2 = 0;
                btn3 = 0;
            }
        });
        selection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2 = 1;
                btn1 = 0;
                btn3 = 0;
            }
        });
        selection3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn3 = 1;
                btn1 = 0;
                btn2 = 0;
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            Intent intent1 = getIntent();

            String name = intent1.getStringExtra("username");


            int value = intent1.getIntExtra("value",-1);

            @Override
            public void onClick(View view) {
                if (flag == 0) {
                    if (btn1 != 0) {
                        if (selection1.getText().toString().equals(answer)) {
                            selection1.setBackgroundResource(R.drawable.green_btn);
                            value++;
                        } else {
                            selection1.setBackgroundResource(R.drawable.red_btn);
                        }
                        if (selection2.getText().toString().equals(answer)) {
                            selection2.setBackgroundResource(R.drawable.green_btn);
                        }
                        if (selection3.getText().toString().equals(answer)) {
                            selection3.setBackgroundResource(R.drawable.green_btn);
                        }


                    }
                    if (btn2 != 0) {
                        if (selection2.getText().toString().equals(answer)) {
                            selection2.setBackgroundResource(R.drawable.green_btn);
                            value++;
                        } else {
                            selection2.setBackgroundResource(R.drawable.red_btn);
                        }
                        if (selection1.getText().toString().equals(answer)) {
                            selection1.setBackgroundResource(R.drawable.green_btn);
                        }
                        if (selection3.getText().toString().equals(answer)) {
                            selection3.setBackgroundResource(R.drawable.green_btn);
                        }



                    }
                    if (btn3 != 0) {
                        if (selection3.getText().toString().equals(answer)) {
                            selection3.setBackgroundResource(R.drawable.green_btn);
                            value++;
                        } else {
                            selection3.setBackgroundResource(R.drawable.red_btn);
                        }
                        if (selection1.getText().toString().equals(answer)) {
                            selection1.setBackgroundResource(R.drawable.green_btn);
                        }
                        if (selection2.getText().toString().equals(answer)) {
                            selection2.setBackgroundResource(R.drawable.green_btn);
                        }
                    }

                    submit.setText("Next");
                    flag = 1;}
                else {

                    Intent intent = new Intent(question2.this, question3.class);
                    intent.putExtra("value", value);
                    intent.putExtra("username",name);
                    startActivity(intent);


                    flag = 0;
                }


            }
        });







    }
}