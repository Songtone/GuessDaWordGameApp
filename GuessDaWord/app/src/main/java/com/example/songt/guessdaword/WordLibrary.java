package com.example.songt.guessdaword;

/**
 * Created by songt on 2017-12-07.
 */

public class WordLibrary {

    private String mWordLibrary[] = {
            "water","fire"

    };

    private String mWordClueLibrary [] [] = {
            {"drink","thirsty","liquid","clear","bottle","wet"},
            {"hot","combustion","heat","ignition","burn","inflammable"},

    };

    public String getQuestion(int a){
        String question = mWordLibrary[a];
        return question;
    }

    public String getClue1(int a){
        String clue1 = mWordClueLibrary[a][0];
        return clue1;
    }
    public String getClue2(int a){
        String clue2 = mWordClueLibrary[a][1];
        return clue2;
    }
    public String getClue3(int a){
        String clue3 = mWordClueLibrary[a][2];
        return clue3;
    }
    public String getClue4(int a){
        String clue4 = mWordClueLibrary[a][3];
        return clue4;
    }
    public String getClue5(int a){
        String clue5 = mWordClueLibrary[a][4];
        return clue5;
    }
    public String getClue6(int a){
        String clue6 = mWordClueLibrary[a][5];
        return clue6;
    }


    public String getCorrectAnswer(int a){
        String answer = mWordLibrary[a];
        return answer;
    }
}
