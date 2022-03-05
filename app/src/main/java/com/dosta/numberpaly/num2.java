package com.dosta.numberpaly;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class num2 extends AppCompatActivity {

    public static int igameLoopCount = 10;
    public static int iScore = 0;
    public static int iCount = 0;
    public static int iDelay_max = 10000;
    public static int iStage = 1;
    static String gameName = "num game 2";
    int rNum;

    Button BtnPlay;
    Button Btn1;
    Button Btn2;
    Button Btn3;
    Button Btn4;
    Button Btn5;
    Button Btn6;
    Button Btn7;
    Button Btn8;
    Button Btn9;
    TextView tvStage;
    TextView tvScore;
    TextView tvNumber;
    ImageView ivThumbs;

    android.os.Handler customHandler = new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().setTitle(gameName); //hide the title bar

        setContentView(R.layout.activity_num2);

        iStage = 1;
        tvStage = (TextView)findViewById(R.id.textViewStage);
        ivThumbs = (ImageView)findViewById(R.id.imageViewThumbs);

        Btn1 = (Button) findViewById(R.id.button1);
        Btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(1);
            }
        });

        Btn2 = (Button) findViewById(R.id.button2);
        Btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(2);
            }
        });

        Btn3 = (Button) findViewById(R.id.button3);
        Btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(3);
            }
        });

        Btn4 = (Button) findViewById(R.id.button4);
        Btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(4);
            }
        });

        Btn5 = (Button) findViewById(R.id.button5);
        Btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(5);
            }
        });

        Btn6 = (Button) findViewById(R.id.button6);
        Btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(6);
            }
        });

        Btn7 = (Button) findViewById(R.id.button7);
        Btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(7);
            }
        });
        Btn8 = (Button) findViewById(R.id.buttonOk);
        Btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(8);
            }
        });

        Btn9 = (Button) findViewById(R.id.button9);
        Btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                compute(9);
            }
        });

        // play button
        BtnPlay = (Button) findViewById(R.id.buttonPlay);
        BtnPlay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startGame();
            }
        });
    }

    public int getRandomNumber(int min,int max) {
        return (new Random()).nextInt((max - min) + 1) + min;
    }

    public void setNewNumber(){
        rNum = getRandomNumber(1,9);
        int colour = getRandomColor();
        tvNumber = (TextView)findViewById(R.id.textViewNum);
        tvNumber.setText(Integer.toString(rNum));
        tvNumber.setTextColor(colour);
        playNumber(rNum);

    }

    public void compute( int buttonPressed){

        customHandler.removeCallbacks(updateTimerThread);

        if (iCount >= igameLoopCount-1){
            restartGame();
            openNewActivity();
        }
        else {
            iCount ++;
            ivThumbs = (ImageView)findViewById(R.id.imageViewThumbs);
            tvNumber = (TextView)findViewById(R.id.textViewNum);
            String temp = tvNumber.getText().toString();

            if(temp.equals(Integer.toString(buttonPressed))) {
                iScore ++;
                ivThumbs.setImageResource(R.drawable.thumbsupimg);
            }
            else {
                int x = 3;//unwanted
                ivThumbs.setImageResource(R.drawable.thumbsdownimg);
            }
            tvScore = (TextView)findViewById(R.id.textViewScore);
            tvScore.setText(Integer.toString(iScore)+"/"+Integer.toString(iCount));

            setNewNumber();
            customHandler.postDelayed(updateTimerThread, iDelay_max);
        }

    }

    private Runnable updateTimerThread = new Runnable()
    {
        public void run()
        {
            //write here whaterver you want to repeat

            if (iCount <= igameLoopCount-1){
                customHandler.postDelayed(this, iDelay_max);
                iCount ++;
                tvScore = (TextView)findViewById(R.id.textViewScore);
                tvScore.setText(Integer.toString(iScore)+"/"+Integer.toString(iCount));
                setNewNumber();
            }
            else {
                restartGame();
                customHandler.removeCallbacks(updateTimerThread);
                openNewActivity();
            }


        }
    };
    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    public void playNumber(int number){

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.one);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.two);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.three);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.four);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.five);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.six);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.seven);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.eight);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.nine);

        switch (number){
            case 1:
                mp1.start();
                break;
            case 2:
                mp2.start();
                break;
            case 3:
                mp3.start();
                break;
            case 4:
                mp4.start();
                break;
            case 5:
                mp5.start();
                break;
            case 6:
                mp6.start();
                break;
            case 7:
                mp7.start();
                break;
            case 8:
                mp8.start();
                break;
            case 9:
                mp9.start();
                break;
            default:
                break;
        }
    }

    public void openNewActivity(){
        Intent intent = new Intent(this, num2_result.class);
        startActivity(intent);
    }

    public void startGame(){

        iScore = 0;
        iCount = 0;
        setNewNumber();
        ivThumbs.setImageDrawable(null);
        customHandler.postDelayed(updateTimerThread, iDelay_max);

        tvScore = (TextView)findViewById(R.id.textViewScore);
        tvScore.setText(Integer.toString(iScore)+"/"+Integer.toString(iCount));

        tvStage = (TextView)findViewById(R.id.textViewStage);
        tvStage.setText("Level " + Integer.toString(iStage));

        Btn1.setEnabled(true);
        Btn1.setClickable(true);

        Btn2.setEnabled(true);
        Btn2.setClickable(true);

        Btn3.setEnabled(true);
        Btn3.setClickable(true);

        Btn4.setEnabled(true);
        Btn4.setClickable(true);

        Btn5.setEnabled(true);
        Btn5.setClickable(true);

        Btn6.setEnabled(true);
        Btn6.setClickable(true);

        Btn7.setEnabled(true);
        Btn7.setClickable(true);

        Btn8.setEnabled(true);
        Btn8.setClickable(true);

        Btn9.setEnabled(true);
        Btn9.setClickable(true);

        BtnPlay.setEnabled(false);
        BtnPlay.setClickable(false);

    }

    public void restartGame(){

        /*
        iScore = 0;iCount = 0;

        tvNumber = (TextView)findViewById(R.id.textViewNum);
        tvNumber.setText(null);

        ivThumbs = (ImageView)findViewById(R.id.imageViewThumbs);
        ivThumbs.setImageDrawable(null);

        tvScore = (TextView)findViewById(R.id.textViewScore);
        tvScore.setText(Integer.toString(iScore)+"/"+Integer.toString(iCount));
    */
        tvStage = (TextView)findViewById(R.id.textViewStage);
        tvStage.setText("Level " + Integer.toString(iStage));

        Btn1.setEnabled(false);
        Btn1.setClickable(false);

        Btn2.setEnabled(false);
        Btn2.setClickable(false);

        Btn3.setEnabled(false);
        Btn3.setClickable(false);

        Btn4.setEnabled(false);
        Btn4.setClickable(false);

        Btn5.setEnabled(false);
        Btn5.setClickable(false);

        Btn6.setEnabled(false);
        Btn6.setClickable(false);

        Btn7.setEnabled(false);
        Btn7.setClickable(false);

        Btn8.setEnabled(false);
        Btn8.setClickable(false);

        Btn9.setEnabled(false);
        Btn9.setClickable(false);

        Button BtnPlay;
        BtnPlay = (Button) findViewById(R.id.buttonPlay);
        BtnPlay.setEnabled(true);
        BtnPlay.setClickable(true);

        tvStage.setText("Level " + Integer.toString(iStage));

    }

}
