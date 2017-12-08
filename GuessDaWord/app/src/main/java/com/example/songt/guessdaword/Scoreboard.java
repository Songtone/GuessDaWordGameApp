package com.example.songt.guessdaword;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Scoreboard extends AppCompatActivity {

    private WordLibrary scoreWordLibrary = new WordLibrary();

    private TextView mScore;

    private Button mReplayButton;

    private ImageView mLogoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoreboard);

        mScore = (TextView)findViewById(R.id.score);

        mReplayButton = (Button)findViewById(R.id.replayButton);

        Bitmap bMap = BitmapFactory.decodeResource(getResources(), R.drawable.sot_final);
        Bitmap bMapScaled = Bitmap.createScaledBitmap(bMap, 100, 100, true);
        mLogoView = (ImageView) findViewById(R.id.logo);

        mLogoView.setImageBitmap(bMapScaled);

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
