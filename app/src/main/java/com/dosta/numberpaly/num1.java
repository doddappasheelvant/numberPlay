package com.dosta.numberpaly;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class num1 extends AppCompatActivity {

    Button bt;
    TextView tvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num1);

        tvNum = (TextView)findViewById(R.id.textView2);

        // play 0
        bt = (Button) findViewById(R.id.button0);
        final MediaPlayer mp0 = MediaPlayer.create(this, R.raw.zero);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp0.start();
                tvNum.setText("0");
            }
        });
        // play 1
        bt = (Button) findViewById(R.id.button1);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.one);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp1.start();
                tvNum.setText("1");
            }
        });

        // play 2
        bt = (Button) findViewById(R.id.button2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.two);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp2.start();
                tvNum.setText("2");
            }
        });

        // play 3
        bt = (Button) findViewById(R.id.button3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.three);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp3.start();
                tvNum.setText("3");
            }
        });

        // play 4
        bt = (Button) findViewById(R.id.button4);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.four);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp4.start();
                tvNum.setText("4");
            }
        });

        // play 5
        bt = (Button) findViewById(R.id.button5);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.five);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp5.start();
                tvNum.setText("5");
            }
        });

        // play 6
        bt = (Button) findViewById(R.id.button6);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.six);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp6.start();
                tvNum.setText("6");
            }
        });

        // play 7
        bt = (Button) findViewById(R.id.button7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.seven);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp7.start();
                tvNum.setText("7");
            }
        });

        // play 8
        bt = (Button) findViewById(R.id.buttonOk);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.eight);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp8.start();
                tvNum.setText("8");
            }
        });

        // play 9
        bt = (Button) findViewById(R.id.button9);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.nine);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp9.start();
                tvNum.setText("9");
            }
        });

        // play 10
        bt = (Button) findViewById(R.id.button10);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.ten);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mp10.start();
                tvNum.setText("10");
            }
        });
    }
}
