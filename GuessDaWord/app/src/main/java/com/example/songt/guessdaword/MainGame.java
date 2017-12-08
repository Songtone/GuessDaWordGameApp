package com.example.songt.guessdaword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        
    }
}
