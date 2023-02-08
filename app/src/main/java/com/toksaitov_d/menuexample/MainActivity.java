package com.toksaitov_d.menuexample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context thisContext = this;
        Button leaderboardButton = findViewById(R.id.leaderboardButton);
        leaderboardButton.setOnClickListener(view -> {
            Intent intent = new Intent(thisContext, LeaderboardActivity.class);
            startActivity(intent);
        });
    }

    public void onSinglePlayerButtonClick(View view) {
        Intent intent = new Intent(this, SinglePlayerActivity.class);
        startActivity(intent);
    }

    public void onMultiplayerPlayerButtonClick(View view) {
        Intent intent = new Intent(this, MultiPlayerActivity.class);
        startActivity(intent);
    }

}