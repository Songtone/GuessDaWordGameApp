package com.example.songt.guessdaword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainGame extends AppCompatActivity {

    private WordLibrary mWordLibrary = new WordLibrary();

    private Button mSubmit,mGiveUp,mClue;

    private TextView mClue1,mClue2,mClue3,mClue4,mClue5,mClue6,mWordView;

    private EditText mGuessText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        mSubmit = (Button) findViewById(R.id.submitAnswer);
        mClue = (Button)findViewById(R.id.clueButton);
        mGiveUp = (Button)findViewById(R.id.giveUpButton);

        mWordView = (TextView) findViewById(R.id.word);

        mGuessText = (EditText) findViewById(R.id.userAnswer);

        mClue1 = (TextView) findViewById(R.id.clue1);
        mClue2 = (TextView) findViewById(R.id.clue2);
        mClue3 = (TextView) findViewById(R.id.clue3);
        mClue4 = (TextView) findViewById(R.id.clue4);
        mClue5 = (TextView) findViewById(R.id.clue5);
        mClue6 = (TextView) findViewById(R.id.clue6);

        updateWord();

        mClue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showClue1();
            }
        });
    }
    public void updateWord(){
        mWordView.setText(mWordLibrary.getWord(0));
    }
    public void showClue1(){
        mClue1.setText(mWordLibrary.getClue1(0));
    }
    public void showClue2(){
        mClue1.setText(mWordLibrary.getClue2(0));
    }
    public void showClue3(){
        mClue1.setText(mWordLibrary.getClue3(0));
    }
    public void showClue4(){
        mClue1.setText(mWordLibrary.getClue4(0));
    }
    public void showClue5(){
        mClue1.setText(mWordLibrary.getClue5(0));
    }
    public void showClue6(){
        mClue1.setText(mWordLibrary.getClue6(0));
    }
}
