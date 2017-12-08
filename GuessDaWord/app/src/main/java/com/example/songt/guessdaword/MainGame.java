package com.example.songt.guessdaword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainGame extends AppCompatActivity {

    private WordLibrary mWordLibrary = new WordLibrary();

    private Button mSubmit,mGiveUp,mClue,mNextButton;

    private TextView mClue1,mClue2,mClue3,mClue4,mClue5,mClue6,mWordView,mSucceedView,mRiddleView;

    private EditText mGuessText;

    private int mWordNumber;
    private int numberOfCluesUsed = 0;

    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        mSubmit = (Button) findViewById(R.id.submitAnswer);
        mClue = (Button)findViewById(R.id.clueButton);
        mGiveUp = (Button)findViewById(R.id.giveUpButton);
        mNextButton = (Button) findViewById(R.id.nextButton);

        mWordView = (TextView) findViewById(R.id.word);
        mSucceedView = (TextView) findViewById(R.id.succeedView);
        mRiddleView = (TextView) findViewById(R.id.riddleView);

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
                if(numberOfCluesUsed == 0) {
                    showClue1();
                    numberOfCluesUsed++;
                }
                else if(numberOfCluesUsed == 1){
                    showClue2();
                    numberOfCluesUsed++;
                }
                else if(numberOfCluesUsed == 2){
                    showClue3();
                    numberOfCluesUsed++;
                }
                else if(numberOfCluesUsed == 3){
                    showClue4();
                    numberOfCluesUsed++;
                }
                else if(numberOfCluesUsed == 4){
                    showClue5();
                    numberOfCluesUsed++;
                }
                else if(numberOfCluesUsed == 5){
                    showClue6();
                    numberOfCluesUsed++;
                }
            }
        });

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r = mGuessText.getText().toString();
                String s = mWordLibrary.getWord(mWordNumber);

                if( r.equals(s)){
                    mSucceedView.setText("YAY");
                    mWordView.setVisibility(view.VISIBLE);
                    mNextButton.setVisibility(view.VISIBLE);
                    mGuessText.setVisibility(view.INVISIBLE);
                }else{
                    mSucceedView.setText("Wrong!");
                }
            }
        });
        mGiveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWordView.setVisibility(view.VISIBLE);
                mNextButton.setVisibility(view.VISIBLE);
                mGuessText.setVisibility(view.INVISIBLE);
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateWord();
                mWordView.setVisibility(view.INVISIBLE);
                mNextButton.setVisibility(view.INVISIBLE);
                mGuessText.setVisibility(view.VISIBLE);
                mGuessText.setText("");
                mSucceedView.setText("");
                mClue1.setText("Clue 1");
                mClue2.setText("Clue 2");
                mClue3.setText("Clue 3");
                mClue4.setText("Clue 4");
                mClue5.setText("Clue 5");
                mClue6.setText("Clue 6");
                numberOfCluesUsed = 0;
            }
        });
    }
    public void updateWord(){
        mWordNumber = r.nextInt(mWordLibrary.getWordLibraryLength());
        mWordView.setText(mWordLibrary.getWord(mWordNumber));
        mRiddleView.setText(mWordLibrary.getRiddle(mWordNumber));
    }
    public void showClue1(){
        mClue1.setText(mWordLibrary.getClue1(mWordNumber));
    }
    public void showClue2(){
        mClue2.setText(mWordLibrary.getClue2(mWordNumber));
    }
    public void showClue3(){
        mClue3.setText(mWordLibrary.getClue3(mWordNumber));
    }
    public void showClue4(){
        mClue4.setText(mWordLibrary.getClue4(mWordNumber));
    }
    public void showClue5(){
        mClue5.setText(mWordLibrary.getClue5(mWordNumber));
    }
    public void showClue6(){
        mClue6.setText(mWordLibrary.getClue6(mWordNumber));
    }
}
