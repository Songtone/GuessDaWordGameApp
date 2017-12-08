package com.example.songt.guessdaword;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Scoreboard extends AppCompatActivity {

    private WordLibrary scoreWordLibrary = new WordLibrary();

    private TextView mScore;

    private Button mReplayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        mScore = (TextView)findViewById(R.id.score);

        mReplayButton = (Button)findViewById(R.id.replayButton);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mScore.setText(score+"/"+ scoreWordLibrary.getWordLibraryLength()*6);

        mReplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replay = new Intent(Scoreboard.this,MainGame.class);
                startActivity(replay);
            }
        });
    }
}
