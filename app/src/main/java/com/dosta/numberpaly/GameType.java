package com.dosta.numberpaly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameType extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        //num1
        button = (Button) findViewById(R.id.opTypeButton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityNum1();
            }
        });

        //num2
        button = (Button) findViewById(R.id.opTypeButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityNum2();
            }
        });
        //num3
        button = (Button) findViewById(R.id.opTypeButton3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityNum3();
            }
        });

    }
    public void openNewActivityNum1(){
        Intent intent = new Intent(this, num1.class);
        startActivity(intent);
    }

    public void openNewActivityNum2(){
        Intent intent = new Intent(this, num2.class);
        startActivity(intent);
    }

    public void openNewActivityNum3(){
        Intent intent = new Intent(this, num3.class);
        startActivity(intent);
    }
}

