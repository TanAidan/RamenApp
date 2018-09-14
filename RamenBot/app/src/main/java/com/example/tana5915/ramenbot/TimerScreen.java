package com.example.tana5915.ramenbot;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimerScreen extends AppCompatActivity {
private TextView countDownText;
private Button startButton;

private CountDownTimer countDownTimer;
private long timeleft;
private boolean timerRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_screen);

        countDownText = findViewById(R.id.countDownText);

        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop();
            }
        });
    }
    public void startStop()
    {
        if(timerRunning)
        {
            stopTimer();

        }
        else
        {
            startTimer();

        }

    }

    public void startTimer()
    {
        countDownTimer = new CountDownTimer() {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        }
    }




}
