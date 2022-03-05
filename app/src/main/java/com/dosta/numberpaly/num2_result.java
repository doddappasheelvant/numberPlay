package com.dosta.numberpaly;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class num2_result extends AppCompatActivity {

    Button okBtn;
    TextView tvNum;
    TextView tvResultMsg;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().setTitle(num2.gameName); //hide the title bar

        setContentView(R.layout.activity_num2_result);

        tvResultMsg = (TextView) findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageViewStatus);

        if (num2.iScore != num2.iCount){
            tvResultMsg.setTextColor(Color.parseColor("#E74C3C"));
            tvResultMsg.setText("Sorry !! \n Try Again !!");
            imageView.setImageDrawable(null);
            imageView.setBackgroundResource(R.drawable.sad1);
        }
        else{
            num2.iStage++;
            tvResultMsg.setText("Congratulations !! \n You Cleared the Stage...\n" + "\nPlay Stage " + Integer.toString(num2.iStage));
        }

        // button
        okBtn = (Button) findViewById(R.id.buttonOk);
        okBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                num2_result.this.finish();
            }
        });
    }
}
