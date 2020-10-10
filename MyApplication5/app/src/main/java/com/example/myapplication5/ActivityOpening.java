package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.myapplication5.dummy.DummyContent;

import java.util.Timer;
import java.util.TimerTask;

public class ActivityOpening extends AppCompatActivity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
        song = MediaPlayer.create(this, R.raw.song);
        song.start();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                song.stop();
                finish();
                startActivity(new Intent(ActivityOpening.this, ItemListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);
    }
}